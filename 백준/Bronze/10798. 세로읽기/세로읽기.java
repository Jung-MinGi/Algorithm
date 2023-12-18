import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] arr1 = new char[1];
        char[] arr2 = new char[1];
        char[] arr3 = new char[1];
        char[] arr4 = new char[1];
        char[] arr5 = new char[1];
        int maxLen = 0;
        for (int i = 0; i < 5; i++) {
            char[] charArray = br.readLine().toCharArray();
            maxLen = Math.max(charArray.length, maxLen);
            switch (i) {
                case 0: {
                    arr1 = new char[charArray.length];
                    for (int j = 0; j < charArray.length; j++) {
                        arr1[j] = charArray[j];
                    }
                    break;
                }
                case 1: {
                    arr2 = new char[charArray.length];
                    for (int j = 0; j < charArray.length; j++) {
                        arr2[j] = charArray[j];
                    }
                    break;
                }
                case 2: {
                    arr3 = new char[charArray.length];
                    for (int j = 0; j < charArray.length; j++) {
                        arr3[j] = charArray[j];
                    }
                    break;
                }
                case 3: {
                    arr4 = new char[charArray.length];
                    for (int j = 0; j < charArray.length; j++) {
                        arr4[j] = charArray[j];
                    }
                    break;
                }
                case 4: {
                    arr5 = new char[charArray.length];
                    for (int j = 0; j < charArray.length; j++) {
                        arr5[j] = charArray[j];
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < maxLen; i++) {
            if (arr1.length > i) {
                sb.append(arr1[i]);
            }
            if (arr2.length > i) {
                sb.append(arr2[i]);
            }
            if (arr3.length > i) {
                sb.append(arr3[i]);
            }
            if (arr4.length > i) {
                sb.append(arr4[i]);
            }
            if (arr5.length > i) {
                sb.append(arr5[i]);
            }
        }
        System.out.println(sb);
    }
}
