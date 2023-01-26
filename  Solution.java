class Solution {

  public String solution(String s) {
    String answer = "";
    int cnt = 0;
    String[] array = s.split("");

    for (String ss : array) {
      cnt = ss.contains(" ") ? 0 : cnt + 1;
      answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
    }
    return answer;
  }

  public static void main(String[] args) {
    String qwe = "try hello world";
    Solution solution = new Solution();
    String result =solution.solution(qwe);
    System.out.println(result);
  }
}
