/*
*처음에 이중포문으로 접근했다가 시간초과 발생한 문제
*값의 범위가 10^5로 충분히 큰 경우 이중 포문사용은 자제하자
*/


import java.util.HashMap;
import java.util.Iterator;
class Solution {
    public String solution(String[] participant, String[] completion) {
     	String answer = "";
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		for (String a : participant) {
			hs.put(a, hs.getOrDefault(a, 0) + 1);
		}
		for (String a : completion) {
			hs.put(a, hs.getOrDefault(a, 0) - 1);
		}
		Iterator<String> keys = hs.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			if (hs.get(key) == 1) {
				answer = key;
			}
        }
		 return answer; }
}
