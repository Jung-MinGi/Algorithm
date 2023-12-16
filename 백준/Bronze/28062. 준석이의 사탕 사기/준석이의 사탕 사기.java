import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
          if(tmp%2==0)answer+=tmp;
          else arr.add(tmp);
        }
        Collections.sort(arr,(a,b)->b-a);
        int size = arr.size();
        if(size%2!=0)size--;

        for(int i=0;i<size;i++){
            answer+=arr.get(i);
        }
        System.out.println(answer);
    }

}
