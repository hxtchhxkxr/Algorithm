import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        ArrayList<String> list = new ArrayList<>();

        for (String word : words) { 
            if(word.startsWith(t)){
                list.add(word);
            }
        }

        Collections.sort(list);

        System.out.print(list.get(k - 1));
    }
}