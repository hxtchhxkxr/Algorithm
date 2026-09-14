import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] placed = new int[10001];

        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);

            if(c == 'G'){
                placed[pos] = 1;
            }
            else if(c == 'H'){
                placed[pos] = 2;
            }
        }

        int max = 0;

        for(int i=0; i<=10000-k; i++){
            int score = 0;

            for(int j=i; j<=i+k; j++){
                score += placed[j];
            }

            max = Math.max(max, score);
        }

        System.out.print(max);
    }
}