import java.util.Scanner;
public class onetwothree {
    public static void main(String[] args){
        int a,b,i,sum;

        Scanner read = new Scanner(System.in);

        System.out.println("Wprowadź a");
        a = read.nextInt();
        System.out.println("Wprowadź b");
        b = read.nextInt();

        sum = 0;
        i = a;
        while (i<=b){
            sum = sum + i;
            i++;
            if (i>b) {
                System.out.println(sum);
            }
        }

        sum = 0;
        i = a;

        do {
            sum = sum + i;
            i++;
            if (i>b) {
                System.out.println(sum);
            }
        }while (i<=b);

        sum = 0;
        i = a;

        for (i=a; i<=b; i++){
            sum = sum + i;
            if(i==b){
                System.out.println(sum);
            }
        }
    }
}