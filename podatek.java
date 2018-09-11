import java.util.Scanner;
import java.text.DecimalFormat;
public class podatek {

    private static final int kwota = 85528;
    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args){
        double dochod, podatek;


        System.out.println("Podaj dochod");
        Scanner read = new Scanner(System.in);

        dochod = read.nextDouble();
        if (dochod<kwota || dochod==kwota){
            podatek = (0.18*dochod)-556.02;
        }else{
            podatek = ((dochod-kwota)*0.32)+14839.02;
        }


        System.out.println("Podatek wynosi dochodowy wynosi: "+df2.format(podatek));
    }
}