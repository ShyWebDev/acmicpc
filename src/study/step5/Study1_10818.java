package study.step5;


public class Study1_10818 {
    public Study1_10818() throws java.io.IOException{
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
