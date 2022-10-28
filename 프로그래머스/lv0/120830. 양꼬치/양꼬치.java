class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if (n>=10){
            int i = 0;
            i = n/10;
            k-=i;
        }
        answer = (n*12000)+(k*2000);
        return answer;
    }
}