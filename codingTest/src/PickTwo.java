import java.util.HashSet;
import java.util.Set;

//문제 두 개 뽑아서 더하기
public class PickTwo {
    public int[] solution(int[] numbers){
        Set<Integer> set = new HashSet<>();
        // hash set : 중복된 값을 허용하지 않는다, 순서x , null값을 저장, 내부적으로 데이터 저장
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
