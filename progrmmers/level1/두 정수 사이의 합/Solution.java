class Solution {
    public long solution(int a, int b) {
        long diff = Math.abs(a-b);
        if(diff == 0){
            return a;
        } else{
            return (a+b)*(diff+1)/2;
        }
    }
}