import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[][] arr;
    static int n = 0;
    static int a = 0;
    static int b = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(br.readLine());
        arr = new boolean[b][a];
        arr[b-1][0]=true;
        if(n>a*b){
            System.out.println(0);
            return;
        }
        recursive(1,1,1,"up",b-1,0);
    }

    static void recursive(int cnt, int x, int y, String dir,int ansX,int ansY) {
        if (cnt == n) {
            System.out.println(x + " " + y);
            return;
        }
        String direction = direction(dir, ansX, ansY);
        switch (direction) {
            case "up":
                arr[ansX-1][ansY]=true;
                recursive(cnt + 1, x, y+1,direction,ansX-1,ansY);
                break;
            case "right":
                arr[ansX][ansY+1]=true;
                recursive(cnt+1,x+1,y,direction,ansX,ansY+1);
                break;
            case "left":
                arr[ansX][ansY-1]=true;
                recursive(cnt+1,x-1,y,direction,ansX,ansY-1);
                break;
            case "down":
                arr[ansX+1][ansY]=true;
                recursive(cnt+1,x,y-1,direction,ansX+1,ansY);
                break;
        }
    }

    static String direction(String dir, int x, int y) {
        if (dir.equals("up")){
            if(x-1<0||arr[x-1][y]) return "right";
        }
        else if(dir.equals("right")){
            if(y+1>=a||arr[x][y+1])return "down";
        }else if(dir.equals("down")){
            if(x+1>=b||arr[x+1][y])return "left";
        }else{
            if(y-1<0||arr[x][y-1])return "up";
        }
        return dir;
    }
}