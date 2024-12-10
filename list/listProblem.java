package list;

import java.util.ArrayList;
import java.util.Arrays;

import recursion.stack;

public class listProblem {
  public static int addEveryOtherElement(int[] intArr) {
    int sum = 0;
    for (int i = 0; i < intArr.length; i += 2) {
      sum += intArr[i];
    }
    return sum;
  }

  //
  public static int charInBagOfWordsCount(String[] bagOfWords, char keyCharacter) {
    int count = 0;
    for (String word : bagOfWords) {
      for (int j = 0; j < word.length(); j++) {
        if (word.charAt(j) == keyCharacter) {
          count++;
        }
      }
    }
    return count;
  }
  // ---------------------------------------------------

  public static boolean isFirstStringLarger(String s1, String s2) {
    return getAscii(s1) > getAscii(s2);
  }

  public static int getAscii(String string) {
    int sumOfAscii = 0;
    string = string.toLowerCase();
    for (int i = 0; i < string.length(); i++) {
      sumOfAscii += (int) string.charAt(i);
    }
    return sumOfAscii;
  }

  // ---------------------------------------------------
  public static boolean winnerBlackjack(String[] playerCards, String[] houseCards) {
    int playerScore = 0;
    int houseScore = 0;

    for (String card : playerCards) {
      playerScore += cardValue(card);
    }
    for (String card : houseCards) {
      houseScore += cardValue(card);
    }

    if (playerScore > 21 || playerScore == houseScore) {
      return false;
    }
    if (houseScore < 22 && houseScore > playerScore) {
      return false;
    }

    return true;
  }

  public static int cardValue(String cardString2) {
    ArrayList<String> string = new ArrayList<>(
        Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));
    return string.indexOf(cardString2.substring(1)) + 1;
  }

  // ---------------------------------------------------
  public static String[] validEmailList(String[] emailList) {
    ArrayList<String> validEmails = new ArrayList<>();
    for (String email : emailList) {
      if (isValidEmail(email)) {
        validEmails.add(email);
      }
    }
    return validEmails.toArray(new String[0]);
  }

  public static boolean isValidEmail(String email) {
    int atMarkCount = 0;
    if (email.contains(" ")) {
      return false;
    }
    for (int i = 0; i < email.length(); i++) {
      if (email.charAt(i) == '@') {
        atMarkCount++;
      }
    }
    if (atMarkCount != 1) {
      return false;
    }
    int atIndex = email.indexOf('@');
    int dotIndex = email.lastIndexOf('.');
    if (dotIndex < atIndex || dotIndex == email.length() - 1) {
      return false;
    }
    return true;
  }

  // ---------------------------------------------------
  public static char[] generateAlphabet(char firstAlphabet, char secondAlphabet) {
    // 各文字を小文字に変えます
    char first = Character.toLowerCase(firstAlphabet);
    char second = Character.toLowerCase(secondAlphabet);

    int small = first < second ? first : second;
    int large = first < second ? second : first;

    char[] alphabet = new char[large - small + 1];
    int index = 0;
    for (int i = small; i <= large; i++) {
      alphabet[index] = (char) i;
    }
    return alphabet;
  }

  public static void printArray(char[] array) {
    System.out.print("[ ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
  }

  // ---------------------------------------------------
  public static int maxAscilString(String[] stringList) {
    int maxVlaue = returnAscii(stringList[0]);
    int maxIndex = 0;

    for (int i = 0; i < stringList.length; i++) {
      if (maxVlaue < returnAscii(stringList[i])) {
        maxVlaue = returnAscii(stringList[i]);
        maxIndex = i;

      }
    }
    return maxIndex;
    // 関数を完成させてください
  }

  public static int returnAscii(String string) {
    int sum = 0;
    for (int i = 0; i < string.length(); i++) {
      sum = sum + (int) string.charAt(i);
    }
    return sum;
  }

  // ---------------------------------------------------
  public static int[] rotateByTimes(int[] ids, int n) {
    if (n > ids.length) {
      n = n % ids.length;
    }
    int[] result = new int[ids.length];
    for (int i = 0; i < ids.length; i++) {
      result[(i + n) % ids.length] = ids[i];
    }
    return result;
  }

  public static void main(String[] args) {
    int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(addEveryOtherElement(intArr)); // 25

    String[] bagOfWords = { "apple", "banana", "cherry", "date" };
    char keyCharacter = 'a';
    System.out.println(charInBagOfWordsCount(bagOfWords, keyCharacter)); // 3
    System.out.println(winnerBlackjack(new String[] { "♣4", "♥7", "♥7" }, new String[] { "♠Q", "♣J" })); // true
    System.out.println(winnerBlackjack(new String[] { "♥10", "♥6", "♣K" }, new String[] { "♠Q", "♦2", "♥K" })); // false
    char[] alphabet = generateAlphabet('C', 'Z');
    printArray(alphabet);

  }
}
