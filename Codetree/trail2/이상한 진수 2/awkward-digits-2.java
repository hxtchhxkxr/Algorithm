import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        char[] arr = a.toCharArray();

        int max = 0;

        for(int i=0; i<arr.length; i++){
            // i번째 자리 뒤집기
            if(arr[i] == '0'){
                arr[i] = '1';
            }
            else{
                arr[i] = '0';
            }

            // 2진수 -> 10진수
            int num = 0;

            for(int j=0; j<arr.length; j++){
                num = num*2 + (arr[j] - '0');
            }

            max = Math.max(max, num);

            // 원상복구
            if(arr[i] == '0'){
                arr[i] = '1';
            }
            else{
                arr[i] = '0';
            }
        }

        System.out.print(max);
    }
}