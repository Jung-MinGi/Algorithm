import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        String[][] arr = new String[n][2];
       for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        StringBuilder sb = new StringBuilder();
        while(m-->0) {
            int attack = Integer.parseInt(br.readLine());
            int low = -1;
            int high = n;
            while(low+1<high){
                int mid = (low+high)/2;
                if(Integer.parseInt(arr[mid][1])<attack){
                    low=mid;
                }else {
                    high=mid;
                }
            }
                sb.append(arr[high][0]).append('\n');
        }
        System.out.println(sb);
    }
}


