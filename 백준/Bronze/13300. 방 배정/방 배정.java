import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<int[]> man = new ArrayList<>();
    static ArrayList<int[]> women = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            if (i == 0) women.add(new int[]{i, j});
            else man.add(new int[]{i, j});
        }
        Collections.sort(women, (int[] a, int[] b) -> a[1] - b[1]);
        Collections.sort(man, (int[] a, int[] b) -> a[1] - b[1]);
//        ArrayList<ArrayList<int[]>> girl = new ArrayList<>();
        ArrayList<int[]>[] girl = new ArrayList[women.size()];
        for (int i = 0; i < girl.length; i++) {
            girl[i]=new ArrayList<>();
        }
        for (int[] woman : women) {
            for (int i = 0; i <girl.length; i++) {

                if (girl[i].isEmpty()) {
                    girl[i].add(woman);
                    break;
                }
                if(girl[i].size()<k&&girl[i].get(0)[1]==woman[1]){
                    girl[i].add(woman);
                    break;
                }
            }
        }
//        ArrayList<ArrayList<int[]>> boy = new ArrayList<>();
        ArrayList<int[]>[] boy = new ArrayList[man.size()];
        for (int i = 0; i < boy.length; i++) {
            boy[i]=new ArrayList<>();
        }
        for (int[] m : man) {
            for (int i = 0; i < boy.length; i++) {
                if (boy[i].isEmpty()) {
                    boy[i].add(m);
                    break;
                }
                if(boy[i].size()<k&&boy[i].get(0)[1]==m[1]){
                    boy[i].add(m);
                    break;
                }
            }
        }
        int ans=0;
        for (ArrayList<int[]> list : girl) {
            if(!list.isEmpty())ans++;
        }
        for (ArrayList<int[]> list : boy) {
            if(!list.isEmpty())ans++;

        }
        System.out.println(ans);
    }

}
