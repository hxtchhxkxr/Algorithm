import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isSame = true;

        if(arr1.length != arr2.length){
            isSame = false;
        }
        else{
            for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                isSame = false;
                break;
            }
        }
        }

        if(isSame){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}