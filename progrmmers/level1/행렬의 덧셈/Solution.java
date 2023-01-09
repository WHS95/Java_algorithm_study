
import java.util.Arrays;

class Solution {

  public int[][] solution(int[][] arr1, int[][] arr2) {
    int[][] answer = {};
    answer = arr1;
    for (int i = 0; i < arr1.length; i++) { 
      for (int j = 0; j < arr1[0].length; j++) { 
        answer[i][j] += arr2[i][j];
      }
    }
    return answer;
  }

  public static void main(String args[]) {
    int[][] arr1 = { { 1, 2 }, { 2, 3 } };
    int[][] arr2 = { { 1, 2 }, { 2, 3 } };
    Solution solution = new Solution();
    int[][] result = solution.solution(arr1, arr2);
    System.out.println(result);//[[I@2a139a55
    System.out.println(Arrays.toString(result));//[[I@15db9742, [I@6d06d69c]
    System.out.println(Arrays.deepToString(result));//[[2, 4], [4, 6]]
  }
}

// https://www.steemcoinpan.com/hive-101145/@wonsama/7foafl
