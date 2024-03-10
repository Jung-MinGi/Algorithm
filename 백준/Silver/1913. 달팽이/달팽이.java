import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        int k  = Integer.parseInt(br.readLine());
        int x=n/2;
        int y=n/2;
        arr[n/2][n/2]=1;
        String direction = "right";
        int idx=2;
        int currentX=n/2-1;
        int currentY=n/2;
        while(true){
            if(idx==k){
                x=currentX;
                y=currentY;
            }
            if(idx==n*n+1)break;
            switch (direction){
                case "up":
                    if(arr[currentX][currentY+1]!=0){
                        arr[currentX][currentY]=idx;
                        currentX--;
                    }else{
                        arr[currentX][currentY]=idx;
                        direction="right";
                        currentY++;
                    }
                    idx++;
                    break;
                case "right":
                    if(arr[currentX+1][currentY]!=0){
                        arr[currentX][currentY]=idx;
                        currentY++;
                    }else{
                        arr[currentX][currentY]=idx;
                        direction="down";
                        currentX++;
                    }
                    idx++;
                    break;
                case "down":
                    if(arr[currentX][currentY-1]!=0){
                        arr[currentX][currentY]=idx;
                        currentX++;
                    }else{
                        arr[currentX][currentY]=idx;
                        direction="left";
                        currentY--;
                    }
                    idx++;
                    break;
                case "left":
                    if(arr[currentX-1][currentY]!=0){
                        arr[currentX][currentY]=idx;
                        currentY--;
                    }else{
                        arr[currentX][currentY]=idx;
                        direction="up";
                        currentX--;
                    }
                    idx++;
                    break;
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sb.append(anInt).append(' ');
            }sb.append('\n');
        }
        System.out.print(sb);
        System.out.println((x+1)+" "+(1+y));
    }

}


