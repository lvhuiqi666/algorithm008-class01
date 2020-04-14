 // 思路, 使用 temp 变量 给不等于 0 的赋值, 进行数据的交换
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null){
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}