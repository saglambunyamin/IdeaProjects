package week19_01_14_2023.selenium_drivers;

public class FirefoxDriver extends  RemoteWebDriver {

    @Override
    public String getScreenshotAs() {
        return "TIFF";
    }
}
