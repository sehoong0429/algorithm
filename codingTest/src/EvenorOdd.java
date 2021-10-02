//문제 짝수와 홀수
//정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
public class EvenorOdd {
        public String solution(int num) {
            String answer = "";
            if((num%2 == 0) || (num == 0)){
                answer = "Even";
            } else {
                answer = "Odd";
            }
            return answer;
        }
        public static void main(String[] args){
            EvenorOdd eo = new EvenorOdd();
            System.out.println(eo.solution(2));
        }
    }
