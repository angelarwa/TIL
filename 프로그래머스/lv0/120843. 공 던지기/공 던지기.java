class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int a = k*2-2;
        while(a>numbers.length){
            a -= numbers.length;
        }
        answer = numbers[a];
        return answer;
    }
}