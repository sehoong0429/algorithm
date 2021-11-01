//문제 정수 제곱근 판별
public class CheckSquareRoot {
    public long Solution(long n){
        long target = (long)Math.sqrt(n); //제곱근 구할때 Math.sqrt()
        if(target*target==n){
            return (target+1) * (target+1);
        }
        return -1;
    }
}
