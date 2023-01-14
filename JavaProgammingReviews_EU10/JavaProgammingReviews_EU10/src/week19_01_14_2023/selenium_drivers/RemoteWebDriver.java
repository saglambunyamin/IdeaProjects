package week19_01_14_2023.selenium_drivers;

public class RemoteWebDriver implements WebDriver, TakeScreenShot, JavaScriptExecuter, SearchContext {


    @Override
    public void executeScript(String script) {
        System.out.println("I will execute thar " + script);
    }

    @Override
    public void findElement() {
        System.out.println("Find the element " + getClass().getSimpleName());
    }

    @Override
    public void findElements() {
        System.out.println("Find the elements " + getClass().getSimpleName());
    }

    @Override
    public String getScreenshotAs() {
        return "JPEG";
    }

    @Override
    public void get(String url) {
        System.out.println("Open the " + url);
    }

    @Override
    public void close() {
        System.out.println("Close the url");
    }

    @Override
    public void quit() {
        System.out.println("Quit the url");
    }
}
