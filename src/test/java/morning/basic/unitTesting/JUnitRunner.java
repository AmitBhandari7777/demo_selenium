package morning.basic.unitTesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnitRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CalculationSuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println();
            System.out.println(failure.toString());
        }

        System.out.println();

        System.out.println("Junit Testing is complete");
    }
}