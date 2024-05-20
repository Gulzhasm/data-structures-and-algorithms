package recap;

public class Misc {
    public int subsetXORSum(int[] nums) {
        int sum = 0;
        int xor;

        for(int i = 1; i < nums.length; i++){
            sum += nums[0] + nums[i];
            xor = nums[i] ^ nums[i-1];
            sum += xor;
        }
        return sum;
    }
}
