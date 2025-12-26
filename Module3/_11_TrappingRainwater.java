public class _11_TrappingRainwater {
    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0)
            return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // left max boundary
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // right max boundary
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trap(height));
    }
}
