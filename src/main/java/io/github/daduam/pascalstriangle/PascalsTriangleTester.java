package io.github.daduam.pascalstriangle;

import java.util.Scanner;

/**
 * Pascal's triangle tester
 *
 */
public class PascalsTriangleTester {
    public static void main(String[] args) {
        System.out.println("Print nth line of Pascal's Triangle recursively\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("🔶 Enter the line to print (1-20): ");
        int lineOfInterest = scanner.nextInt();
        scanner.close();

        if (lineOfInterest < 1 || lineOfInterest > 20) {
            System.out.println("⚠ Line should be in the range 1-20.");
            return;
        }

        PascalsTriangle pascalsTriangle = new PascalsTriangle(lineOfInterest - 1);
        pascalsTriangle.solve();
    }
}
