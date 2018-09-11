import java.util.Scanner;

class onetwothree {

private static int a,i,sum;

private static void setvars() {
    sum = 0;
    i = a;
}

private static void licz() {
    sum = sum+i;
    i++;
}

private static void printsum() {
    System.out.println(sum);
}

    public static void main(String[] args) {

    int b;

        Scanner read = new Scanner(System.in);

        System.out.println("Wprowadź a");
        a = read.nextInt();
        System.out.println("Wprowadź b");
        b = read.nextInt();

        setvars();
        while (i<=b) {
            licz();
            if (i>b) {
                printsum();
            }
        }

        setvars();
        do {
            licz();
            if (i>b) {
                printsum();
            }
        }while (i<=b);

        setvars();
        for (i=a; i<=b; i++){
            sum = sum + i;
            if(i==b) {
                printsum();
            }
        }
    }
}