import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static int answer,pi[];
    public static String all,pattern;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        all = br.readLine();
        pattern = br.readLine();

        pi = new int[pattern.length()];

        getPattern();
        kmpAlgorithm();
        System.out.println(answer);
    }
    static void getPattern(){
        int maxLength=0;
        for(int i=1;i<pattern.length();i++){
            while(maxLength>0&&pattern.charAt(i)!=pattern.charAt(maxLength)){
                maxLength=pi[maxLength-1];
            }
            if(pattern.charAt(i)==pattern.charAt(maxLength)){
                pi[i]=++maxLength;
            }
        }
    }
    static void kmpAlgorithm(){
        int j=0;
        for(int i=0;i<all.length();i++){
            while(j>0&&all.charAt(i)!=pattern.charAt(j)){
                j=pi[j-1];
            }
            if(all.charAt(i)==pattern.charAt(j)){
                if(j==pattern.length()-1){
                    answer=1;
                    break;
                }else j++;
            }
        }
    }

}
