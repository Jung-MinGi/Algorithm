import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] pivotNum = new int[n];
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			pivotNum[i]=Integer.parseInt(st.nextToken());
		}
		int a = Integer.parseInt(br.readLine());
		int[] compareNum = new int[a];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			compareNum[i]=Integer.parseInt(st.nextToken());
		}
		StringBuilder sb = new StringBuilder();
		Arrays.sort(pivotNum);
		for(int x : compareNum) {
			int rs = binarySearch(pivotNum,x);
			if(rs != -1) {
				sb.append(1).append(' ');
			}else sb.append(0).append(' ');
		}
		System.out.println(sb);
	}
	
	static int binarySearch(int[] a , int target) {
		int left=0;
		int right=a.length-1;
		int mid;
		
		while(left <= right) {
			mid=(left+right)/2;
			if(a[mid] == target) {
				return mid;
			}else if(target < a[mid]) {
				right=mid-1;
			}else left=mid+1;
		}
		return -1;
	}
}
/*
 * 새로운 내용을 많이 배운 문제
 * Array.sort --배열정렬할때,듀얼피봇사용
 * Collections.sort -- 리스트 정렬할때,timsort사용
 * 이진탐색 - 정렬된 배열에서 특정값 탐색, 시간복잡도 O(logN)을 가진다
 */
