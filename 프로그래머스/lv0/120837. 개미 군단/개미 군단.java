class Solution {
    public int solution(int hp) {
        int answer = 0;
        for(int i = 0; hp > 0; i++){
            if(hp>=5){
                int a = hp/5;
                answer += a;
                hp %= 5;
            }else if(hp>=3){
                int b = hp/3;
                answer += b;
                hp %= 3;
            }else{
                int c = hp/1;
                answer += c;
                hp %= 1;
            } 
        }
    
        return answer;
    }
}