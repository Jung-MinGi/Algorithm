public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr={500,100,50,10,5,1};
		int n = 1000-Integer.parseInt(br.readLine());
		int cnt=0;
		for(int a :arr) {
			cnt+=n/a;
			n=n%a;
		}
		System.out.println(cnt);
	}
}
***정당성 분석: 가지고 있는 거스름 돈 중 큰 단위가 항상 작은 단위의 배수이므로 작은단위로 큰단위와 다른
***값을 조합할 수 없기 때문에 "그리디"로 풀 수 있다.
***수행 시간은 거슬러 줄 수 있는 돈의 개수 N에 비례하므로
***시간복잡도: O(N)
