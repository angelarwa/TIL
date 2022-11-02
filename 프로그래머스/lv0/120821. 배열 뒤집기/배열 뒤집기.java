class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j = num_list.length -1;
        for(int i=0; i<num_list.length; i++, j--){
            answer[i] = num_list[j];
        }        
        
        return answer;
    }
}