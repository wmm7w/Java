import java.util.Scanner;
public class Calc {
    public static void main(String[] args){
        double a,b;
        int s=0;
        String operator="";

        Scanner read = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        System.out.println("Witaj w kalkulatorze");

        System.out.println("Podaj liczbe, wybierz znak dzialania i kolejna liczbe");
        a=read.nextDouble();

        System.out.println("Wybierz dzialanie");
        operator=str.nextLine();

        System.out.println("Podaj druga liczbe");
        b = read.nextDouble();

        switch(operator){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if (b==0){
                    System.out.println("Nie mozna dzielic przez zero");
                    break;
                }else {
                    System.out.println(a / b);
                }
        }
    }
}