package study;

import study.step1.*;
import study.step2.Study3_2753;
import study.step2.Study5_2884;
import study.step3.*;

public class Main {

    /*
    https://www.acmicpc.net/
    코드제출시 main 함수 사용.
    public class Main {

        public static void main(String[] args) throws java.io.IOException{
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
    */
    public static void main(String[] args) throws java.io.IOException{
        Study8_11022 test = new Study8_11022();
    }
}
