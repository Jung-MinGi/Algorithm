import jdk.dynalink.beans.StaticClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(br.readLine());
     int tmp1=n;
     int tmp2=0;
     for(int i=0;i<n;i++){
         tmp1--;
         for(int l=0;l<tmp1;l++){
             System.out.print(" ");
         }
        for(int j=0;j<i*2+1;j++){
            System.out.print('*');
        }
         System.out.println();
     }
     for(int i=n-2;i>=0;i--){
         tmp2++;
         for(int l=0;l<tmp2;l++){
             System.out.print(" ");
         }
        for(int j=0;j<i*2+1;j++){
            System.out.print('*');
        }
         System.out.println();
     }
    }

}



