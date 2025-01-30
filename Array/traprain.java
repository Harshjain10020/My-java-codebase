
public class traprain {
    public static int trappedRainwater(int height[], int width) {
        int n = height.length;
        // cal left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // cal right max boundary - array
        int RightMax[] = new int[height.length];
        RightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RightMax[i] = Math.max(height[i], RightMax[i + 1]);
        }
        // loop
        int trappedRainwater = 0;
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftmax,rightmax)
            int waterLevel = Math.min(leftMax[i], RightMax[i]);
            // trapped water = waterlevel - height
            trappedRainwater += (waterLevel - height[i]) * width;
        }
        return trappedRainwater;

    }

    public static void main(String arg[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int width = 1;
        System.out.println(trappedRainwater(height, width));
    }
}
// using pointers
// public class TrapRain {

// public static int trappedRainwater(int height[], int width) {
// int left = 0;
// int right = height.length - 1;
// int leftMax = 0;
// int rightMax = 0;
// int trappedRainwater = 0;

// while (left <= right) {
// if (height[left] <= height[right]) {
// if (height[left] >= leftMax) {
// leftMax = height[left];
// } else {
// trappedRainwater += (leftMax - height[left]) * width;
// }
// left++;
// } else {
// if (height[right] >= rightMax) {
// rightMax = height[right];
// } else {
// trappedRainwater += (rightMax - height[right]) * width;
// }
// right--;
// }
// }
// return trappedRainwater;
// }

// public static void main(String[] args) {
// int height[] = {4, 2, 0, 6, 3, 2, 5};
// int width = 1;
// System.out.println(trappedRainwater(height, width));
// }
// }
