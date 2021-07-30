package study.step3;

public class Study6_2742 {
    public Study6_2742() throws java.io.IOException{
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());

        for (int i = N; i >= 1; i--) {
            bw.write(i + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
