import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Main {
    static int[] queue = new int[10000];
    static int front = 0;
    static int rear = 0;
    static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s){
                case "push":{
                    push(Integer.parseInt(st.nextToken()));
                    break;
                }case "pop":{
                    int pop = pop();
                    System.out.println(pop);
                    break;
                }case "size":{
                    int a = size();
                    System.out.println(a);
                    break;
                }case "empty":{
                    System.out.println(empty());
                    break;
                }case "front":{
                    System.out.println(front());
                    break;
                }case "back":{
                    System.out.println(back());
                    break;
                }
            }
        }
    }

    static void push(int n) {
        queue[rear] = n;
        rear = (rear + 1) % 10000;
        size++;
    }

    static int pop() {
        if (size == 0) return -1;
        int tmp = queue[front];
        queue[front] = 0;
        front = (front + 1) % 10000;
        size--;
        return tmp;
    }

    static int size() {
        return size;
    }

    static int empty() {
        if (size == 0) return 1;
        return 0;
    }

    static int front() {
        if (size == 0) return -1;
        return queue[front];
    }

    static int back() {
        if (size == 0) return -1;
        return queue[(rear-1) % 10000];
    }

}
