import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int cnt = 0;
        
        for(int i = A; i<=B; i++){
            if(isContain369(i) || isMultipleOf3(i)){
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    static private boolean isContain369(int n){
        String str = String.valueOf(n);

        return str.contains("3") || str.contains("6") || str.contains("9");
    }

    static private boolean isMultipleOf3(int n){
        return n % 3 == 0;
    }
}