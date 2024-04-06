

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            String s = br.readLine();

            int a = Integer.parseInt(br.readLine());
            int min=10000;
            ArrayList<String[]> answer = new ArrayList<>();
            int idx=0;
            while(idx++<a){
                ArrayList<Character>[] arr = new ArrayList[26];
                for(int j=0;j<26;j++)arr[j]=new ArrayList<>();
                String str = br.readLine();
                for(int j=0;j<str.length();j++){
//                    if(s.charAt(j)!=str.charAt(j)&&!arr[str.charAt(j)-'a'].contains(s.charAt(j))){
//                        arr[str.charAt(j)-'a'].add(s.charAt(j));
//                    }
                    if(s.charAt(j)!=str.charAt(j)){
                        arr[str.charAt(j)-'a'].add(s.charAt(j));
                    }
                }
                int tmp=0;
                for (ArrayList<Character> characters : arr) {
                    tmp+= characters.size();
                }
                answer.add(new String[]{str,String.valueOf(tmp),String.valueOf(idx)});

            }
            Collections.sort(answer, new Comparator<String[]>() {
                @Override
                public int compare(String[] a, String[] b) {
                    if(a[1].equals(b[1]))return a[2].compareTo(b[2]);
                    else return a[1].compareTo(b[1]);
                }
            });
            System.out.println(answer.get(0)[0]);
        }
    }

}

