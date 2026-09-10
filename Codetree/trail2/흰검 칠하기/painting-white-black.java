import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[200000];
        int[] whiteCnt = new int[200000];
        int[] blackCnt = new int[200000];

        int cur = 100000;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if(dir == 'L'){
                for(int j=cur; j>=cur-x+1; j--){
                    arr[j] = 1;
                    whiteCnt[j]++;
                }

                cur -= x - 1;
            } else if(dir == 'R'){
                for(int j=cur; j<=cur+x-1; j++){
                    arr[j] = 2;
                    blackCnt[j]++;
                }

                cur += x - 1;
            }
        }

        int white = 0;
        int black = 0;
        int gray = 0;

        for(int i=0; i<arr.length; i++){
            if(whiteCnt[i] >= 2 && blackCnt[i] >= 2){
                gray++;
            }
            else{
                if(arr[i] == 1){
                    white++;
                } else if(arr[i] == 2){
                    black++;
                }
            }
        }

        System.out.print(white + " " + black + " " + gray);
    }
}