import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        int idx = -1;

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l") || str_list[i].equals("r")) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            return new String[]{};
        }

        String[] result;

        if (str_list[idx].equals("r")) {
            result = new String[str_list.length - idx - 1];

            for (int i = 0; i < result.length; i++) {
                result[i] = str_list[idx + 1 + i];
            }
        } else {
            result = new String[idx];

            for (int i = 0; i < result.length; i++) {
                result[i] = str_list[i];
            }
        }

        return result;
    }
}