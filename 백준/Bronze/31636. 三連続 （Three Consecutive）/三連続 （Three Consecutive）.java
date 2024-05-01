import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        if(n<4){
            System.out.println("No");
        }else{

            for(int i=0;i<=s.length()-3;i++){
                String substring = s.substring(i, i + 3);
                if(substring.equals("ooo")){
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        }

    }
}

