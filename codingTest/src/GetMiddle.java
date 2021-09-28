//문제 2 : 가운데 글자 반환하기
//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

public class GetMiddle {
    public String solution(String s) {
        String answer = "";
        int length = s.length(); //s 글자 길이
        if( length % 2 == 0) { //짝수일때
            answer = s.substring((length/2)-1, (length/2)+1);
        }
        else { //홀수일때
            answer = s.substring((length/2), (length/2)+1);
        }
        return answer; }

    //테스트 코드
    public static void  main(String[] args){
        GetMiddle gm = new GetMiddle();
        System.out.println(gm.solution("coding"));
    }

}
