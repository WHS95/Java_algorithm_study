class Solution {

  public String solution(String phone_number) {
    String answer = "";
    String lastNumbers = "";
    int phone_number_len = phone_number.length();
    for (int i = 0; i < phone_number_len - 4; i++) {
      answer += "*";
    }
    lastNumbers = phone_number.substring(phone_number_len - 4, phone_number_len);
    answer += lastNumbers;
    return answer;
  }

  public static void main(String args[]) {
    String a = "027778888";
    Solution solution = new Solution();
    String result = solution.solution(a);
    System.out.println(result);
  }
}

//문자열 다루기
//substring