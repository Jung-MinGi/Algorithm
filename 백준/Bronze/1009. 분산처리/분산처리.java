    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.*;

    class Main {
        static int a,b;
        static int[] arr = new int[11];

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         arr[2]=4;
         arr[3]=4;
         arr[4]=2;
         arr[7]=4;
         arr[8]=4;
         arr[9]=2;
            //1,5,6,10
            //어떤 반복수에 나머지가 0이면 그냥 반복수 해서 나머지일의자리 출력
            //0이아니면 반복수에나온 나머지만큼 곱해서 나머지 일의 자리 출력
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            while (n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                a=Integer.parseInt(st.nextToken())%10;
                b = Integer.parseInt(st.nextToken());
                if(a==1||a==5||a==6||a==10||a==0){
                    if(a==0){
                        sb.append(10).append('\n');
                        continue;
                    }
                    sb.append(a).append('\n');
                    continue;
                }
                int cnt = b%arr[a];
                int sum=1;
                if(cnt==0){
                    for(int i=1;i<=arr[a];i++){
                        sum*=a;
                    }

                }else{
                    for(int i=1;i<=cnt;i++){
                        sum*=a;
                    }
                }
                sb.append(sum%10).append('\n');
            }
            System.out.println(sb);
        }
    }


