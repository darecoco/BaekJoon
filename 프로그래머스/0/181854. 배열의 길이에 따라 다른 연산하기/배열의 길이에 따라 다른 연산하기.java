class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        for(int i = arr.length - 1; i >= 0; i = i-2)
            arr[i] += n;
        return arr;
    }
}