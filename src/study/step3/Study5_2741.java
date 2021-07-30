package study.step3;

public class Study5_2741 {
    public Study5_2741() throws java.io.IOException{
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N; i++) {
            bw.write(i + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
