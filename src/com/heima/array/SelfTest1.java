package com.heima.array;


public class SelfTest1 {

    //两数之和（力扣算法）

    /*

    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个 整数，并输出它们的数组索引。

    提示：先不用考虑效率问题，两层循环即可完成.

    要求1：只要输出第一对满足要求的情况。
    要求2：输出所有满足要求的情况。

    举例1：
    输入：数组 nums = [2, 7, 11, 15]，target = 9
    输出：0,1
    解释：因为 nums[0] + nums[1] == 9，所以结果为 0 和 1。
    举例2：
    输入：数组 nums = [3, 2, 4]，target = 6
    输出：1,2

    */

    // 要求1：只输出第一对满足条件的索引
    public static void firstPair(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + "," + j);
                    return;          // 找到第一对立即结束
                }
            }
        }
        System.out.println("无解");
    }

    // 要求2：输出所有满足条件的索引对
    public static void allPairs(int[] nums, int target) {
        boolean found = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + "," + j);
                    found = true;    // 不 return，继续找下一对
                }
            }
        }
        if (!found) System.out.println("无解");
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        firstPair(nums1, 9);                 // 期望 0,1
        allPairs(nums1, 9);                  // 期望 0,1

        int[] nums2 = {3, 2, 4};
        firstPair(nums2, 6);                 // 期望 1,2

        int[] nums3 = {1, 3, 3, 5, 7};
        allPairs(nums3, 8);                  // 期望 0,2 和 1,2（演示"所有对"）
    }
}

