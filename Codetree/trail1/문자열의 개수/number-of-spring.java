import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        int cnt = 0;

        while(true){
            String str = sc.next();

            if(str.equals("0")){
                break;
            }

            cnt++;

            if(cnt % 2 == 1){
                list.add(str);
            }
        }

        System.out.println(cnt);

        for(String str : list){
            System.out.println(str);
        }
    }
}