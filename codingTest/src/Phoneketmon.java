import java.util.HashSet;
import java.util.Set;

//문제 폰켓몬
public class Phoneketmon {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>(); //HashSet: Set을 구현한 클래스로 중복 저장이 불가능
        for (int i : nums) { set.add(i); }
        return nums.length/2 > set.size() ? set.size() : nums.length/2;
    }


}
