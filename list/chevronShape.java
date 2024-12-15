package list;

public class chevronShape {
  // public static boolean isMountain(int[] height) {
  // int length = height.length;
  // if (height.length < 3)
  // return false;
  // int i = 1;
  // while (i < length && height[i] > height[i - 1]) {
  // i++;
  // }
  // if (i == 1 || i == length) {
  // return false;
  // }
  // while (i < length && height[i] < height[i - 1]) {
  // i++;
  // }
  // return i == length;
  // }

  public static boolean isMountain(int[] arr) {
    int n = arr.length;
    if (n < 3)
      return false;

    int left = 0;
    int right = n - 1;

    // 左から上昇
    while (left + 1 < n && arr[left] < arr[left + 1]) {
      left++;
    }

    // 右から下降
    while (right > 0 && arr[right] < arr[right - 1]) {
      right--;
    }

    // 左右のポインタが同じ場所で、端点でない場合に山
    return left > 0 && right < n - 1 && left == right;
  }
  // public boolean validMountainArray(int[] arr) {
  // int n = arr.length;
  // int i = 0;

  // // 上昇
  // while (i + 1 < n && arr[i] < arr[i + 1]) {
  // i++;
  // }

  // // ピークが最初か最後の場合は不可
  // if (i == 0 || i == n - 1) {
  // return false;
  // }

  // // 下降
  // while (i + 1 < n && arr[i] > arr[i + 1]) {
  // i++;
  // }

  // // 配列の最後まで到達したか
  // return i == n - 1;
  // }
  public static void main(String args[]) {
    System.out.println(isMountain(new int[] { 1, 2, 3, 2 }));
    System.out.println(isMountain(new int[] { 1, 2, 3 }));
    System.out.println(isMountain(new int[] { 4, 3, 2, 1 }));
    System.out.println(isMountain(new int[] { 1, 2, 2, 2, 3, 2 }));
    System.out.println(isMountain(new int[] { 10, 20, 30, 400, 500, 10 }));
    System.out.println(isMountain(new int[] { 100, 200, 300, 200, 100, 300 }));
  }
}
