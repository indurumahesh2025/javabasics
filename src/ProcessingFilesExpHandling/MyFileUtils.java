package ProcessingFilesExpHandling;

public class MyFileUtils {
    public int subtract10FromLargerNumber(int number) throws Exception {
        if (number <= 10) {
            throw new Exception("Number should be greater than 10");
        }
        return number - 10;
    }

    /**
     * using custom exception class
     */
    public  int subtract20FromLargerNumber(int number) throws fooRunTimeException {
        if (number <= 20) {
            throw new fooRunTimeException("Number should be greater than 20");
        }
        return number - 20;
    }


    /**
     * Custom exception class
     */
    public class fooRunTimeException extends Exception {
        public fooRunTimeException(String message) {
            super(message);
        }
    }
}
