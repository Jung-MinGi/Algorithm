import java.util.Scanner;

public class Main {
    
    public static void result() {
        Scanner scanner = new Scanner(System.in);
        int p, w;
        p = scanner.nextInt();
        w = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        String s = scanner.nextLine();
        int size = s.length();
        
        int[] number = {
            2, 2, 2, // ABC
            3, 3, 3, // DEF
            4, 4, 4, // GHI
            5, 5, 5, // JKL
            6, 6, 6, // MNO
            7, 7, 7, 7, // PQRS
            8, 8, 8, // TUV
            9, 9, 9, 9 // WXYZ
        };
        
        int[] press = {
            1, 2, 3, // ABC
            1, 2, 3, // DEF
            1, 2, 3, // GHI
            1, 2, 3, // JKL
            1, 2, 3, // MNO
            1, 2, 3, 4, // PQRS
            1, 2, 3, // TUV
            1, 2, 3, 4 // WXYZ
        };
        
        long time = 0;
        for (int i = 0; i < size; ++i) {
            // Calculate waiting time
            if (i > 0 && Character.isAlphabetic(s.charAt(i)) && Character.isAlphabetic(s.charAt(i - 1))) {
                if (number[s.charAt(i) - 'A'] == number[s.charAt(i - 1) - 'A']) {
                    time += w;
                }
            }
            // Calculate pressing time
            if (Character.isAlphabetic(s.charAt(i))) {
                time += press[s.charAt(i) - 'A'] * p;
            } else {
                time += p;
            }
        }
        System.out.println(time);
        scanner.close();
    }

    public static void main(String[] args) {
        result();
    }
}
