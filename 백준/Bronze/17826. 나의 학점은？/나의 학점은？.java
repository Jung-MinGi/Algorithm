import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score = {5, 10, 15, 5, 10, 3, 2};
        int[] a = new int[50];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 50; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int n = Integer.parseInt(br.readLine());
        int idx = 0;
        int tmp=score[idx];
        for (int i = 0; i < 50; i++) {
            if(a[i]==n){
                switch (idx){
                    case 0:
                        System.out.println("A+");
                        break;
                    case 1:
                        System.out.println("A0");
                        break;
                    case 2:
                        System.out.println("B+");
                        break;
                    case 3:
                        System.out.println("B0");
                        break;
                    case 4:
                        System.out.println("C+");
                        break;
                    case 5:
                        System.out.println("C0");
                        break;
                    case 6:
                        System.out.println("F");
                        break;
                }
                break;

            }else{
                tmp--;
                if(tmp==0){
                    idx++;
                    tmp=score[idx];
                }
            }
        }

    }
}

