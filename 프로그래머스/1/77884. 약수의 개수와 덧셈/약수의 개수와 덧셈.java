class Solution {
    public int solution(int left, int right) {
        int result = 0;

        for (int num = left; num <= right; num++) {
            int cnt = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    cnt++;
                }
            }

            if (cnt % 2 == 0) {
                result += num;
            } else {
                result -= num;
            }
        }

        return result;
    }
}