public class Solution {

  public long solution1(long n) {
    long answer = 0;
    double resultDouble = Math.sqrt(n);
    double resultDoubleCheck = resultDouble * 100;//100자리 이상의 제곱근도 존재가능
    if (resultDoubleCheck % 100 > 0) {
      answer = -1;
    } else {
      double num = Math.pow(resultDouble + 1, 2);
      int resultInt = (int) num;
      answer = resultInt;
    }
    return answer;
  }

  public long solution2(long n) {
    if (Math.pow((int) Math.sqrt(n), 2) == n) {//
      return (long) Math.pow(Math.sqrt(n) + 1, 2);
    }

    return -1;
  }

  public static void main(String[] args) {
    int qwe = 122;

    System.out.println(Math.sqrt(qwe) * 100 % 100);
  }
}
