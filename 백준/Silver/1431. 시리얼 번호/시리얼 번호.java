import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if(a.length()!=b.length())return a.length()-b.length();
                else{
                    int x=0;
                    for(int i=0;i<a.length();i++){
                        int c = a.charAt(i) - '0';
                        if(c>0&&c<=9)x+=c;
                    }
                    int y=0;
                    for(int i=0;i<b.length();i++){
                        int c = b.charAt(i) - '0';
                        if(c>0&&c<=9)y+=c;
                    }
                    if(x<y)return -1;
                    else if (x > y)return 1;
                    else{
                        return a.compareTo(b);
                    }
                }
            }
        });
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
