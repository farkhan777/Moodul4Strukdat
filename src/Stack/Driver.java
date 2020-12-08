package Stack;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedStack<Integer> linkedStack = new LinkedStack<Integer>();

        System.out.print("Input Decimal Number: ");
        int jml = scan.nextInt();

        while (jml != 0) {
            int d = jml % 2;
            linkedStack.push(d);
            jml /= 2;
        }

        System.out.print("Conversion to Binary Number: ");
        while (!linkedStack.isEmpty()) {
            System.out.print(linkedStack.pop());
        }
        System.out.println();
    }

}
