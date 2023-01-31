class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0,j=n; i<my_string.length(); i++){
            while(j>0){
            answer += String.valueOf(my_string.charAt(i));
            j--;
            }
            j=n;
        }
        return answer;
    }
}