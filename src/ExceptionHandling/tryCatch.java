package ExceptionHandling;

public class tryCatch {

    public static void main(String[] args) throws InvalidAgeException {

        // exception handling in java::::
        // 1. try catch block
        // 2. throws keyword
        // 3. try with resources

        int i=-1;
        try {
            throw new InvalidAgeException("Age cannot be negative");
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            int[] arr = new int[2];
            arr[0] = 10;
            arr[1] = 20;
            System.out.println(c);
            System.out.println(arr[2]);
        }  catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        in multiple catch block ,The second exception (ArithmeticException) is never
//        reached because the program exits the try block after handling the first exception.
//        The more specific exceptions must appear before general exceptions (like Exception),
//        as Java checks the catch blocks in sequence.
    }
}

