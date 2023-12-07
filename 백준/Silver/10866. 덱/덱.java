import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    private static int[] deque = new int[10000];
    private static int front = 0;
    private static int back = 0;
    private static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            String[] arr = br.readLine().split(" ");
            String s = arr[0];
            switch (s){
                case "push_front" : {
                    push_front(Integer.parseInt(arr[1]));
                    break;
                }

                case "push_back" : {
                    push_back(Integer.parseInt(arr[1]));
                    break;
                }

                case "pop_front" : {
                    System.out.println(pop_front());
                    break;
                }

                case "pop_back" : {
                    System.out.println(pop_back());
                    break;
                }

                case "size" : {
                    System.out.println(size());
                    break;
                }

                case "empty" : {
                    System.out.println(empty());
                    break;
                }

                case "front" : {
                   front();
                    break;
                }

                case "back" : {
                    back();
                    break;
                }
            }
        }
    }

    static void push_front(int n) {
        deque[front] = n;
        front = (front - 1 + deque.length) % deque.length;
        size++;
    }

    static void push_back(int n) {
        back = (back + 1) % deque.length;
        deque[back] = n;
        size++;

    }

    static int pop_front() {
        if (size == 0) return -1;
        front = (front + 1) % deque.length;
        int tmp = deque[front];
        size--;
        return tmp;
    }

    static int pop_back() {
        if (size == 0) return -1;
        int tmp = deque[back];
        back = (back-1+ deque.length)%deque.length;
        size--;
        return tmp;
    }
    static int size(){return size;}

    static int empty(){
        if(size==0)return 1;
        else return 0;
    }
    static void front(){
        if (size == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(deque[(front+1)% deque.length]);
    }
    static void back(){
        if (size == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(deque[back]);
    }
}



