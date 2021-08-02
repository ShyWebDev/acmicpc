package study.step3;

public class Study11_10871 {
    public Study11_10871() throws java.io.IOException{
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(System.out));

        java.util.StringTokenizer st = new java.util.StringTokenizer(br.readLine()," ");

        Integer N = Integer.parseInt(st.nextToken());
        Integer X = Integer.parseInt(st.nextToken());


        st = new java.util.StringTokenizer(br.readLine()," ");

        for (int i = 0; i < N; i++) {
            Integer value = Integer.parseInt(st.nextToken());

            if( value < X){
                bw.write(value + " " );
            }
        }

        br.close();

        bw.flush();
        bw.close();

    }
}
