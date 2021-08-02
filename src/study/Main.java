package study;

import study.step1.*;
import study.step2.Study3_2753;
import study.step2.Study5_2884;
import study.step3.*;
import study.step4.Study1_10952;
import study.step4.Study2_10951;
import study.step4.Study3_1110;

public class Main {

    /*
    https://www.acmicpc.net/
    코드제출시 main 함수 사용.
    public class Main {

        public static void main(String[] args) throws java.io.IOException{
            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
            java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(System.out));


            int N = Integer.parseInt(br.readLine());

            java.util.StringTokenizer st;

            st = new java.util.StringTokenizer(br.readLine()," ");
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            java.util.Arrays.sort(arr);
            System.out.print(arr[0] + " " + arr[N - 1]);
        }
    }
    */
    public static void main(String[] args) throws java.io.IOException{
        Study3_1110 test = new Study3_1110();
    }
}
