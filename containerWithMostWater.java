class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int result = 0;

        while(left < right){
            int h = Math.min(height[left], height[right]);
            int area = h * (right - left);
            result = Math.max(result, area);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
