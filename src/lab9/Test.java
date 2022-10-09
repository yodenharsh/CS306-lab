package lab9;

import java.io.IOException;
import java.util.Arrays;

public class Test {

    public void test() throws RuntimeException, IOException {

    }

    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        System.out.println(Test.class.getDeclaredMethod("test").getExceptionTypes()[0]);
    }

}