import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());
          int  n = Integer.parseInt(st.nextToken());
          int  m = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
          while(m-->0){
              int i = Integer.parseInt(br.readLine());
              while(i>0){
                  if(i>=2){
                      boolean flag=true;
                      for(int j=0;j<n;j++){
                          if(a[j]==0){
                              a[j]=2;
                              i-=2;
                              flag=false;
                              break;
                          }
                      }
                      if(flag){
                          for(int j=0;j<n;j++){
                              if(a[j]==1){
                                  i--;
                                  a[j]++;
                                  break;
                              }
                          }
                      }
                  }else{
                      boolean flag=true;
                      for(int j=0;j<n;j++){
                          if(a[j]==0){
                              a[j]++;
                              flag=false;
                              i--;
                            break;
                          }
                      }
                      if(flag){
                          for(int j=0;j<n;j++){
                              if(a[j]<2){
                                  i--;
                                  a[j]++;
                                  break;
                              }
                          }
                      }
                  }
              }
          }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
