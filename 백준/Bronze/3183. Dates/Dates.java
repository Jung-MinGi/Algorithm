import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            if(day+month+year==0)break;
            if(month==2){
                boolean flag = check(year);
                if(flag){
                    if(day<=29&&day>0){
                        System.out.println("Valid");
                    }else {
                        System.out.println("Invalid");
                    }
                }else{
                    if(day<29&&day>0){
                        System.out.println("Valid");
                    }else {
                        System.out.println("Invalid");
                    }
                }
            }else{
                if(month<13&&month>0){
                    if(month==4||month==6||month==9||month==11){
                        if(day>0&&day<31){
                            System.out.println("Valid");
                        }else System.out.println("Invalid");
                    }else{
                        if(day>0&&day<=31){
                            System.out.println("Valid");
                        }else System.out.println("Invalid");
                    }
                }else System.out.println("Invalid");
            }
        }
    }

    static boolean check(int n) {
        if (n % 4 == 0 && n % 100 == 0 && n % 400 == 0) return true;
        else if (n % 4 == 0 && n % 100 == 0 && n % 400 != 0) return false;
        else if(n % 4 == 0 && n % 100 != 0)return true;
        else return false;

    }

}
