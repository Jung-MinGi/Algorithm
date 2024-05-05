import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    /*

     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();

        while (x-- > 0) {
            String s = br.readLine();
            if(list.isEmpty()){
                list.add(s);
                continue;
            }
            if(!list.get(list.size()-1).equals(s))list.add(s);
        }
        System.out.println(list.size()+1);
    }}
