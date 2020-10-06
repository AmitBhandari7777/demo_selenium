package evening;


import evening.basic.wait.WaitSample;
import evening.com.demo.core.BaseDriverSingleton;
import org.openqa.selenium.WebDriver;

public class GateWay {


    public static void main(String[] args) {


        BaseDriverSingleton singleton = BaseDriverSingleton.getInstance();
        singleton.getDriver();
        singleton.setSample("Hello Singleton");

        BaseDriverSingleton singleton2 = BaseDriverSingleton.getInstance();
        System.out.println(singleton2.getSample());
    }


}
