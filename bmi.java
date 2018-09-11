import java.util.Scanner;
public class bmi {
    public static void main(String[] args){
        double w,h,bmi;

        Scanner read = new  Scanner(System.in);

        System.out.println("Podaj swoja wage");
        w = read.nextDouble();
        System.out.println("Podaj swoj wzrost w metrach");
        h = read.nextDouble();

        bmi = w/(h*h);

        if (bmi<18.5){
            System.out.println("Niedowaga");
        }else if(bmi>24.9){
            System.out.println("Nadwaga");
        }else{
            System.out.println("Waga prawidlowa");
        }
    }
}
