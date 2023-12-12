import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr;
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int idx = Integer.parseInt(st.nextToken());
            arr = new Integer[size];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int idxNum=arr[idx];
            Queue<Integer> q = new LinkedList<>();
            for (Integer i : arr) {
                q.add(i);
            }
            if (size == 1) {
                System.out.println(1);
                continue;
            }

            Arrays.sort(arr,(a,b)->b-a);
            int importantPaper = arr[0];
            int count=0;
            while(true){
                Integer poll = q.poll();
                if(idx==0&&idxNum==poll&&idxNum==importantPaper){
                    count++;
                    System.out.println(count);
                    break;
                }
                if(poll==importantPaper){
                    count++;
                    importantPaper=arr[count];

                }
                else{
                    q.add(poll);
                }
                if(idx!=0){
                    idx--;
                }else{
                    idx=q.size()-1;
                }
            }
        }
    }

}
