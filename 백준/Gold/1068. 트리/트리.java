import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n = 0;
    static int root = 0;
    static int cnt = 0;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        parent = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < parent.length; i++) {
            parent[i] = Integer.parseInt(st.nextToken());
            if (parent[i] == -1) root = i;
        }


        int removeNode = Integer.parseInt(br.readLine());
        remove(removeNode);
        leafCount(root,new boolean[n]);
        System.out.println(cnt);
    }

    static void leafCount(int parentNodeNum,boolean[] visit) {
        boolean flag = true;
        visit[parentNodeNum]=true;
        for(int i=0;i<n;i++){
            if(parent[parentNodeNum]==Integer.MAX_VALUE)return;
            if(parent[i]==parentNodeNum&&!visit[i]){
                leafCount(i,visit);
                flag=false;
            }
        }
        if(flag)cnt++;
    }

    static void remove(int r) {
        parent[r] = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (parent[i] == r) {
                remove(i);
            }
        }
    }

}