import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] arr = new int[2001];
        for(int i=0; i<array.length; i++){
            arr[array[i]]++;
        }
        int iMax = 0;
        for(int i : arr) iMax = Math.max(i, iMax);
        
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == iMax){
                count++;
                answer = i;
                }
        }
        if(count>1) answer = -1;
        
        return answer;
    }
}