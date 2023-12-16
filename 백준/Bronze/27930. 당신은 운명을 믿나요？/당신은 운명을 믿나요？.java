import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Character[] korea = new Character[]{'K', 'O', 'R', 'E', 'A'};
        Character[] yonsei = new Character[]{'Y', 'O', 'N', 'S', 'E', 'I'};
        int koreaIdx=0;
        int yonseiIdx=0;
        char[] charArray = br.readLine().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if(c==korea[koreaIdx]){
                koreaIdx++;
                if(korea.length==koreaIdx){
                    System.out.println("KOREA");
                    return;
                }
            }
            if(c==yonsei[yonseiIdx]){
                yonseiIdx++;
                if(yonsei.length==yonseiIdx){
                    System.out.println("YONSEI");
                    return;
                }
            }
        }

    }

}
