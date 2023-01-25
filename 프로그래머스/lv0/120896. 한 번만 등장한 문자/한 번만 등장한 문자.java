import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        for(int i=0; i<c.length;i++){
            for(int j=i+1; j<c.length; j++){
                if(c[i] == (c[j])){
                    s = s.replaceAll(String.valueOf(c[i]), "");
                }
            }
        }
        String[] arr = s.split("");
        Arrays.sort(arr);
        answer = String.join("", arr);
        return answer;
    }
}