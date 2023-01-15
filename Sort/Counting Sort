
public class Main {
	public static void main(String[] args) {
		
		//배열크기10 수의 범위100이하의 정수
		int[] arr = new int[10];//배열 크기
		int[] counting = new int[101];//수의 범위
		int[] rs = new int[10];
		for(int i = 0 ; i < arr.length; i ++) {
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i] + " ");//초기배열,정렬안된상태
		}System.out.println();
		//arr에 들어있는 값을 인덱스로 가지는 counting배열의 값을 ++
		for(int i = 0 ; i <arr.length ; i++) {
			counting[arr[i]]++;
			System.out.print(counting[arr[i]] + " ");
		}System.out.println();
		//누적합
		for(int i = 1 ; i < counting.length ; i ++) {
			counting[i] +=counting[i-1];
		}
		for(int i = arr.length - 1; i >= 0; i--) {
			int value = arr[i];
			counting[value]--;
			rs[counting[value]]=value;
		}
		for(int i = 0 ; i < rs.length ; i++) {
			
			System.out.print(rs[i] + " ");
		}
	}
}
