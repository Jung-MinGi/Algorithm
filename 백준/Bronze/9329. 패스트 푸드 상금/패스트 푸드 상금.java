import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    /**
     * 2(상금의 종류) 10(코치가 가지고 있는 스티커의 종류)
     * 3(해당 상금에 필요한 스티커의 개수) (1 2 3)(해당 상금에 필요한 스티커의 종류) 100
     * 4 4 5 6 7 200
     * 2 3 1 4 5 2 2 1 3 4(코치가 가지고 있는 1부터 m까지 스티커의 개수)
     */
    static int[] sticker;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while (testCase-- > 0) {
            sticker = new int[31];
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int stickerVariety = Integer.parseInt(st.nextToken());
            String[] prize = new String[n];
            for (int i = 0; i < n; i++) {
                prize[i] = br.readLine();
            }
            Arrays.sort(prize, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int x = Integer.parseInt(o1.split(" ")[o1.split(" ").length - 1]);
                    int y = Integer.parseInt(o2.split(" ")[o2.split(" ").length - 1]);
                    return y - x;
                }
            });

            st = new StringTokenizer(br.readLine());
            for(int i=1;i<=stickerVariety;i++){
                sticker[i]=Integer.parseInt(st.nextToken());
            }
            System.out.println(calcutor(prize));

        }
    }

    static int calcutor(String[] prize) {
        int answer = 0;
        for (int i = 0; i < prize.length; i++) {
            String s = prize[i];
            String[] arr = s.split(" ");
            int stickerNum = Integer.parseInt(arr[0]);
            int[] requiredSticker = new int[stickerNum];
            for (int j = 0; j < stickerNum; j++) {
                requiredSticker[j] = Integer.parseInt(arr[j + 1]);
            }
            boolean flag = false;
            int min = 999999;
            for (int k = 0; k < requiredSticker.length; k++) {
                int tmp = sticker[requiredSticker[k]];
                if (tmp == 0) {
                    flag = true;
                    break;
                }
                min = Math.min(min, tmp);
            }
            if (!flag) {
                for (int k = 0; k < requiredSticker.length; k++) {
                    sticker[requiredSticker[k]] -= min;
                }
                answer += (Integer.parseInt(arr[arr.length - 1]) * min);
            }
        }
        return answer;
    }
}