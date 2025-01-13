package recursion;

public class GCD {

  public int findGCD(int[] nums) {
    // Initialize max and min with the first element of the array
    int max = nums[0];
    int min = nums[0];

    // Traverse the array to find the minimum and maximum values
    for (int i = 1; i < nums.length; i++) {
      min = Math.min(nums[i], min);
      max = Math.max(nums[i], max);
    }

    // Return the GCD of the maximum and minimum values
    return findGCD(max, min);

  }

  public int findGCD(int a, int b) {
    return a == 0 ? b : findGCD(b % a, b);

  }
}
