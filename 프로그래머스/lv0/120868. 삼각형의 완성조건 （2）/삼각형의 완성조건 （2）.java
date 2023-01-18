class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        if(sides[0]>sides[1]){
            answer += sides[1] *2 -1 ;    
        }else{
            answer += sides[0] * 2 -1;
        }
        
        return answer;
    }
}