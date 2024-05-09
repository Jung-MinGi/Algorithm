import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = "!@#$%^&*()-+";
        int n = Integer.parseInt(br.readLine());
        String password = br.readLine();
        boolean[] check = new boolean[5];
        if (password.length() >= 6) check[0] = true;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) check[1] = true;
            else if (Character.isUpperCase(c)) check[2] = true;
            else if (Character.isDigit(c)) check[3] = true;
            else {
                for (int j = 0; j < a.length(); j++) {
                    if (a.charAt(j) == c) {
                        check[4] = true;
                        break;
                    }
                }
            }
        }
        int cnt = 0;
        for (int i = 1; i <check.length ; i++) {
            if(!check[i])cnt++;
        }
        if(!check[0]){
            System.out.println(Math.max(6-n,cnt));
        }else System.out.println(cnt);
    }

}
