class Solution {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 'a' || arr[i] == 'A') {
                arr[i] = 'A';
            } else {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }

        return new String(arr);
    }
}