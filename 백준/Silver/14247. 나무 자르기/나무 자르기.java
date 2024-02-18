import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * TWOTHEREFOURFIVESXISEEVNEIGTHNNIE
 * 01
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Long[] growth = new Long[n];
        Long[] current = new Long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            current[i]=Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            growth[i]=Long.parseLong(st.nextToken());
        }
        ArrayList<Long[]> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Long[]{growth[i],current[i]});
        }
        long answer=0;
        Collections.sort(list, new Comparator<Long[]>() {
            @Override
            public int compare(Long[] a, Long[] b) {
                return (int)(a[0]-b[0]);
            }
        });
        for(int i=0;i<n;i++){
            Long[] integers = list.get(i);
            answer+=((long) i *integers[0])+integers[1];
        }
        System.out.println(answer);
    }
}