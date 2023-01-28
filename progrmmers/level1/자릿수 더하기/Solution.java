

public class Solution {
    public long solution(int n) {
        long answer = 0;
        String strNum = Integer.toString(n);
        for(int i = 0; i< strNum.length(); i ++){
            int indexNum =  strNum.charAt(i) - '0';
            answer += indexNum;
        }
        return answer;
    }
}


//자바 숫자 배열로 만드는방법
// int num = 12345;
// String strNum = Integer.toString(num);
// int[] arrNum = new int[strNum.length()];
// for (int i = 0; i < strNum.length(); i++) {
// 	arrNum[i] = strNum.charAt(i) - '0';
// }
// System.out.print(Arrays.toString(arrNum));
// https://frhyme.github.io/java/java_basic02_char_to_int/


//자바 문자열 배열로 만드는법
//String s ="abcdefg"
// String[] array = s.split("");
// System.out.print(Arrays.toString(array));

//문자열로 형변환 하는 방법
// String.valueOf()
// Object.toString()

//String.valueOf()
// public static void main(String args[]) {
//     Object obj = null; 
//     System.out.println(String.valueOf(obj)); // String "null" 반환
// }

//Object.toString()
//public static void main(String args[]) {
//     Object obj = null; 
//     System.out.println(obj.toString()); // NullPointerException 오류 발생 
// }


// "/=" 
// n=3 은 변수 n에 3 이란 값을 대입한다는 것입니다.
// n*=3 은 변수 n에 3을 곱한 후 다시 변수 n 에 대입
// n/=3 은 변수 n을 3으로 나눈 후 다시 변수 n 에 대입
// n+=3 은 변수 n에 3을 더한 후 다시 변수 n 에 대입
// n-=3 은 변수 n에서 3을 뺀 후 다시 변수 n 에 대입
// n%=3 은 변수 n을 3으로 나눈 후 다시 변수 n 에 대입


// //범위에서의 정답에서 범위 문제는  없음
// //int	-2147483648 ~ 2147483647
// //long -9223372036854775808 ~ 9223372036854775807