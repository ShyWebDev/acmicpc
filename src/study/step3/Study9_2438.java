package study.step3;

public class Study9_2438 {
    public Study9_2438() throws java.io.IOException{
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
