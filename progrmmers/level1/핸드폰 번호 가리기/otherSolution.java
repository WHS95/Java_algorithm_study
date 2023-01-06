public class otherSolution {

    //정규표현식
  public String solution1(String phone_number) {
    return phone_number.replaceAll(".(?=.{4})", "*");
  }
  
   
  public String solution2(String phone_number) {
    char[] ch = phone_number.toCharArray();
    for (int i = 0; i < ch.length - 4; i++) {
      ch[i] = '*';
    }
    return String.valueOf(ch);
  }

  public static void main(String args[]) {
    String a = "027778888";
    otherSolution solution = new otherSolution();
    String result = solution.solution2(a);
    System.out.println(result);
  }
}
