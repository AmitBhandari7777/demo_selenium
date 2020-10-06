package evening.basic.unitTesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CalculationSuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println("Failed Test Cases");
            System.out.println(failure.toString());
            System.out.println("Failed Test Cases completed");

        }

        System.out.println();
        System.out.println("Junit Testing is complete");

    }
}
