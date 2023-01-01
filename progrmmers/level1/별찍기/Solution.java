import java.util.Scanner;
// java.util 패키지 안에 속해있는 클래스
// Scanner 클래스란 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스
//정수(int)와 실수(double)등의 기본적인 데이터 타입 입력을 받기 위한 클래스

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.in은 화면에서 입력을 받겠다는 의미
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = 0; i<b; i++){
            for(int j =0; j<a; j++){
               System.out.print("*");
            }
            System.out.println();
        }
        //print : 괄호안 내용을 단순히 출력. 개행문자(=줄바꿈문자=\n) 포함안됨.
        //printf : C에서의 printf와 동일. %d, %s 등을 쓰기위해 사용. 개행문자 포함X
        //println : 괄호안 내용을 출력한 후 마지막에 개행문자가 포함되어 있어 출력후 한 줄 띄워짐.
        sc.close();
    }
}

// 참고 
//https://2018-start.tistory.com/41