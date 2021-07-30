package study.step1;

public class Study10_10430 {
    public Study10_10430(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println( (a+b)%c );
        System.out.println( (a%c + b%c)%c );
        System.out.println( (a*b)%c );
        System.out.println( (a%c * b%c)%c );
    }
}
