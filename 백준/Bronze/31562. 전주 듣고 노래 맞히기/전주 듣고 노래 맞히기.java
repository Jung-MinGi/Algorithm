import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m =Integer.parseInt(st.nextToken());
        int n =Integer.parseInt(st.nextToken());
        String[][] a = new String[m][2];
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            String title = st.nextToken();
            StringBuilder sb = new StringBuilder();
            while(st.hasMoreTokens())sb.append(st.nextToken());
            a[i]=new String[]{title,sb.toString()};
        }

        while(n-->0){
            String s = br.readLine().replace(" ", "");
            soultion(s, a);

        }
    }
    static void soultion(String a,String[][] arr){
       int ret=0;
        ArrayList<String> list = new ArrayList<>();
        for (String[] strings : arr) {
            String s = strings[1].substring(0,3);
            if(s.equals(a)){
                list.add(strings[0]);
                ret++;
            }
        }
        if(ret==1){
            System.out.println(list.get(0));
        }else if(ret==0){
            System.out.println("!");
        }else System.out.println("?");
    }
}

