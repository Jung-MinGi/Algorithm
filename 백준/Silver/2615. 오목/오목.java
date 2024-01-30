import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] map = new int[19][19];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<19;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<19;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){
                if(map[i][j]==0)continue;
                if(north(i,j)||betweenNorthAndEast(i,j)||east(i,j)||
                        betweenEastAndSouth(i,j)||south(i,j)||betweenSouthAndWest(i,j)
                        ||west(i,j)||betweenWestAndNorth(i,j)){
                    return;
                }
            }
        }
        System.out.println(0);
    }

    static boolean north(int x,int y){
        int[] arr = new int[5];
        arr[0]=map[x][y];
        for(int i=1;i<5;i++){
            if(x-i<0||map[x-i][y]!=arr[i-1])return false;
            arr[i]=map[x-i][y];
        }
        if(x-5>=0&&map[x-5][y]==arr[0])return false;
        if(x+1<19&&map[x+1][y]==arr[0])return false;
        System.out.println(arr[0]);
        System.out.println((x-3)+" "+(y+1));
        return true;
    }
    static boolean betweenNorthAndEast(int x,int y){
        int[] arr = new int[5];
        arr[0]=map[x][y];
        for(int i=1;i<5;i++){
            if(x-i<0||y+i>18||map[x-i][y+i]!=arr[i-1])return false;
            arr[i]=map[x-i][y+i];
        }
        if(x-5>=0&&y+5<=18&&map[x-5][y+5]==arr[0])return false;
        if(x+1<19&&y-1>=0&&map[x+1][y-1]==arr[0])return false;
        System.out.println(arr[0]);
        System.out.println((x+1)+" "+(y+1));
        return true;
    }
    static boolean east(int x,int y){
        int[] arr = new int[5];
        arr[0]=map[x][y];
        for(int i=1;i<5;i++){
            if(y+i>18||map[x][y+i]!=arr[i-1])return false;
            arr[i]=map[x][y+i];
        }
        if(y+5<=18&&map[x][y+5]==arr[0])return false;
        if(y-1>=0&&map[x][y-1]==arr[0])return false;
        System.out.println(arr[0]);
        System.out.println((x+1)+" "+(y+1));
        return true;
    }
    static boolean betweenEastAndSouth(int x,int y){
        int[] arr = new int[5];
        arr[0]=map[x][y];
        for(int i=1;i<5;i++){
            if(y+i>18||x+i>18||map[x+i][y+i]!=arr[i-1])return false;
            arr[i]=map[x+i][y+i];
        }
        if(y+5<=18&&x+5<=18&&map[x+5][y+5]==arr[0])return false;
        if(x-1>=0&&y-1>=0&&map[x-1][y-1]==arr[0])return false;
        System.out.println(arr[0]);
        System.out.println((x+1)+" "+(y+1));
        return true;
    }
    static boolean south(int x,int y){
        int[] arr = new int[5];
        arr[0]=map[x][y];
        for(int i=1;i<5;i++){
            if(x+i>18||map[x+i][y]!=arr[i-1])return false;
            arr[i]=map[x+i][y];
        }
        if(x+5<=18&&map[x+5][y]==arr[0])return false;
        if(x-1>=0&&map[x-1][y]==arr[0])return false;
        System.out.println(arr[0]);
        System.out.println((x+1)+" "+(y+1));
        return true;
    }
    static boolean betweenSouthAndWest(int x,int y){
        int[] arr = new int[5];
        arr[0]=map[x][y];
        for(int i=1;i<5;i++){
            if(x+i>18||y-i<0||map[x+i][y-i]!=arr[i-1])return false;
            arr[i]=map[x+i][y-i];
        }
        if(x+5<=18&&y-5>=0&&map[x+5][y-5]==arr[0])return false;
        if(x-1>=0&&y+1<=18&&map[x-1][y+1]==arr[0])return false;
        System.out.println(arr[0]);
        System.out.println((x+4+1)+" "+(y-4+1));
        return true;
    }
    static boolean west(int x,int y){
        int[] arr = new int[5];
        arr[0]=map[x][y];
        for(int i=1;i<5;i++){
            if(y-i<0||map[x][y-i]!=arr[i-1])return false;
            arr[i]=map[x][y-i];
        }
        if(y-5>=0&&map[x][y-5]==arr[0])return false;
        if(y+1<19&&map[x][y+1]==arr[0])return false;
        System.out.println(arr[0]);
        System.out.println((x+1)+" "+(y-4+1));
        return true;
    }
    static boolean betweenWestAndNorth(int x,int y){
        int[] arr = new int[5];
        arr[0]=map[x][y];
        for(int i=1;i<5;i++){
            if(y-i<0||x-i<0||map[x-i][y-i]!=arr[i-1])return false;
            arr[i]=map[x-i][y-i];
        }
        if(y-5>=0&&x-5>=0&&map[x-5][y-5]==arr[0])return false;
        if(x+1<19&&y+1<19&&map[x+1][y+1]==arr[0])return false;
        System.out.println(arr[0]);
        System.out.println((x-4+1)+" "+(y-4+1));
        return true;
    }
}