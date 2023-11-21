import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int girl = Integer.parseInt(st.nextToken());
        int man = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int team = 0;
        while (true) {
            if (girl < 2 || man < 1) break;
            girl = girl -2;
            man--;
            team++;
        }
        //팀에 합류하지 못한 얘들로 인턴쉽 커버 가능하면
        int remainMember = girl+man;
        if(remainMember >=k){
            System.out.println(team);
            return;
        }
        int needMemberNum = k -remainMember;
        int a = (int) Math.ceil((double) needMemberNum / 3);
        System.out.println(team-a);


    }
}


