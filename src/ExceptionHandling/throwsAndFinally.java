package ExceptionHandling;

import java.io.IOException;

public class throwsAndFinally {

    public static int sum(int a ,int b) throws ArithmeticException {
        b=0;
        if (b==0){
            throw new ArithmeticException( "cannot divide by zero");
        }
        int c= a/b;
        return c;
    }
    public static void main(String[] args) {
        int[] arr = new int[2];
        try {
//            int[] arr = new int[2];
//            Variables declared inside a try block are not accessible outside the block so declared or initialize outside.
            arr[0] = 10;
            arr[1] = 20;
            System.out.println(arr[2]);
        }  catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }  finally {
            System.out.println("finally block");
        }
        try {
            int sums = sum(arr[0],arr[1]);

        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
