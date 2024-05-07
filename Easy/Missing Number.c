
// https://leetcode.com/problems/missing-number/
int missingNumber(int* nums, int numsSize) {
    int figure = numsSize;
    int i;
    for (i = 0; i < numsSize; ++i) {
        figure ^= i ^ nums[i];
    }
    return figure;
}