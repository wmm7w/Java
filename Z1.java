import java.util.Scanner;
public class Z1 {
    public static void main(String[] args){
        int a;
        Scanner read = new Scanner(System.in);

        System.out.println("Podaj liczbe a");
        a = read.nextInt();

        for (int i=1; i<=a; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
