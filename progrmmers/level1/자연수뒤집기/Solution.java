package progrmmers.level1.자연수뒤집기;

import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        String strNum = String.valueOf(n);//정수형 문자형으로 변형
        int[] answer = new int[strNum.length()];//배열 초기화 및 할당
        int i = 0;
        while (n > 0) {
            answer[i] = (int) (n %10);
            i ++;
            n /= 10;
        }
        return answer;
    }
}

//배열 초기화와 선언==========================
//int 타입 배열 선언
// int[] i_array;
// int i_array[]; 
		
// //배열 생성후 초기화하면 배열의 주소가 할당된다.
// int[] i_array = new int[8]; //초기값 0
// String[] s_array = new String[8]; //초기값 ""
		
// //배열 선언만 해놓고 나중에 초기화를 시킬수도 있다.
// int[] i_array;
// i_array = new array[8];


//Array 와 Arraylist 차이
//https://dev-coco.tistory.com/15