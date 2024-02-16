import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String binaryString = Integer.toBinaryString(n);
        int bitCount = Integer.bitCount(n);
        if(bitCount<=k){
            System.out.println(0);
        }else{
            int idx=0;
            int parent=0;
            int child=0;
            for(int i=0;i<binaryString.length();i++){
                if(binaryString.charAt(i)=='1'){
                    idx++;
                }else continue;
                if(idx==k){
                    parent = (int)Math.pow(2,binaryString.length()-i-1);
                    for(int j=i+1;j<binaryString.length();j++){
                        if(binaryString.charAt(j)=='1'){
                            child += (int)Math.pow(2,binaryString.length()-j-1);
                        }
                    }
                    break;
                }
            }
            System.out.println(parent-child);
        }

    }
}