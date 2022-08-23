package io.github.daduam.pascalstriangle;

import java.util.ArrayList;

public class PascalsTriangle {
  private int n;

  public PascalsTriangle(int n) {
    this.n = n;
  }

  public void solve() {
    ArrayList<Integer> line = getLine(n);
    for (Integer number : line) {
      System.out.print(number + " ");
    }
    System.out.println();
  }

  private ArrayList<Integer> getLine(int lineNumber) {
    ArrayList<Integer> currentLine = new ArrayList<>();
    currentLine.add(1);

    if (lineNumber == 0) {
      return currentLine;
    }

    ArrayList<Integer> previousLine = getLine(lineNumber - 1);

    for (int i = 1; i < previousLine.size(); i++) {
      int currentNumber = previousLine.get(i - 1) + previousLine.get(i);
      currentLine.add(currentNumber);
    }

    currentLine.add(1);

    return currentLine;
  }
}
