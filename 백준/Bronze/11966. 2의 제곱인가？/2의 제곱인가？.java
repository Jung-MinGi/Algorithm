import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = false;

        // 정수 입력
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < 31; i++) {
            // Shift연산 결과와 정수 비교
            if(N == (1 << i)) flag = true;
        }

        if(flag) System.out.println(1);
        else System.out.println(0);
    }
}