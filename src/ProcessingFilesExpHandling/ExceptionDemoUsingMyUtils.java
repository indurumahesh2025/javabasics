package ProcessingFilesExpHandling;

public class ExceptionDemoUsingMyUtils {
    public static void main(String[] args) {
        /**
         * This code demonstrates how to handle exceptions in a method from another class
         */
        MyFileUtils myUtils = new MyFileUtils();

        try {
            System.out.println("subtract10FromLargerNumber Result is: " + myUtils.subtract10FromLargerNumber(17));
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            System.out.println("subtract20FromLargerNumber Result is: " + myUtils.subtract20FromLargerNumber(25));
        } catch (MyFileUtils.fooRunTimeException e) {
            e.printStackTrace();
        }


    }
}
