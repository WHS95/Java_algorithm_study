
public class Solution {
    /**
     * @param price
     * @param money
     * @param count
     * @return
     */
    public long solution(int price, long money, int count) {
        long answer = -1;
        long sum =0;
         for(int i = 1; i <= count; i++){
             sum += price * i;
         }
         answer = sum-money;
        
        return answer<=0?answer:0;
    }
}
