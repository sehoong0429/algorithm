//문자열 다루기
//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
public class CtrlStr {
    public boolean solution(String s){

        boolean answer = true;
        if(s.length() != 4 && s.length() !=6)
            answer = false;

        for(int i = 0; i<s.length(); i++)
            if(!Character.isDigit(s.charAt(i))) //숫자열 판별을 위해 Character 클래스의 isdigit 메소드 사용
                answer = false;
            return answer;
    }
}
