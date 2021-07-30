package study.step2;

public class Study4_14681 {
    public Study4_14681(){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.close();

        if(x > 0 && y > 0)
            System.out.println("1");
        if(x < 0 && y > 0)
            System.out.println("2");
        if(x < 0 && y < 0)
            System.out.println("3");
        if(x > 0 && y < 0)
            System.out.println("4");
    }
}
