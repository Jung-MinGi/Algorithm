import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[] password = br.readLine().toCharArray();
        while(m-->0){
            int idx=0;
            boolean flag=false;
            char[] charArray = br.readLine().toCharArray();
            if(password.length> charArray.length){
                System.out.println(false);
                continue;
            }

            for(int i=0;i< charArray.length;i++){
                if(charArray[i]==password[idx]){
                    idx++;
                    if(idx==password.length){
                        System.out.println(true);
                        flag=true;
                        break;
                    }
                }
            }
            if(!flag){
                System.out.println(false);
            }
        }
    }
}
