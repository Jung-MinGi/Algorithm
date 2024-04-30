import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {

static int[] answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int tc = Integer.parseInt(st.nextToken());
        answer = new int[n+1];
        answer[n]=1;
        int[] a = new int[tc+2];
        a[0]=0;
        a[a.length-1]=n;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= tc; i++) {
            a[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                answer[a[j]-a[i]]=1;
            }
        }
//        System.out.println(Arrays.toString(a));
//        for (int i = 1; i <= tc; i++) {
//            backTracking(0,i,0,a,new boolean[tc],new int[i]);
//        }
        for(int i=1;i< answer.length;i++){
            if(answer[i]==0)continue;
            System.out.print(i+" ");
        }
    }
    static void backTracking(int depth,int n,int idx,int[] a,boolean[] visit,int[] ans){
        if(depth==n){
            for(int i=1;i<ans.length;i++){
                answer[ans[i]-ans[i-1]]=1;
            }
            answer[ans[0]]=1;
            answer[answer.length-1-ans[ans.length-1]]=1;
            return;
        }

        for(int i=idx;i<a.length;i++){
            if(!visit[i]){
                ans[depth]=a[i];
                visit[depth]=true;
                backTracking(depth+1,n,i+1,a,visit,ans);
                visit[depth]=false;
            }
        }
    }
}

