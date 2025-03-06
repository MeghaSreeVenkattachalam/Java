Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9

Constraints:
n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105

CODE:

class Solution {
    public int trap(int[] height) {
        
        int sum = 0;
        int left = 0;
        int right = height.length-1;
        int lmax = height[0];
        int rmax = height[height.length-1];

        while(left<right){

            if(height[left]<height[right]){

                if(height[left]>lmax){

                    lmax = height[left];

                }else{

                    sum += lmax-height[left];
                }

                left++;

            }else{

                if(height[right]>rmax){

                    rmax=height[right];

                }else{

                    sum+=rmax-height[right];

                }
                
                right--;
            }
                
        }
        return sum;


        /*
        int lb=height[0];
        int rb=height[height.length-1];
        int wl,tw;
        int res = 0;

        for(int i=1;i<=height.length-1;i++){
            lb = height[i];
            for(int j=0;j<=i-1;j++){
                if(height[j]>lb){
                    lb = height[j];
                    wl = Math.min(lb,rb);
                    tw = wl-height[i];
                    res += tw;
                }
            }

            rb = height[i];
            for(int j=i+1;j<=height.length-1;j++){
                if(height[j]>rb){
                    rb = height[j];
                    wl = Math.min(lb,rb);
                    tw = wl-height[i];
                    res += tw;
                }
            }

           
        }
        return res;*/
    }
}

OUTPUT:

Runtime
0
ms
Beats
100.00%

