import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] student = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            student[i] = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        }
        Arrays.sort(student, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });
        ArrayList<Integer>[] room = new ArrayList[n];
        for (int i = 0; i < room.length; i++) {
            room[i] = new ArrayList<>();
        }
        for (int j = 0; j < student.length; j++) {
            for (int i = 0; i < room.length; i++) {
                if (room[i].isEmpty()) {
                    room[i].add(j);
                    break;
                } else {
                    if (room[i].size() != k) {
                        int[] arr = student[j];
                        int s = student[room[i].get(room[i].size() - 1)][1];
                        int sex = student[room[i].get(room[i].size() - 1)][0];
                        if (arr[1] <= 2) {
                            if (s <= 2) {
                                room[i].add(j);
                                break;
                            }
                        } else {
                            if (arr[0] == 0 && sex == 0) {
                                if (s - arr[1] == 1) {
                                    room[i].add(j);
                                    break;
                                }
                            } else if (arr[0] == 1 && sex == 1) {
                                if (s - arr[1] == 1) {
                                    room[i].add(j);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int ans = 0;
        for (ArrayList<Integer> integers : room) {
            if (integers.isEmpty()) break;
            ans++;
        }
        System.out.println(ans);
    }
}
