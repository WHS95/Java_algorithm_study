import java.util.Arrays;

class Solution {
    public double solution1(int[] arr) {
        double answer = Arrays.stream(arr).average().getAsDouble();
        return answer;
    }

    public double solution2(int[] arr) {
        double sum =0;
        double answer =0;
        for(int x : arr){
            sum += x;
        }
        answer = sum / arr.length;
        return answer;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        Solution solution = new Solution();
        double result1 = solution.solution1(a);
        double result2 = solution.solution2(a);
        System.out.print(result1);
        System.out.print(result2);
        
    }
}