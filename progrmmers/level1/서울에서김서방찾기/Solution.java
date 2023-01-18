class Solution {
  
    public String solution(String[] seoul) {
        int num = 0;
        while(num<seoul.length){
            if(seoul[num] == "Kim")break;
            else num++;
          }
        return "김서방은 " + num + "에 있다";
      }

      public static void main(String[] args) {
        String [] qwe = {"Jane", "Kim"};
        Solution solution = new Solution();
        String result = solution.solution(qwe);
        System.out.println(result);
      }
}
