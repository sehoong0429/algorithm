import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//문제1 <나누어 떨어지는 숫자 배열>
//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

//   제한사항 :
//        arr은 자연수를 담은 배열입니다.
//        정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//        divisor는 자연수입니다.
//        array는 길이 1 이상인 배열입니다.

//    입출력 예 설명 :
//        입출력 예#1
//        arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.
//
//        입출력 예#2
//        arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.
//
//        입출력 예#3
//        3, 2, 6은 10으로 나누어 떨어지지 않습니다. 나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.

public class Divisible {
    public int[] divisible(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for(int a : arr){ //조건에 맞는 배열 값을 저장
            if(a % divisor == 0){
                list.add(a);
            }
        }
        if(list.isEmpty()) list.add(-1); //나누어 떨어지는 원소가 없으면 -1을 리턴
        int[] answer = new int[list.size()]; //길이 1이상인 배열 체크
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer); //오름차순 정렬
        return answer;
    }

    // 아래는 테스트로 출력하기 위한 코드입니다.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {9,17};
        System.out.println(Arrays.toString(div.divisible(array, 5)));
    }
}