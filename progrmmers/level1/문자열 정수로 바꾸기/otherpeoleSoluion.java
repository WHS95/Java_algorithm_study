public class otherpeoleSoluion {

  public int getStrToInt(String str) {
    boolean Sign = true;
    int result = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == '-') Sign = false; else if (ch != '+') result =
        result * 10 + (ch - '0');
    }
    return Sign ? 1 : -1 * result;
  }

  //아래는 테스트로 출력해 보기 위한 코드입니다.
  public static void main(String args[]) {
    otherpeoleSoluion strToInt = new otherpeoleSoluion();
    System.out.println(strToInt.getStrToInt("-1234"));
  }
}

//Integer.parseInt()
//안에 내용을 해석
//나도 좀더 안을 들여다 볼수있는 사람이 되어야겠다.

//char 란???
//https://kang-james.tistory.com/entry/JAVA-%ED%8C%8C%ED%97%A4%EC%B9%98%EA%B8%B0-%EB%AC%B8%EC%9E%90-%ED%83%80%EC%9E%85-char-%EC%99%80-%EB%AC%B8%EC%9E%90%EC%97%B4-String-%EC%9D%98-%EC%A7%84%EC%8B%A4#:~:text=char%EB%8A%94%20%EA%B8%B0%EB%B3%B8%ED%98%95%20%ED%83%80%EC%9E%85%EC%97%90%EC%84%9C,%EB%A1%9C%20%EC%A0%80%EC%9E%A5%EB%90%98%EB%8A%94%20%EA%B2%83%EC%9E%85%EB%8B%88%EB%8B%A4.

//char at???
//https://crazykim2.tistory.com/412