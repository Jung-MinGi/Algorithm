import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static int[] stack;
    public static int size=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        stack = new int[n];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "push":
                   push(Integer.parseInt(st.nextToken()));
                   break;
                case "pop":
                    int a = pop();
                    sb.append(a).append('\n');
                    break;
                case "top":
                    int b = top();
                    sb.append(b).append('\n');
                    break;
                case "size":
                    int c = size();
                    sb.append(c).append('\n');
                    break;
                case "empty":
                    int d = empty();
                    sb.append(d).append('\n');
                    break;

            }

        }
        System.out.println(sb);
    }

    public static void push(int item){
        stack[size] = item;
        size++;
    }
    public static int pop(){
        if(size != 0){
            int temp = stack[size-1];
            stack[size-1]=0;
            size--;
            return temp;

        }else{
            return -1;
        }
    }
    public static int top(){
        if(size != 0){
            int temp = stack[size-1];

            return temp;

        }else{
            return -1;
        }
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        if(size==0){
            return 1;
        }else{
            return 0;
        }
    }

}