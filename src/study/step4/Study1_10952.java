package study.step4;

public class Study1_10952 {
    public Study1_10952() throws java.io.IOException{
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        java.util.StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true){
            st = new java.util.StringTokenizer(br.readLine()," ");
            Integer A = Integer.parseInt(st.nextToken());
            Integer B = Integer.parseInt(st.nextToken());

            if(A == 0 && B ==0)
                break;

            sb.append(A + B).append("\n");

        }

        System.out.println(sb);
    }
}
