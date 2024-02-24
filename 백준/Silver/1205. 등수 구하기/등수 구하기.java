import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, newScore, p;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        newScore = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        Integer[][] arr = new Integer[p][2];
        if (n > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
        }
        Collections.sort(list, (Integer a, Integer b) -> b - a);
        if (!list.isEmpty()) {
            arr[0] = new Integer[]{list.get(0), 1};
        }
        for (int i = 1; i < list.size(); i++) {
            int rank = 0;
            if (Objects.equals(arr[i - 1][0], list.get(i))) {
                rank = arr[i - 1][1];
            } else rank += i + 1;
            arr[i] = new Integer[]{list.get(i), rank};
        }
        boolean flag=false;
        if(n==0){
            System.out.println(1);
            return;
        }
        for(int i=0;i<list.size();i++){
            if(i==0&&list.get(i) < newScore){
                System.out.println(i+1);
                flag=true;
                break;
            }

            if(list.get(i) <newScore){
                //앞에꺼랑 같은 경우
                if(list.get(i-1)==newScore){
                    if(i<p){
                        System.out.println(arr[i-1][1]);
                        flag=true;
                        break;
                    }else {
                        System.out.println(-1);
                        flag=true;
                        break;
                    }
                }
                //앞에꺼랑 다른 경우
                else{
                    System.out.println(arr[i][1]);
                    flag=true;
                    break;
                }
            }
        }
        if(!flag&&n<p){
            if(arr[n-1][0]==newScore){
                System.out.println(arr[n-1][1]);
            }else {
                System.out.println(n+1);
            }
            return;
        }
        if(!flag){
            System.out.println(-1);
        }
    }
}
