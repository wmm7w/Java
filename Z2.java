import java.util.Scanner;
public class Z2 {
    public static void main(String[] args) {

        int a,b;
        int n = 100;
        int sum = 0;
        int i;

        Scanner read = new Scanner(System.in);

        System.out.println("Podaj liczbę a:");
        a = read.nextInt();
        System.out.println("Podaj liczbę b:");
        b = read.nextInt();

        i = a;


        while (i <= b){
            sum = sum + i;
            i++;

            System.out.println(sum);

        }
        for (i = a; i <= b; i++) {
            sum = sum + i;
            if (i==b){
                System.out.println(sum);
            }
        }

    }
}