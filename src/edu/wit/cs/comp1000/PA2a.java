package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);

		System.out.printf("Enter five whole numbers: ");
        
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();
        
        int countPos = 0;
        int countNeg = 0;
        int sumPos = 0;
        int sumNeg = 0;

        if (n1 > 0) {
            countPos++;
            sumPos += n1;
        } else {
            countNeg++;
            sumNeg += n1;
        }
        
        if (n2 > 0) {
            countPos++;
            sumPos += n2;
        } else {
            countNeg++;
            sumNeg += n2;
        }

        if (n3 > 0) {
            countPos++;
            sumPos += n3;
        } else {
            countNeg++;
            sumNeg += n3;
        }

        if (n4 > 0) {
            countPos++;
            sumPos += n4;
        } else {
            countNeg++;
            sumNeg += n4;
        }
        
        if (n5 > 0) {
            countPos++;
            sumPos += n5;
        } else {
            countNeg++;
            sumNeg += n5;
        }

        int sumFive = n1 + n2 + n3 + n4 + n5;
        double avgFive = sumFive / 5.0;

        System.out.printf("The sum of the %d positive %s: %d%n", countPos, (countPos == 1 ? "number" : "numbers"), sumPos);
        System.out.printf("The sum of the %d non-positive %s: %d%n", countNeg, (countNeg == 1 ? "number" : "numbers"), sumNeg);
        System.out.printf("The sum of the 5 numbers: %d%n", sumFive);

        if (countPos > 0) {
            System.out.printf("The average of the %d positive %s: %.2f%n", countPos, (countPos == 1 ? "number" : "numbers"), (double)sumPos / countPos);
        } else {
            System.out.printf("The average of the 0 positive numbers: %.2f%n", 0.00);
        }

        if (countNeg > 0) {
            System.out.printf("The average of the %d non-positive %s: %.2f%n", countNeg, (countNeg == 1 ? "number" : "numbers"), (double)sumNeg / countNeg);
        } else {
            System.out.printf("The average of the 0 non-positive numbers: %.2f%n", 0.00);
        }

        System.out.printf("The average of the 5 numbers: %.2f%n", avgFive);
		}
		}