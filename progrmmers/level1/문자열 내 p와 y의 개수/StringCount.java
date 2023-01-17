public class StringCount {
    

    boolean solution(String s) {
        String str = s.toUpperCase();
        for(int i = 0; i<s.length(); i++){
            if(str.charAt(i) == 'P'){
                sum++;
            }
            else if(str.charAt(i) == 'Y'){
                sum--; 
            }
        }
        return sum == 0;
    }
    
    public static void main(String[] args) {
        String s ="pPoooyY";
        StringCount asd = new StringCount();
        boolean result = asd.solution(s);
        System.out.println(result);
    }
}
