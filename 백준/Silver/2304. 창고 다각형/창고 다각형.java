import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] arr;
    static int[] height;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            max = Math.max(a, max);
            list.add(new int[]{a, b});
        }
        arr = new boolean[max + 1];
        Stack<Integer> stack = new Stack<>();
        Collections.sort(list, (int[] a, int[] b) -> a[0] - b[0]);
        int x = list.get(0)[0];
        int height = list.get(0)[1];
        stack.add(0);
        arr[x] = true;
        for (int i = 1; i < n; i++) {
            int tmpX = list.get(i)[0];
            int tmpHeight = list.get(i)[1];
            if (tmpHeight >= height || i == n - 1) {
                x = tmpX;
                height = tmpHeight;
                arr[x] = true;
                stack.add(i);
                continue;
            }
            //현재 인덱스가 이전보다 작은데 선택가능할려면 이후에 나오는 모든 기둥이 현재 인덱스보다 작아야됨
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                int b = list.get(j)[1];
                if (tmpHeight < b) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                x = tmpX;
                height = tmpHeight;
                arr[x] = true;
                stack.add(i);
            }
        }
        Integer pop = stack.pop();
        int sum = 0;
        int choiceX = list.get(pop)[0];
        int choiceHeight = list.get(pop)[1];
        if(stack.isEmpty()){
            System.out.println(choiceHeight);
            return;
        }
        while (true) {
            Integer a = stack.pop();
            if (list.get(a)[1] >= choiceHeight) {
                sum += ((choiceX + 1) - (list.get(a)[0] + 1)) * choiceHeight;
                choiceX = list.get(a)[0];
                choiceHeight = list.get(a)[1];
                if (stack.isEmpty()) {
                    sum += list.get(a)[1];
                    break;
                }
            } else {
                sum += choiceHeight+((choiceX - (list.get(a)[0] + 1)) * list.get(a)[1]);

                choiceX = list.get(a)[0];
                choiceHeight = list.get(a)[1];
                if (stack.isEmpty()) {
                    sum += list.get(a)[1];
                    break;
                }
            }

        }
        System.out.println(sum);
    }
}
