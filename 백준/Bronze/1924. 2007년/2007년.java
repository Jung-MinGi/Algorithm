    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;


    class Main {
        static String[][] dp = new String[13][32];

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] arr = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
            int month = 1;
            int index = 1;
            int count = 1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int targetM = Integer.parseInt(st.nextToken());
            int targetD = Integer.parseInt(st.nextToken());

            soultion(targetM, targetD, arr, index, month, count);
            System.out.println(dp[targetM][targetD]);
        }

        private static void soultion(int targetM, int targetD, String[] arr, int index, int month, int count) {
            while (true) {
//                if (dp[targetM][targetD] != null) {
//                    System.out.println(arr[index % 7]);
//                    break;
//                }

                if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && count == 31) {
                    dp[month][count] = arr[index % 7];
                    month++;
                    index = (index % 7) + 1;
                    count = 1;
                } else if ((month == 4 || month == 6 || month == 9 || month == 11) && count == 30) {
                    dp[month][count] = arr[index % 7];
                    month++;
                    index = (index % 7) + 1;
                    count = 1;
                } else if (month == 2 && count == 28) {
                    dp[month][count] = arr[index % 7];
                    month++;
                    index = (index % 7) + 1;
                    count = 1;
                }
                if(month <13&&dp[month][count]==null){
                    dp[month][count] = arr[index % 7];
                }
                if(month==13)return;
//                if (dp[targetM][targetD] != null) {
//                    System.out.println(arr[index % 7]);
//                    break;
//                }
                index++;
                count++;
            }
        }
    }


