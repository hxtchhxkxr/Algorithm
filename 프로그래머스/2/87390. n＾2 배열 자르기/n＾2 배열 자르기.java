class Solution {
    public int[] solution(int n, long left, long right) {
        int[] result = new int[(int)(right - left + 1)];

        for (int i = 0; i < result.length; i++) {
            long idx = left + i;

            long row = idx / n;
            long col = idx % n;

            result[i] = (int)Math.max(row, col) + 1;
        }

        return result;
    }
}