import java.util.Scanner;
public class onetwothree {
private static int a,b,i,sum;
private static void setvars(){
    sum = 0;
    i = a;
}
    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        System.out.println("Wprowadź a");
        a = read.nextInt();
        System.out.println("Wprowadź b");
        b = read.nextInt();

        setvars();
        while (i<=b){
            sum = sum + i;
            i++;
            if (i>b) {
                System.out.println(sum);
            }
        }

        setvars();
        do {
            sum = sum + i;
            i++;
            if (i>b) {
                System.out.println(sum);
            }
        }while (i<=b);

        setvars();
        for (i=a; i<=b; i++){
            sum = sum + i;
            if(i==b){
                System.out.println(sum);
            }
        }
    }
}