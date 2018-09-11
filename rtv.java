import java.util.Scanner;
import java.text.DecimalFormat;
public class rtv {
    private static DecimalFormat df2 = new DecimalFormat(".##");
    public static void main(String [] args){
        double cena, oprocentowanie, odsetki, kapitalowa, rata;
        byte raty;
        Scanner read = new Scanner(System.in);

        System.out.println("Podaj cene towaru");
        cena=read.nextInt();
        while (cena<100 || cena>10000){
            System.out.println("Wprowadz prawidlowa cene (100-10.000 PLN)");
            cena=read.nextInt();
        }

        System.out.println("Podaj ilosc rat");
        raty = read.nextByte();
        while (raty<6 || raty>48){
            System.out.println("Wprowadz prawidlowa ilosc rat (6-48)");
            raty = read.nextByte();
        }

        if(raty<13){
            oprocentowanie = 0.025;
        }else if(raty>12 && raty<25){
            oprocentowanie = 0.05;
        }else{
            oprocentowanie = 0.1;
        }
        kapitalowa = cena/raty;
        odsetki = (cena*oprocentowanie)/raty;
        rata = kapitalowa + odsetki;

        System.out.println("Rata wynosi: "+df2.format(rata));
    }
}
