class Solution {

  String solution(int num) {
      String answer = "";
      if(num%2 == 0){
        return answer = "Even";
      }

      return answer = "Odd";
    }
  
    public static void main(String[] args) {
      int a = 3;
  
      Solution solution = new Solution();
      String c = solution.solution(a);
  
      System.out.println(c);
    }
  }