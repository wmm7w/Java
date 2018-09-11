import java.util.Scanner;
public class minmax {
    public static void main(String[] args){
        int a,b,c, max,min;
        Scanner read = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe");
        a = read.nextInt();

        System.out.println("Podaj druga liczbe");
        b = read.nextInt();
        if (b==a) {
            while (b == a) {
                System.out.println("Liczba musi byc rozna od pozostalych");
                b = read.nextInt();
            }
        }

        System.out.println("Podaj trzecia liczbe");
        c = read.nextInt();
        if ((c==a) || (c==b)){
        while (c==a || c==b){
            System.out.println("Liczba musi byc rozna od pozostalych");
            c = read.nextInt();
        }}


        if(a>b && a>c){
            max = a;
        }else if(b>a && b>c){
            max = b;
        }else{
            max = c;
        }

        if(a<b && a<c){
            min = a;
        }else if(b<a && b<c){
            min = b;
        }else{
            min = c;
        }

        System.out.println("Najmniejsza liczba to: "+min+" a najwieksza to: "+max);
    }
}
