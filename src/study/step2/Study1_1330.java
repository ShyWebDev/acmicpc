package study.step2;

public class Study1_1330 {
    public Study1_1330(){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        if(a>b)
            System.out.println(">");
        else if(a<b)
            System.out.println("<");
        else if(a==b)
            System.out.println("==");
    }
}
