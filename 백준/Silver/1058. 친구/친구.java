import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    static Character[][] friend;
    static int answer=0;
    static boolean[][] visit;
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        friend = new Character[n][n];
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<n;j++){
                friend[i][j]=s.charAt(j);
            }
        }
        int answer=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=0;j<n;j++){
                if(friend[i][j]=='Y'){
                    set.add(j);
                   for(int k=0;k<n;k++){
                       if(friend[j][k]=='Y')set.add(k);
                   }
                }
            }
            answer = Math.max(answer,(set.contains(i))?set.size()-1:set.size());
        }
        System.out.println(answer);}


}