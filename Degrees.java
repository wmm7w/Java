import java.util.Scanner;
public class Degrees {
    public static void main(String[] args){
        double c,f;

        Scanner read = new Scanner(System.in);

        System.out.println("Witaj w programie do konwersji stopni Celsjusza na Fahrenheita");
        System.out.println();
        System.out.println("Podaj stopnie Celsjusza");
        c = read.nextDouble();
        f = (1.8*c)+32;

        System.out.println(c+" stopni Celsjusza to "+f+" stopni Fahrenheita");
    }
}
