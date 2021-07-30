package study.step3;

public class Study7_11021 {
    public Study7_11021() throws java.io.IOException{
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());

        java.util.StringTokenizer st;

        for (int i = 1; i <= T; i++) {
            st = new java.util.StringTokenizer(br.readLine()," ");
            bw.write("Case #"+i +": " +(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
