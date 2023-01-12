class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a=0;i<=j;i++){
            for(int num = i; num>0;){
                a = num % 10;
                num /= 10;
                if(a == k)
                    answer++;
            }
        }
        return answer;
    }
}