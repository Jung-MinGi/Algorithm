import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        System.out.println(twoBox(a,b,c,d,e,f,g,h));
    }

    static String twoBox(int x1,int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
       if(x1>x4||y1>y4||x2<x3||y2<y3) return "NULL";
       else if(x1==x4&&y2==y3||x1==x4&&y1==y4||x2==x3&&y2==y3||x2==x3&&y1==y4) return "POINT";
       else if(x1==x4||y2==y3||x2==x3||y1==y4) return "LINE";
       else return "FACE";
    }
}



