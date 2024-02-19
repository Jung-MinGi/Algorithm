import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       HashMap<String,int[]> map = new HashMap<>();
       map.put("R",new int[]{0,1});
       map.put("L",new int[]{0,-1});
       map.put("B",new int[]{1,0});
       map.put("T",new int[]{-1,0});
       map.put("RT",new int[]{-1,1});
       map.put("LT",new int[]{-1,-1});
       map.put("RB",new int[]{1,1});
       map.put("LB",new int[]{1,-1});
        String s = st.nextToken();
        int kingCol = s.charAt(0) - 'A';
        int kingRow =8-(s.charAt(1)-'0');
        String a = st.nextToken();
        int rockCol = a.charAt(0) - 'A';
        int rockRow = 8-(a.charAt(1)-'0');
       int n =Integer.parseInt(st.nextToken());
       int[][] arr = new int[8][8];
       while(n-->0){
           String m = br.readLine();
           int[] mv = map.get(m);
           int nx = mv[0]+kingRow;
           int ny = mv[1]+kingCol;
           int x = mv[0]+rockRow;
           int y = mv[1]+rockCol;
           if(nx<0||nx>=8||ny<0||ny>=8)continue;
           //돌 있는 경우
           if(nx==rockRow&&ny==rockCol){
               if(x<0||x>=8||y<0||y>=8)continue;
               kingRow=nx;
               kingCol=ny;
               rockRow=x;
               rockCol=y;
           }else{
               kingRow=nx;
               kingCol=ny;
           }
       }
        System.out.println(((char)(kingCol+'A'))+""+(8-kingRow));
        System.out.println(((char)(rockCol+'A'))+""+(8-rockRow));

    }
}