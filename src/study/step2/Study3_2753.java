package study.step2;

public class Study3_2753 {
    public Study3_2753(){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();

        sc.close();

        if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0))
            System.out.println("1");
        else
            System.out.println("0");

    }
}
