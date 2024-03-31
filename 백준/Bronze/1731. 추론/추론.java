import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) list.add(Integer.parseInt(br.readLine()));
        Integer a = list.get(0);
        Integer b = list.get(1);

        Integer target = list.get(2);
        boolean flag = false;
        int x = 0;
        if (target == b + b - a) {
            flag = false;
            x = b - a;
        } else {
            flag = true;
            x = b / a;
        }

        if (flag) {
            System.out.println(list.get(list.size() - 1) * x);
        } else System.out.println(list.get(list.size() - 1) + x);
    }
}

