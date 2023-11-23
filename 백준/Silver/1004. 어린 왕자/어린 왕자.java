    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.*;

    class Main {
        static int x1,y1;
        static int x2,y2;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            while (n-- > 0) {
                int cnt=0;
                StringTokenizer st = new StringTokenizer(br.readLine());
                x1 = Integer.parseInt(st.nextToken());
                y1 = Integer.parseInt(st.nextToken());
                x2 = Integer.parseInt(st.nextToken());
                y2 = Integer.parseInt(st.nextToken());
                int a = Integer.parseInt(br.readLine());
                while(a-->0){
                    st = new StringTokenizer(br.readLine());
                    int row = Integer.parseInt(st.nextToken());
                    int col = Integer.parseInt(st.nextToken());
                    int r = Integer.parseInt(st.nextToken());

                    //주어진 원안에 출발,독착 모두 있으면 의미x
                    if((Math.pow(r,2)>(Math.pow(row-x1,2)+Math.pow(col-y1,2)))&&(Math.pow(r,2)>(Math.pow(row-x2,2)+Math.pow(col-y2,2))))continue;
                    else if((Math.pow(r,2)>(Math.pow(row-x1,2)+Math.pow(col-y1,2)))
                            ||(Math.pow(r,2)>(Math.pow(row-x2,2)+Math.pow(col-y2,2)))){
                        cnt++;
                    }

                }
                System.out.println(cnt);
            }
        }
    }


