import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y,h,wynik,select;

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Witaj w programie do liczenia pol figur");
        System.out.println();
        System.out.println("Wcisnij 1 - kwadrat, 2 - prostokat, 3 - trojkat");

        select = odczyt.nextInt();

        switch (select) {
            case 1:
                System.out.println("Podaj bok x");
                x = odczyt.nextInt();
                wynik = x*x;
                System.out.println("Wynik wynosi: "+wynik);
                break;
            case 2:
                System.out.println("Podaj bok x");
                x = odczyt.nextInt();
                System.out.println("Podaj bok y");
                y = odczyt.nextInt();
                wynik = x*y;
                System.out.println("Wynik wynosi: "+wynik);
                break;
            case 3:
                System.out.println("Podaj bok x");
                x = odczyt.nextInt();
                System.out.println("Podaj wysokosc trojkata");
                h = odczyt.nextInt();
                wynik = (x*h)/2;
                System.out.println("Wynik wynosi: "+wynik);
                break;
        }
    }
}