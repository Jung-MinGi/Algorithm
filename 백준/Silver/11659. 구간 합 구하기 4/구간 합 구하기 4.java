import javax.print.attribute.standard.Finishings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    static int[] segmentTree;
    static int[] arr;
    static int n = 0;
    static int m = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int i = (int) Math.ceil(Math.log10(n) / Math.log10(2)) + 1;
        segmentTree = new int[(int) Math.pow(2, i)];

        init(1, 1, n);
        while(m-->0){
            st = new StringTokenizer(br.readLine());
            System.out.println(sum(1,1,n,Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }
    }

    static int sum(int node, int start, int end, int left, int right) {
        if(start>right||end<left) return 0;

        if(left<=start&&end<=right){
            return segmentTree[node];
        }

        if(start==end){
            return segmentTree[node];
        }else{
            return sum(node*2,start,(start+end)/2,left,right)
                    +sum(node*2+1,(start+end)/2+1,end,left,right);
        }
    }

    static int init(int node, int start, int end) {
        if (start == end) {
            segmentTree[node] = arr[start];
            return segmentTree[node];
        }

        return segmentTree[node] = init(node * 2, start, (start + end) / 2)
                + init(node * 2 + 1, (start + end) / 2 + 1, end);
    }


}
