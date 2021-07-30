package study.step3;

public class Study2_10950 {
    public Study2_10950(){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int T = sc.nextInt();
        int results[] = new int[T];
        for(int i = 0; i<T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            results[i] = A + B;
        }
        sc.close();

        for(int result : results){
            System.out.println( result);
        }
    }
}
