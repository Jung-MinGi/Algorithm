import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.printf("%.1f",4.45);
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            sb.append("$");
            StringTokenizer st = new StringTokenizer(br.readLine());
            double price = Double.parseDouble(st.nextToken());
            String a = st.nextToken();
            String b = st.nextToken();
            String c = st.nextToken();
            switch (a){
                case "R":
                    price=price-(price*0.45);
                    break;
                case "G":
                    price=price-(price*0.3);
                    break;
                case "B":
                    price=price-(price*0.2);
                    break;
                case "Y":
                    price=price-(price*0.15);
                    break;
                case "O":
                    price=price-(price*0.1);
                    break;
                case "W":
                    price=price-(price*0.05);
                    break;
            }
            if(b.equals("C")){
                price = price-(price*0.05);
            }
            if(c.equals("C")){
                int v = (int)(price * 100);
                if(v%10<=5){
                    double floor = Math.floor(price*10)/10;

                    System.out.printf("$%.2f\n",floor);
                }else{
                    double floor = Math.ceil(price*10)/10;
                    System.out.printf("$%.2f\n",floor);
                }
            }else{

                System.out.printf("$%.2f\n",price);
                }
            }
        }
//        System.out.println(sb);
    }

