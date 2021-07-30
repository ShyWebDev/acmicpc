package study.step3;

public class Study8_11022 {
    public Study8_11022() throws java.io.IOException{
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());

        java.util.StringTokenizer st;

        for (int i = 1; i <= T; i++) {
            st = new java.util.StringTokenizer(br.readLine()," ");
            Integer A = Integer.parseInt(st.nextToken());
            Integer B = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i +": " + A + " + " + B + " = " + (A+B) + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
