import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


class Main {
    static boolean[] arr = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        primeNum();
        int n;
        StringBuilder sb = new StringBuilder();
        while((n=Integer.parseInt(br.readLine()))!=0){
            for(int i=3;i<arr.length;i++){
                if(i>n){
                    sb.append("Goldbach's conjecture is wrong.").append('\n');
                    break;
                }
                if(arr[i])continue;
                int tmp = n-i;
                if(!arr[i]&&!arr[tmp]){
                    sb.append(n).append(" = ").append(i).append(" + ").append(tmp).append('\n');
                    break;
                }
            }
        }
        System.out.println(sb);

    }

    static void primeNum() {
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if(i%2==0)arr[i]=true;
            if (!arr[i]) {//false==prime
                for (int j = i * 2; j < arr.length; j = j + i) {
                    arr[j] = true;
                }

            }
        }
    }
}


