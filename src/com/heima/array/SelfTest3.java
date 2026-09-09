package com.heima.array;

public class SelfTest3 {

    //查找元素（力扣算法）

    /*

    给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引。如果目标值不存在于数组中，打印应插入的位置。

    举例1：
    数据：nums = [1, 3, 5, 6]，target = 5
    输出：2
    举例2：
    数据：nums = [1, 3, 5, 6]，target = 2
    输出：1
    举例3：
    数据：nums = [1, 3, 5, 6]，target = 7
    输出：4

    */

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;              // 找到目标，返回索引
            } else if (nums[mid] < target) {
                left = mid + 1;          // 目标在右半区
            } else {
                right = mid - 1;         // 目标在左半区
            }
        }
        return left;                     // 未找到：left 即应插入的位置
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5));  // 期望 2
        System.out.println(searchInsert(nums, 2));  // 期望 1
        System.out.println(searchInsert(nums, 7));  // 期望 4
        // 额外边界：比最小值还小 → 应插在 0 号位
        System.out.println(searchInsert(nums, 0));  // 期望 0
    }
}
