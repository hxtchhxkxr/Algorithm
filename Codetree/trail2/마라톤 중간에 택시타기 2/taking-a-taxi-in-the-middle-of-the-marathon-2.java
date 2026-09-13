import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        // 전체 거리
        int total = 0;

        for(int i=0; i<n-1; i++){
            total += distance(x[i], y[i], x[i+1], y[i+1]);
        }

        int min = Integer.MAX_VALUE;

        // 0번과 n-1번은 건너뛸 수 없음
        for(int i=1; i<n-1; i++){
            // i번째 건너뛰기 전 거리
            int before = distance(x[i-1], y[i-1], x[i], y[i]) + distance(x[i], y[i], x[i+1], y[i+1]);

            // i번째 건너뛴 후 거리
            int after = distance(x[i-1], y[i-1], x[i+1], y[i+1]);

            int sum = total - before + after;

            min = Math.min(min, sum);
        }

        System.out.print(min);
    }

    private static int distance(int x1, int y1, int x2, int y2){
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}