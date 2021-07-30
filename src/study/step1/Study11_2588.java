package study.step1;

public class Study11_2588 {
    public Study11_2588(){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();

        sc.close();

        System.out.println(a * (b.charAt(2) - '0'));
        System.out.println(a * (b.charAt(1) - '0'));
        System.out.println(a * (b.charAt(0) - '0'));
        System.out.println(a * Integer.parseInt(b));
    }

    public void Study11_25882(){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        System.out.println(a*(b%10));
        System.out.println(a*(b%100/10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }

}
