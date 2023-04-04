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

