import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
        System.out.println(Math.pow(n,2)*Math.PI);
        System.out.println((Math.pow(n,2)/2)*4);
    }
}


