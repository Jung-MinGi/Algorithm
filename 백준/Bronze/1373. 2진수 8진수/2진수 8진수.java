import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] arr = new int[]{1, 2, 4};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        ArrayList<Character> list = new ArrayList<>();
        Deque<String> stack = new ArrayDeque<>();
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            list.add(s.charAt(i));
            if (list.size() == 3 || i == 0) {
                sum = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) == null || list.get(j) == '0') {
                        continue;
                    }
                    sum += arr[j];
                }
                stack.push("" + sum);
               
                list.clear();
            }
        }
        stack.stream().forEach(i -> sb.append(i));
        System.out.println(sb);

    }
}
