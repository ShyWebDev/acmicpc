package study.step4;

public class Study3_1110 {
    public Study3_1110() throws java.io.IOException{
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str;
        if(  N < 10 ){
            str = "0"+N;
        }else{
            str = String.valueOf(N);
        }

        int result=0;
        int count = 0 ;
        while( true ){
            int sum =  Integer.valueOf(String.valueOf(str.toCharArray()[0])) +  Integer.valueOf(String.valueOf(str.toCharArray()[1]));

            if( sum < 10) {
                count = count +1 ;
                str = str.toCharArray()[1] + String.valueOf(sum);
            }
            else{
                count = count +1 ;
                String newStr = String.valueOf(sum);
                str = String.valueOf(str.toCharArray()[1]) + String.valueOf(newStr.toCharArray()[1]);
            }


            if( Integer.valueOf(N) == Integer.valueOf(str))
                break;



        }
        System.out.println(count);
    }

    public void Study3_1110() throws java.io.IOException{
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int temp = N;
        int result=0;
        int count = 0 ;
        while( true ){
            int ten = N/10;
            int one = N%10;
            int sum = ten+one;
            String str = "";
            str += one;
            str += sum%10;
            N = Integer.parseInt(str);
            count++;
            if(temp==N)break;

        }
        System.out.println(count);
    }
}
