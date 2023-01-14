import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016, a, b);
        //of 값을 직접적으로 입력할 경우에 사용한다.

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        //요일을 가져온다.

        answer = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US);
        //getDisplayName() : 화면에 보여주기 적절한 locale를 출력합니다. 
        //locale 객체를 생성할 때 들어간 인자 개수에 따라 출력되는 결과가 다릅니다.

        return answer.toUpperCase();
        //String 대문자로 바꾸어준다.
    }
}


//LocalDate
//https://wildeveloperetrain.tistory.com/40
//https://java119.tistory.com/52