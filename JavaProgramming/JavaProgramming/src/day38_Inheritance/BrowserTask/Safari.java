package day38_Inheritance.BrowserTask;

public class Safari extends Browser {
    @Override
    public void openBrowser() {
        System.out.println("opening safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing safari browser");
    }
}
