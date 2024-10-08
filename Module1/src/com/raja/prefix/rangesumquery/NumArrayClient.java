package com.raja.prefix.rangesumquery;

public class NumArrayClient {
    public static void main(String[] args) {
        int[] nums={-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
        numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
        numArray.sumRange(0, 5);
    }
}
