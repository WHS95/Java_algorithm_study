class Solution {
    public String solution(String s) {
        String answer = "";
        
        int length = s.length();
        if( length % 2 == 0) {
            answer = s.substring((length/2)-1, (length/2)+1);
            //length()/2 
            //홀수를 나누면 내림을 한다.
            //예시 length()/2 => 5/2 이면 2.5가 아니라 2로 치환
        } else {
            answer = s.substring((length/2), (length/2)+1);
        }
        
        return answer;
    }
}

//substirng 문자열 자르기
// public String substring(int startIndex)  // type - 1  
// public String substring(int startIndex, int endIndex)  // type - 2  

//substring(int start): start 위치부터 끝까지 문자열 반환
//substring(int start, int end): start 위치부터 end 전까지 문자열 반환

//참고
//https://www.javatpoint.com/java-string-substring
//https://jamesdreaming.tistory.com/81