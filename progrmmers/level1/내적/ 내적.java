package progrmmers.level1.내적;

class 내적 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i =0; i < b.length; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }


    public static void main(String args[]) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        내적 sys= new 내적();
        int result = sys.solution(a, b);
        System.out.println(result);
    }
}