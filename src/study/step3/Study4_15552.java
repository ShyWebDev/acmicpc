package study.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Study4_15552 {
    public Study4_15552() throws java.io.IOException{
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());

        java.util.StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new java.util.StringTokenizer(br.readLine()," ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
        }

        br.close();

        bw.flush();
        bw.close();


    }
}
