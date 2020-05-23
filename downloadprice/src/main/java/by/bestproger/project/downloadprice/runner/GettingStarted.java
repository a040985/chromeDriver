package by.bestproger.project.downloadprice.runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class GettingStarted {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "D:\\");
        options.setExperimentalOption("prefs", prefs); //если убрать эту строку то работает норм
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("http://www.google.com/");
        Thread.sleep(2000);
        driver.get("https://chromedriver.storage.googleapis.com/83.0.4103.39/chromedriver_win32.zip");
        Thread.sleep(10000);

        driver.quit();
    }

}