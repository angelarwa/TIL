class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        for(int i=0; i<numlist.length; i++){
            for(int j=0; j<numlist.length-i-1;j++){
                if(Math.abs(numlist[j]-n)>Math.abs(numlist[j+1]-n)){
                    int tmp = numlist[j+1];
                    numlist[j+1] = numlist[j];
                    numlist[j] = tmp;
                }else if(Math.abs(numlist[j]-n) == Math.abs(numlist[j+1]-n)){
                    if(numlist[j]-n<numlist[j+1]-n){
                        int tmp = numlist[j+1];
                        numlist[j+1] = numlist[j];
                        numlist[j] = tmp;
                    }
                }
            }
        }
        answer = numlist;
        return answer;
    }
}