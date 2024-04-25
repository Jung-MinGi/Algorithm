import javax.naming.spi.DirObjectFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {
/*
편지의 길이는 최소 125mm이지만 290mm를 초과할 수 없으며,
 높이는 최소 90mm이지만 155mm를 초과할 수 없고,
  두께는 최소 0.25mm이지만 7mm를 초과할 수 없습니다

  소포는 세변의길이(길,높.두)가 편지의 길이의 최소조건 이상 모두가
  and 소포의 세변의길이중 적어도 하나가 편지의 길이의 최대조건길이를 초과해야함
  and 소포의길이<=380mm 높이<=300mm 두께 <=50mm

  택배 세변의길이(길,높.두)가 편지의 길이의 최소조건 이상 모두가
  and 택배의 세변의길이중 하나가 소포의 길이의 최대조건길이를 초과해야함
 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       while (true){
           StringTokenizer st = new StringTokenizer(br.readLine());
           Double[] a = new Double[3];
           for(int i=0;i<3;i++){
               a[i]=Double.parseDouble(st.nextToken());
           }
           Arrays.sort(a, new Comparator<Double>() {
               @Override
               public int compare(Double o1, Double o2) {

                   return (int)(o2-o1);
               }
           });
           Double len = a[0];//길이
           Double hei = a[1];
           Double thick = a[2];
           if(len+hei+thick==0)break;
           if(len>=125&&len<=290&&hei>=90&&hei<=155&&thick>=0.25&&thick<=7){
               System.out.println("letter");
           }else if(len>=125&&hei>=90&&thick>=0.25&&(len>290||hei>155||thick>7)&&len<=380&&hei<=300&&thick<=50){
               System.out.println("packet");
           }else if(len>=125&&hei>=90&&thick>=0.25&&(len>380||hei>300||thick>50)&&(len+hei+hei+thick)<=2100){
               System.out.println("parcel");
           }else System.out.println("not mailable");

//           else{
//                if(len>=125&&hei>=90&&thick>=0.25){
//                    if(len>290||hei>155||thick>7){
//                        if(len<=380&&hei<=300&&thick<=50){
//                            System.out.println("packet");
//                        }
//                        else{
//                            if(len>380||hei>300||thick>50){
//                                if(len+(2*(len+hei+thick))<=2100){
//                                    System.out.println("parcel");
//                                }else{
//                                    System.out.println("not mailable");
//                                }
//                            }else    System.out.println("not mailable");
//                        }
//                    }else    System.out.println("not mailable");
//                }else {
//                    System.out.println("not mailable");
//                }

       }
    }
}
