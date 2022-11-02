class Solution {
    public String solution(String my_string) {
        String answer = "";
        int j = my_string.length() -1;
        for(int i = 0; i<my_string.length(); i++,j--){
            answer = answer + my_string.charAt(j);}
        return answer;
    }
}