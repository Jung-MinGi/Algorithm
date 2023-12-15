import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double grade = 0;//학점
        double majorSubjectGrade = 0;//주어진 전공과목 총합
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String subjectName = st.nextToken();
            Double personalGrade = Double.parseDouble(st.nextToken());//주어진 학점
            String s = st.nextToken();

            switch (s) {
                case "A+": {
                    grade += personalGrade;
                    majorSubjectGrade += personalGrade * 4.5;
                    break;
                }
                case "A0": {
                    grade += personalGrade;
                    majorSubjectGrade += personalGrade * 4.0;
                    break;
                }
                case "B+": {
                    grade += personalGrade;
                    majorSubjectGrade += personalGrade * 3.5;
                    break;
                }
                case "B0": {
                    grade += personalGrade;
                    majorSubjectGrade += personalGrade * 3.0;
                    break;
                }
                case "C+": {
                    grade += personalGrade;
                    majorSubjectGrade += personalGrade * 2.5;
                    break;
                }
                case "C0": {
                    grade += personalGrade;
                    majorSubjectGrade += personalGrade * 2.0;
                    break;
                }
                case "D+": {
                    grade += personalGrade;
                    majorSubjectGrade += personalGrade * 1.5;
                    break;
                }
                case "D0": {
                    grade += personalGrade;
                    majorSubjectGrade += personalGrade * 1.0;
                    break;
                }
                case "F": {
                    grade += personalGrade;
                    majorSubjectGrade += personalGrade * 0.0;
                    break;
                }
            }
        }
        System.out.printf("%.6f",majorSubjectGrade/grade);
    }
}
