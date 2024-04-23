import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> suit = new ArrayList<>(Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades"));
        ArrayList<String> val = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"));

        int N = sc.nextInt();
        int[][] A = new int[N][52];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 52; j++) {
                A[i][j] = sc.nextInt() - 1;
            }
        }

        int[] B = new int[52];
        for (int i = 0; i < 52; i++) {
            B[i] = i;
        }

        int[] C = new int[52];
        int tc = 0;
        while (sc.hasNext()) {
            int k = sc.nextInt() - 1;
            for (int i = 0; i < 52; i++) {
                C[i] = B[A[k][i]];
            }
            B = Arrays.copyOf(C, 52);
            if (tc > 0) {
                System.out.println();
            }
            for (int x : B) {
                System.out.println(val.get(x % 13) + " of " + suit.get(x / 13));
            }
            tc++;
        }
        sc.close();
    }
}
