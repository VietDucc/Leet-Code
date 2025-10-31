/*
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array containing 's and 's, where means empty and means not empty, and an integer , return  if new flowers can be planted in the without violating the no-adjacent-flowers rule and otherwise.flowerbed0101ntruenflowerbedfalse

 

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int zeros = 1; // giả sử phía trước có 1 số 0
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                zeros++;
            } else {
                count += (zeros - 1) / 2;
                zeros = 0;
            }
        }

        zeros++; // giả sử phía sau cũng có 0
        count += (zeros - 1) / 2;

        return count >= n;
    }
}
