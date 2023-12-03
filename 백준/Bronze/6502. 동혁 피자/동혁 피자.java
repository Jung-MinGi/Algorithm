import jdk.dynalink.beans.StaticClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int cnt=0;
       StringBuilder sb = new StringBuilder();
        while(true){
            cnt++;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            if(r==0)break;
            int w = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            if(Math.pow(r*2,2)>=(Math.pow(w,2)+Math.pow(l,2))){
                sb.append("Pizza ").append(cnt).append(" fits on the table.").append('\n');
            }else{
                sb.append("Pizza ").append(cnt).append(" does not fit on the table.").append('\n');
            }
        }
        System.out.println(sb);
    }

}



