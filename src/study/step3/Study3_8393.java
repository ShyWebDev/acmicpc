package study.step3;

public class Study3_8393 {
    public Study3_8393(){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;
        for(int i = 1; i<=N; i++){
            result = result + i;
        }
        sc.close();

        System.out.println(result);
    }
}
