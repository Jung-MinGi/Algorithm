import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int getValue(String card) {
        switch (card) {
            case "A":
                return 11;
            case "T":
            case "K":
            case "Q":
            case "J":
                return 10;
            default:
                return Integer.parseInt(card);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            String[] input = br.readLine().split(" ");
            String d = input[0];
            String p1 = input[1];
            String p2 = input[2];

            int d_ = getValue(d);
            int p1_ = getValue(p1);
            int p2_ = getValue(p2);

            int[] deck = new int[12];
            for (int i = 2; i <= 11; i++) {
                deck[i] = n * 4;
            }
            deck[10] *= 4;
            deck[d_] -= 1;
            deck[p1_] -= 1;
            deck[p2_] -= 1;

            if (p1_ == 11 && p2_ == 11) {
                p2_ = 1;
            }

            int sum = 0, prob = 0;
            for (int i = 2; i <= 11; i++) {
                sum += deck[i];
            }

            for (int i = 2; i <= 11; i++) {
                int choosed = i;
                if (d_ == 11 && i == 11) {
                    choosed = 1;
                }

                if (d_ + choosed < p1_ + p2_) {
                    prob += deck[i];
                }
            }

            double answer = ((double) prob / sum )* 100;
            System.out.printf("%.3f%%\n", answer);
        }
    }
}
