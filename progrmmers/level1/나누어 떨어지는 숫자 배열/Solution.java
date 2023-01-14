import java.util.Arrays;

class Divisible {

  /**
   * @param arr
   * @param divisor
   * @return
   */
  public int[] solution(int[] arr, int divisor) {
    int[] answer = Arrays
      .stream(arr)
      .filter(factor -> factor % divisor == 0)
      .toArray();
    if (answer.length == 0) answer = new int[] { -1 };
    java.util.Arrays.sort(answer);
    return answer;
  }

  public static void main(String args[]) {
    int[] a = { 5, 9, 7, 10 };
    int b = 5;
    Divisible qwe = new Divisible();
    int[] result = qwe.solution(a, b);
    System.out.println(Arrays.toString(result));
  }
}

// 람다식 filter 적용
//stream
// https://jeffrey-oh.tistory.com/160
// https://sehoonoverflow.tistory.com/26