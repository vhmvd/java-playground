package Recursion;

public class Recursion {
  public void pattern1(int lines) {
    if (lines < 1) {
      return;
    } else {
      for (int i = 0; i < lines; i++) {
        System.out.print("*");
      }
      System.out.println();

      pattern1(lines - 1);

      if (lines < 1) {
        return;
      } else {
        for (int i = 0; i < lines; i++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }

  private void printPattern2(int linesNow, int lines) {
    if (linesNow < 1) {
      return;
    } else {
      for (int i = 0; i < linesNow - 1; i++) {
        System.out.print(" ");
      }
      for (int i = 0; i < lines - linesNow; i++) {
        System.out.print("* ");
      }
      System.out.println();

      printPattern2(linesNow - 1, lines);

      if (linesNow < 1) {
        return;
      } else {
        for (int i = 1; i < linesNow + 1; i++) {
          System.out.print(" ");
        }
        for (int i = 1; i < lines - linesNow; i++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
  }

  public void pattern2(int lines) {
    printPattern2(lines, lines + 1);
  }

  private int countVowels(String str, int count) {
    if (str.length() == 0) {
      return count;
    } else {
      if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o'
          || str.charAt(0) == 'u' || str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I'
          || str.charAt(0) == 'O' || str.charAt(0) == 'U') {
        str = str.substring(1, str.length());
        return countVowels(str, count + 1);
      } else {
        str = str.substring(1, str.length());
        return countVowels(str, count);
      }
    }
  }

  public int vowels(String str) {
    return countVowels(str, 0);
  }

  private boolean palindromeFunction(String str, int top, int bottom) {
    if (str.charAt(top-1) != str.charAt(bottom)) {
      return false;
    } else {
      if (top > bottom) {
        return palindromeFunction(str, top - 1, bottom + 1);
      } else {
        return true;
      }
    }
  }

  public boolean palindromeCheck(String str) {
    if (str.length() == 0 || str.length() == 1) {
      return true;
    }
    return palindromeFunction(str, str.length(), 0);
  }
}
