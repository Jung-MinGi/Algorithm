import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static char[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = br.readLine().toCharArray();
        for (int i = n - 1; i > 0; i--) {
            switch (arr[i]) {
                case 'A':
                    switch (arr[i - 1]) {
                        case 'A':
                            arr[i - 1] = 'A';
                            break;
                        case 'G':
                            arr[i - 1] = 'C';
                            break;
                        case 'C':
                            arr[i - 1] = 'A';
                            break;
                        case 'T':
                            arr[i - 1] = 'G';
                            break;
                    }
                    break;
                case 'G':
                    switch (arr[i - 1]) {
                        case 'A':
                            arr[i - 1] = 'C';
                            break;
                        case 'G':
                            arr[i - 1] = 'G';
                            break;
                        case 'C':
                            arr[i - 1] = 'T';
                            break;
                        case 'T':
                            arr[i - 1] = 'A';
                            break;
                    }
                    break;
                case 'C':
                    switch (arr[i - 1]) {
                        case 'A':
                            arr[i - 1] = 'A';
                            break;
                        case 'G':
                            arr[i - 1] = 'T';
                            break;
                        case 'C':
                            arr[i - 1] = 'C';
                            break;
                        case 'T':
                            arr[i - 1] = 'G';
                            break;
                    }
                    break;
                case 'T':
                    switch (arr[i - 1]) {
                        case 'A':
                            arr[i - 1] = 'G';
                            break;
                        case 'G':
                            arr[i - 1] = 'A';
                            break;
                        case 'C':
                            arr[i - 1] = 'G';
                            break;
                        case 'T':
                            arr[i - 1] = 'T';
                            break;
                    }
                    break;
            }
        }
        System.out.println(arr[0]);
    }
}

