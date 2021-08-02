package study.step3;

public class Study10_2439 {
    public Study10_2439() throws java.io.IOException{
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N-i; j++) {
                bw.write(" ");
            }
            for( int k = 0 ; k < i ; k++ ){
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();

        bw.flush();
        bw.close();

    }
}
