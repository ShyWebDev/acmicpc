package study.step3;

public class Study1_2739 {
    public Study1_2739(){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        for(int i = 1; i<=9; i++){
            System.out.println(n + " * " + i +" = " + (n*i));
        }
    }
}
