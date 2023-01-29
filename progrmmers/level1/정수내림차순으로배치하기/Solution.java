package progrmmers.level1.정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

  public long solution(long n) {
    String num_str = String.valueOf(n); //Long to String문자열로 형변환
    int strNum = num_str.length(); //문자열의 길이

    String reverse = "";
    for (int i = strNum - 1; i >= 0; i--) { //반복문 거꾸로적용
      reverse = reverse + num_str.charAt(i); //char to String
    }

    Long reverseNum = Long.parseLong(reverse); //Stirng to Long 형변환
    return reverseNum;
  }

  public long solution2(long n) {
    String[] arr = String.valueOf(n).split("");

    // Arrays.sort(arr) //오름차순으로 배열정렬
    //Arrays.sort(arr, (i1, i2) -> i2 - i1);]//내림차순으로 배열정렬
    Arrays.sort(arr, Collections.reverseOrder()); //내림차순으로 배열정렬
    String reverse = "";
    for (int i = 0; i < arr.length; i++) {
      reverse = reverse + arr[i]; //char to String
    }

    Long reverseNum = Long.parseLong(reverse); //String to Long 형변환
    return reverseNum;
  }
}
//문자열로 형변환 하는 방법
// String.valueOf()
// Object.toString()
//Stirng to Long 형변환
// Long reverseNum =Long.parseLong(reverse);
//Char to String 형변환
//https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=gglee0127&logNo=221287052764
//문자열 순서 거꾸로하기
//https://hianna.tistory.com/543
