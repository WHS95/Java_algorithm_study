class Solution {

    int solution(int num1, int num2) {
      int answer = 0;
  
      answer = num1 / num2;

      
      return answer;
    }
  
    public static void main(String[] args) {
      int a = 3;
      int b = 4;
  
      Solution solution = new Solution();
      int c = solution.solution(a, b);
  
      System.out.println(c);
    }
  }