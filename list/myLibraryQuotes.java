package list;

import java.util.ArrayList;

public class myLibraryQuotes {
  public static String[][][] createLibraryQuotes() {

    // 本棚 1 の本
    String[] book1Quotes = new String[] {
        "Let all of life be an unfettered howl.",
        "Our lives were just beginning, our favorite moment was right now, our favorite songs were unwritten.",
        "You were born to stand out, stop trying to fit in.",
        "Do not wait for the last judgment. It comes every day."
    };

    String[] book2Quotes = new String[] { "It is not a religion. It is a relationship.",
        "The choice is yours. Don't let your pronouncements destroy your destiny rather let them build your future up!",
        "Poetry is born; When the relationships begin to melt on the slow flame of the eyes.",
        "Fatherhood is sacred."
    };

    String[] book3Quotes = new String[] {
        "Marriage is a partnership; not a sole proprietorship.",
        "She was soft rock that suddenly turned hard.",
        "A human is the one, who would give up a thousand Cleopatras to be with the person he or she loves.",
        "You read between the wrong lines."
    };

    String[][] bookshelf1 = new String[][] { book1Quotes, book2Quotes, book3Quotes };

    // 本棚 2 の本
    String[] book4Quotes = new String[] {
        "Everything you want in life is a relationship away.",
        "Life!Even though it's black and white, it's still fairly colorful.",
        "To question reason is to trust it.",
        "La prueba de ausencia no es prueba de ausencia",
        "Not how the world is, but that it is, is the mystery."
    };

    String[] book5Quotes = new String[] {
        "Confuse them with your silence. Shock them with your results.",
        "All statistics have outliers.",
        "The moon fascinates us in her simplicity.",
        "Anything you're good at contributes to happiness."
    };

    String[] book6Quotes = new String[] {
        "Confuse them with your silence. Shock them with your results.",
        "All statistics have outliers.",
        "The moon fascinates us in her simplicity.",
        "Anything you're good at contributes to happiness."
    };

    String[] book7Quotes = new String[] {
        "Don't write to sell, write to tell.",
        "Slowly we became silent, and silence itself if an enemy to friendship.",
        "Without the sun I am cold.Without your smile I am lost.",
        "You are the softness of the morning dew!"
    };

    String[][] bookshelf2 = new String[][] { book4Quotes, book5Quotes, book6Quotes, book7Quotes };

    // 本棚 3 の本
    String[] book8Quotes = new String[] {
        "The Heart wants what it wants - or else it does not care",
        "You have a beautiful laugh. Like the promise of tomorrow.",
        "You'll never be able to let him go. You'll always feel wrong about being with me."
    };

    String[] book9Quotes = new String[] {
        "The voice of Love seemed to call to me, but it was a wrong number.",
        "Do not allow me to forget you",
        "Education consists mainly of what we have unlearned."
    };

    String[] book10Quotes = new String[] {
        "LIFE - Death's Very Emissary",
        "To conquer fear, you must become fear.",
        "Meditation is the energy of the mind,"
    };

    String[][] bookshelf3 = new String[][] { book8Quotes, book9Quotes, book10Quotes };
    return new String[][][] { bookshelf1, bookshelf2, bookshelf3 };

  }

  public static ArrayList<String> getIndex1QuotesFromAllBookshelves() {
    String[][][] library = createLibraryQuotes();
    ArrayList<String> index1Quotes = new ArrayList<>();

    // 全ての本棚を走査
    for (int i = 0; i < library.length; i++) {
      // 各本棚の本を走査
      for (int j = 0; j < library[i].length; j++) {
        // 各本のindex1を取得
        index1Quotes.add(library[i][j][2]);
      }
    }

    return index1Quotes;
  }

  public static ArrayList<String> getQuotes() {
    String[][][] library = createLibraryQuotes();
    ArrayList<String> quotes = new ArrayList<>();
    for (int i = 0; i < library.length; i++) {
      for (int j = 0; j < library[i].length; j++) {
        for (int k = 0; k < library[i][j].length; k++) {
          quotes.add(library[i][j][k]);
        }
      }
    }
    return quotes;

  }

  public static String getMaxQuoteFromBook(String[] book) {
    int maxLength = book[0].length();
    String targetQuote = book[0];

    for (int i = 1; i < book.length; i++) {
      if (book[i].length() >= maxLength) {
        maxLength = book[i].length();
        targetQuote = book[i];
      }
    }

    return targetQuote;
  }

  public static ArrayList<String> getLongestQuotes(String[][][] libraryArray) {
    ArrayList<String> res = new ArrayList<>();
    for (int i = 0; i < libraryArray.length; i++) {
      for (int j = 0; j < libraryArray[i].length; j++) {
        res.add(getMaxQuoteFromBook(libraryArray[i][j]));
      }
    }
    return res;
  }

  public static void main(String[] args) {
    // String[][][] library4dList = createLibraryQuotes();
    // System.out.println(getLongestQuotes(library4dList));

    // ArrayList<String> allIndex1Quotes = getIndex1QuotesFromAllBookshelves();

    // // 配列の内容を見やすく表示
    // System.out.println("本棚1のindex2の引用:");
    // for (int i = 0; i < allIndex1Quotes.size(); i++) {
    // System.out.println("本" + (i + 1) + ": " + allIndex1Quotes.get(i));
    // }
    ArrayList<String> quotes = getQuotes();
    System.out.println("All quotes:" + quotes);
  }
}
