import java.util.Arrays;

class Solution {

  public int solution1(int[] numbers) {
    int sum = 45;
    for (int i : numbers) {
      sum -= i;
    }
    return sum;
  }

  public int solution2(int[] numbers) {
    return 45 - Arrays.stream(numbers).sum();
  }

  public static void main(String[] args) {
    // int[] myIntArray = new int[]{1,2,3,4,6,7,8,0};
    // int[] a = {1,2,3,4,6,7,8,0};
    // Solution fn = new Solution();
    // int result = fn.solution2(a);

    // System.out.print(result);
    int[] intStr1 = { 1, 2, 3 };
    System.out.println(Arrays.toString(intStr1)); // [1, 2, 3]
  }
}

//import java.util.Arrays;사용
//https://mi2mic.tistory.com/189
