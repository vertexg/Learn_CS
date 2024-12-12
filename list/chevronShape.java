package list;

public class chevronShape {
  public static boolean isMountain(int[] height) {
    int l = height.length;
    if (l < 3) {
      return false;
    }
    int i = 1;
    while (i < l && height[i] > height[i - 1]) {
      i++;
    }
    if (i == 1 || i == l) {
      return false;
    }
    while (i < l && height[i] < height[i - 1]) {
      i++;
    }
    return i == l;
    // 関数を完成させてください
  }

  public static void print2dArray(int[][] array2d) {
    for (int i = 0; i < array2d.length; i++) {
      for (int j = 0; j < array2d[i].length; j++) {
        System.out.print(array2d[i][j] + " ");
      }

    }

  }
}
// public boolean validMountainArray(int[] arr) {
// int n = arr.length;
// if (n < 3) return false;

// int left = 0;
// int right = n - 1;

// // 左から上昇
// while (left + 1 < n && arr[left] < arr[left + 1]) {
// left++;
// }

// // 右から下降
// while (right > 0 && arr[right] < arr[right - 1]) {
// right--;
// }

// // 左右のポインタが同じ場所で、端点でない場合に山
// return left > 0 && right < n - 1 && left == right;
// }
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
