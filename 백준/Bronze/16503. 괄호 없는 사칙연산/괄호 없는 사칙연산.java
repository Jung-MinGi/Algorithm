import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<String> a = new ArrayList<>();
        while (st.hasMoreTokens()) a.add(st.nextToken());
        int x = 0;
        int y = 0;
        int q = Integer.parseInt(a.get(0));
        int w = Integer.parseInt(a.get(2));
        int e = Integer.parseInt(a.get(4));
        String oper1 = a.get(1);
        String oper2 = a.get(3);
        x = operator(oper1, oper2, q,w,e);
        y = operator2(oper2, oper1, w,e,q);
        System.out.println(Math.min(x, y));
        System.out.println(Math.max(x, y));
    }

    private static int operator(String oper1, String oper2, int q,int w,int e) {

        int sum = 0;
        switch (oper1) {
            case "+":
                sum = q + w;
                switch (oper2) {
                    case "+":
                        sum += e;
                        break;
                    case "*":
                        sum *= e;
                        break;
                    case "-":
                        sum -= e;
                        break;
                    case "/":
                        sum /= e;
                        break;
                }
                break;
            case "*":
                sum = q * w;
                switch (oper2) {
                    case "+":
                        sum += e;
                        break;
                    case "*":
                        sum *= e;
                        break;
                    case "-":
                        sum -= e;
                        break;
                    case "/":
                        sum /= e;
                        break;
                }
                break;
            case "-":
                sum = q - w;
                switch (oper2) {
                    case "+":
                        sum += e;
                        break;
                    case "*":
                        sum *= e;
                        break;
                    case "-":
                        sum -= e;
                        break;
                    case "/":
                        sum /= e;
                        break;
                }
                break;
            case "/":
                sum = q / w;
                switch (oper2) {
                    case "+":
                        sum += e;
                        break;
                    case "*":
                        sum *= e;
                        break;
                    case "-":
                        sum -= e;
                        break;
                    case "/":
                        sum /= e;
                        break;
                }
                break;
        }
        return sum;
    }
    private static int operator2(String oper1, String oper2, int q,int w,int e) {

        int sum = 0;
        switch (oper1) {
            case "+":
                sum = q + w;
                switch (oper2) {
                    case "+":
                        sum += e;
                        break;
                    case "*":
                        sum *= e;
                        break;
                    case "-":
                        sum = e-sum;
                        break;
                    case "/":
                        sum = e/sum;
                        break;
                }
                break;
            case "*":
                sum = q * w;
                switch (oper2) {
                    case "+":
                        sum += e;
                        break;
                    case "*":
                        sum *= e;
                        break;
                    case "-":
                        sum = e-sum;
                        break;
                    case "/":
                        sum = e/sum;
                        break;
                }
                break;
            case "-":
                sum = q - w;
                switch (oper2) {
                    case "+":
                        sum += e;
                        break;
                    case "*":
                        sum *= e;
                        break;
                    case "-":
                        sum = e-sum;
                        break;
                    case "/":
                        sum = e/sum;
                        break;
                }
                break;
            case "/":
                sum = q / w;
                switch (oper2) {
                    case "+":
                        sum += e;
                        break;
                    case "*":
                        sum *= e;
                        break;
                    case "-":
                        sum = e-sum;
                        break;
                    case "/":
                        sum = e/sum;
                        break;
                }
                break;
        }
        return sum;
    }
}
