import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static ArrayList<int[]> listA = new ArrayList<>();
    static ArrayList<int[]> listB = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        listA.add(new int[]{1,500});
        listA.add(new int[]{3,300});
        listA.add(new int[]{6,200});
        listA.add(new int[]{10,50});
        listA.add(new int[]{15,30});
        listA.add(new int[]{21,10});

        listB.add(new int[]{1,512});
        listB.add(new int[]{3,256});
        listB.add(new int[]{7,128});
        listB.add(new int[]{15,64});
        listB.add(new int[]{31,32});
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int sum=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a!=0 && a<=21) {
                for (int[] ints : listA) {
                    if(a<=ints[0]) {
                        sum+=ints[1];
                        break;
                    }
                }
            }

            if(b!=0 && b<=31){
                for (int[] ints : listB) {
                    if(b<=ints[0]) {
                        sum+=ints[1];
                        break;
                    }
                }
            }

            sb.append(sum*10000).append('\n');
        }
        System.out.println(sb);
    }
}