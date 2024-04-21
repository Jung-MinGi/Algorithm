import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder a = new StringBuilder(st.nextToken()).reverse();
            StringBuilder b = new StringBuilder(st.nextToken()).reverse();
            if(a.toString().equals("0")&&b.toString().equals("0"))break;
            int carry=0;
            int flag=0;
            for(int i=0;i<Math.max(a.length(),b.length());i++){
                if(i<a.length()&&i<b.length()){
                    int c = a.charAt(i) - '0';
                    int d = b.charAt(i) - '0';
                    if(c+d+flag>=10){
                        carry++;
                        flag=1;
                    }else flag=0;

                }
                else if(i<a.length()){
                    int c = a.charAt(i) - '0';
                    if(c+flag>=10){
                        carry++;
                        flag=1;
                    }else flag=0;

                }else if(i<b.length()){
                    int d = b.charAt(i) - '0';
                    if(d+flag>=10){
                        carry++;
                        flag=1;
                    }else flag=0;
                }
            }
            System.out.println(carry);
        }

    }
}
