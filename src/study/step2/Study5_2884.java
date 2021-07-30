package study.step2;

public class Study5_2884 {
    public Study5_2884(){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        sc.close();

        if(M < 45 ){
            H = H - 1;
            M = 60 - 45+ M;

            if( H < 0)
                H = 23;
        }
        else{
            M = M - 45;
        }

        System.out.println(H + " " + M);


    }
}
