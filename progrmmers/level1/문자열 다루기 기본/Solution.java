class Solution {
    public boolean solution(String s) {
        if(s.length()== 4 ||s.length()== 6){
            return s.matches("(^[0-9]*$)");
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "1234";
        Solution solution = new Solution();
        boolean result = solution.solution(s);
        System.out.println(result);
    }
}