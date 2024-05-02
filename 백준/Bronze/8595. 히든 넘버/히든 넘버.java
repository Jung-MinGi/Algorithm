import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String s = br.readLine();

        long sum=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!Character.isAlphabetic(c)){
                StringBuilder a= new StringBuilder();
                for(int j=i;;j++){
                    if(j>=s.length()){
                        if(a.length()<=6)sum+=Integer.parseInt(a.toString());

                        i=j-1;
                        break;
                    }
                    char x = s.charAt(j);
                    if(Character.isAlphabetic(x)||a.length()>=7){
                        if(a.length()<=6)sum+=Integer.parseInt(a.toString());
                        i=j-1;
                        break;
                    }else a.append(x);
                }
            }
        }
        System.out.println(sum);
    }
}
