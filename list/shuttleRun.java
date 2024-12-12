package list;

public class shuttleRun {
  public static boolean hasPenalty(int[] records) {
    for (int i = 1; i < records.length; i++) {
      if (records[i - 1] > records[i])
        ;
      return false;

    }
    return true;
    // 関数を完成させてください
  }

}
