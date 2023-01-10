class Solution {
    public int solution(int n) {
        int answer = 0;
        int f = 1;
        for(int i=1; i<=n; i++){
            f *= i;
            if(f == n){
                answer = i;
                break;
            }else if (f>n){
                answer = i-1;
                break;
            }
        }
        return answer;
    }
}