import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    private static final double PI = 3.1415927;
    private static final double FUR = 201.168;
    private static final int MILE = 5280;
    private static final int FT = 12;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Double a = Double.parseDouble(st.nextToken());
            int rpm = Integer.parseInt(st.nextToken());
            if (rpm == 0) break;
            Double b = Double.parseDouble(st.nextToken());
            double distance = getDistance(a, rpm);
            double v = b / 3600;
            double speed = distance / v;
            System.out.print("Trip #"+i+": ");
            System.out.printf("%.2f ",distance);
            System.out.printf("%.2f\n",speed);
        }
    }

    static double getDistance(double a, int b) {
        double v = a / 12;
        return (v * PI * b) / MILE;
    }
}
