class Solution {

  public int solution(int[] absolutes, boolean[] signs) {
    int answer = 0;
    int len = absolutes.length;
    for (int i = 0; i < len; i++) {
      if (signs[i]) {
        answer += absolutes[i];
      } else {
        answer -= absolutes[i];
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] a = { 4, 7, 12 };
    boolean[] b = { true, false, true };
    Solution solution = new Solution();
    int c = solution.solution(a, b);
    System.out.println(c);
  }
}
