import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static ArrayList<Integer>[] arr;
    static ArrayList<Integer> answer;
    static boolean[] visit;
    static StringTokenizer st;
    static int n, m;
    static boolean flag = false;
    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        visit = new boolean[n + 1];
        answer = new ArrayList<>();
        arr = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }
        for (int i = 1; i <= n; i++) {
            dfs(i, i);
            if (answer.size() > 2) break;
            visit = new boolean[n + 1];
            answer = new ArrayList<>();
            flag = false;
        }
        set.addAll(answer);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                sb.append(0).append(' ');
                continue;
            }
            visit = new boolean[n + 1];
            sb.append(soultion(i, 1)).append(' ');
        }
        System.out.println(sb);

    }

    static int soultion(int x, int cnt) {
        visit[x]=true;
        for (int i = 0; i < arr[x].size(); i++) {
            Integer a = arr[x].get(i);
            if(!visit[a]){
                if (set.contains(a)) {
                    return cnt;
                } else {
                    int num = soultion(a, cnt + 1);
                    if(num==0) continue;
                    else return num;

                }
            }

        }
        return 0;
    }

    static void dfs(int startNode, int currentNode) {
        visit[currentNode] = true;
        answer.add(currentNode);
        for (int i = 0; i < arr[currentNode].size(); i++) {
            Integer a = arr[currentNode].get(i);
            if (!visit[a] || a == startNode) {
                if (a == startNode && currentNode != answer.get(1)) {
                    flag = true;
                    return;
                }
                if (a == startNode) continue;
                if (!flag) {
                    dfs(startNode, a);
                }
            }
        }
        if (!flag) answer.remove(answer.size() - 1);

    }
}
