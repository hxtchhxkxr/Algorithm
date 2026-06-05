class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        int[] count = new int[7];

        for(int x : dice) {
            count[x]++;
        }

        int p = 0;
        int q = 0;
        int r = 0;

        // 4개 모두 같음
        for(int i = 1; i <= 6; i++) {
            if(count[i] == 4) {
                return 1111 * i;
            }
        }

        // 3개 같고 1개 다름
        for(int i = 1; i <= 6; i++) {
            if(count[i] == 3) p = i;
            if(count[i] == 1) q = i;
        }

        if(p != 0) {
            return (10 * p + q) * (10 * p + q);
        }

        // 2개씩 같음
        int first = 0;
        int second = 0;

        for(int i = 1; i <= 6; i++) {
            if(count[i] == 2) {
                if(first == 0) first = i;
                else second = i;
            }
        }

        if(first != 0 && second != 0) {
            return (first + second) * Math.abs(first - second);
        }

        // 2개만 같고 나머지 2개 다름
        p = 0;
        q = 0;
        r = 0;

        for(int i = 1; i <= 6; i++) {
            if(count[i] == 2) p = i;
            if(count[i] == 1) {
                if(q == 0) q = i;
                else r = i;
            }
        }

        if(p != 0) {
            return q * r;
        }

        // 모두 다름
        int min = 7;

        for(int x : dice) {
            min = Math.min(min, x);
        }

        return min;
    }
}