package study.step4;

public class Study2_10951 {
    public Study2_10951() throws java.io.IOException{
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        java.util.StringTokenizer st;
        String str;

        while( (str=br.readLine()) != null ){

            st = new java.util.StringTokenizer(str," ");
            Integer A = Integer.parseInt(st.nextToken());
            Integer B = Integer.parseInt(st.nextToken());
            sb.append(A + B).append("\n");

        }

        System.out.println(sb);
    }
}
