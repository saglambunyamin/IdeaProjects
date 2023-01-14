package week19_01_14_2023.selenium_drivers;

public class TestDrivers {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("htpps://youtube.com");
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("htpps://amazon.com");

        ( (TakeScreenShot) driver1).getScreenshotAs();


    }
}
