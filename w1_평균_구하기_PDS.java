import java.util.Arrays;
class Solution {
    public double solution(int[] arr) {
        return (double)Arrays.stream(arr).sum()/arr.length; //이렇게 수정
    }
}
