package study.step2;

public class Study2_9498 {
    public Study2_9498(){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();

        sc.close();

        if(a>=90 && a<=100)
            System.out.println("A");
        else if(a>=80 && a<=89)
            System.out.println("B");
        else if(a>=70 && a<=79)
            System.out.println("C");
        else if(a>=60 && a<=69)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
