package Task3;

import java.util.logging.Logger;

public class ModernMultipleException {
    void multipleExceptions() {
        try {
            int[] numbers = {1, 2, 3};
            //out of bound exception
            System.out.println(numbers[3]);
            //arithmetic exception
            int result = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException  | Exception e) {
            Logger.log(e);
        }
    }
}
