import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            if(x==0)break;
            int y = Integer.parseInt(st.nextToken());
            double w = Double.parseDouble(st.nextToken()) / 2;

            ArrayList<Double> nx = new ArrayList<>();
            ArrayList<Double> ny = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            while (x-- > 0) nx.add(Double.parseDouble(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            while (y-- > 0) ny.add(Double.parseDouble(st.nextToken()));
            Collections.sort(nx);
            Collections.sort(ny);
            boolean flag=false;
            for (int i = 0; i < nx.size() - 1; i++) {
                if (nx.get(i) + w < nx.get(i + 1)-w) {
                    System.out.println("NO");
                    flag=true;
                    break;
                }
            }
            if(!flag){
                if (nx.get(0) - w <= 0 && nx.get(nx.size() - 1) + w >= 75) {
                    for (int i = 0; i < ny.size() - 1; i++) {
                        if (ny.get(i) + w < ny.get(i + 1)-w) {
                            System.out.println("NO");
                            flag=true;
                            break;
                        }
                    }
                    if(!flag){
                        if (ny.get(0) - w <= 0 && ny.get(ny.size() - 1) + w >= 100) {
                            System.out.println("YES");
                        } else System.out.println("NO");
                    }
                } else System.out.println("NO");
            }

        }
    }
}
