import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static String adrianPattern = "ABC";
    static String brunoPattern = "BABC";
    static String goranPattern = "CCAABB";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String answers = br.readLine();

        int adrianScore = countCorrect(answers, adrianPattern);
        int brunoScore = countCorrect(answers, brunoPattern);
        int goranScore = countCorrect(answers, goranPattern);

        int maxScore = Math.max(Math.max(adrianScore, brunoScore), goranScore);

        System.out.println(maxScore);

        if (adrianScore == maxScore) System.out.println("Adrian");
        if (brunoScore == maxScore) System.out.println("Bruno");
        if (goranScore == maxScore) System.out.println("Goran");
    }

    static int countCorrect(String answers, String pattern) {
        int score = 0;
        int patternLength = pattern.length();
        for (int i = 0; i < answers.length(); i++) {
            char correctAnswer = pattern.charAt(i % patternLength);
            if (answers.charAt(i) == correctAnswer) {
                score++;
            }
        }
        return score;
    }
}
