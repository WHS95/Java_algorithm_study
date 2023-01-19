package progrmmers.level1.수박수박;

class Solution {
  public String solution(int n) {
    String answer = "";
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        answer += "수";
      } else {
        answer += "박";
      }
    }
    return answer;
  }

  public String watermelon(int n){
    StringBuffer sf = new StringBuffer();
    for (int i=1; i<=n; ++i) {
        sf.append(i%2==1?"수":"박");
    }
    return sf.toString();
}

  public static void main(String[] args) {
    int wer = 5;
    Solution solution = new Solution();
    String result1 = solution.solution(wer);
    String result2 = solution.watermelon(wer);
    System.out.println(result1);
    System.out.println(result2);
  }
}
