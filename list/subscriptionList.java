package list;

import java.util.ArrayList;

public class subscriptionList {
  public static String[] validEmailList(String[] emailList) {
    ArrayList<String> validEmails = new ArrayList<>();
    for (String email : emailList) {
      if (checkEmail(email)) {
        validEmails.add(email);
      }
    }
    return validEmails.toArray(new String[0]);
  }

  public static boolean checkEmail(String email) {
    // 関数を完成させてください
    int atMarkCount = 0;
    for (int i = 0; i < email.length(); i++) {
      if (email.charAt(i) == ' ') {
        return false;
      }
      if (email.charAt(i) == '@') {
        atMarkCount++;
        if (atMarkCount > 1)
          return false;
      }
    }
    int atIndex = email.indexOf('@');
    int dotIndex = email.lastIndexOf('.');
    if (dotIndex < atIndex || dotIndex == email.length() - 1) {
      return false;

    }

    return true;
  }

  public static void main(String[] args) {
    String[] emails = { "@test@example.com", "invalid@ email.com", "another.@testcom" };
    String[] validEmails = validEmailList(emails);
    for (String email : validEmails) {
      System.out.println(email);
    }
  }
}
