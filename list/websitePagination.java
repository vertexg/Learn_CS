package list;

public class websitePagination {
  public static String[] websitePagination(String[] urls, int pageSize, int page) {
    // 現在のページにあるurlの最初のインデックス
    int index = pageSize * (page - 1);
    int outputSize;
    if (index + pageSize < urls.length) {
      outputSize = pageSize;
    } else {
      outputSize = urls.length - index;
    }
    String[] output = new String[outputSize];

    // pageSize分だけurlを取得していきます
    // インデックスが配列のサイズを超えるか、urlをoutputに格納した回数がpageSizeに到達したら処理を終えます
    for (int i = 0; i + index < urls.length && i < pageSize; i++) {
      output[i] = urls[i + index];
    }

    return output;
  }

  public static void printArray(String[] array) {
    System.out.print("[ ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
  }

  public static void main(String args[]) {
    printArray(websitePagination(new String[] { "url1", "url2", "url3", "url4", "url5", "url6" }, 3, 2));
  }

}
