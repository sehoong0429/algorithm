//문자열을 정수로 바꾸기
//문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
public class StrToInt {
    public int solution(String s){
        int answer = 0;
        return Integer.parseInt(s);
    }

    //테스트 코드
    public static void main(String args[]){
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.solution("3331234"));
    }
}
