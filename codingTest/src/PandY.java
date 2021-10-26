//문제 문자열 내 p와 y
//대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return
public class PandY {
    boolean solution(String s) {
        s = s.toLowerCase();
        int count = 0;

        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }
        if (count == 0)
            return true;
        else
            return false;
    }
}
