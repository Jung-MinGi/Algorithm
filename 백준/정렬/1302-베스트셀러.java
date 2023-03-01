import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0 ; i < n ; i++) {
			String book = br.readLine();
			if(map.containsKey(book)) {
				map.put(book,map.get(book)+1);
			}else {
				map.put(book, 1);
			}
		}
		
		int maxValue=0;
		ArrayList<String> arr = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			maxValue = Math.max(entry.getValue(),maxValue);
	    }
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if(maxValue == entry.getValue()) {
				arr.add(entry.getKey());
			}
	    }
		if(arr.size() != 1) {
		Collections.sort(arr);
		System.out.println(arr.get(0));
		}else System.out.println(arr.get(0));
		}
}
/*
*map 메서드중getOrDefault 
*찾는 키가 맵에 있으면 요소값을 반환 없으면 기본값 반환
*/
