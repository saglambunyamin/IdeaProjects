package day38_Inheritance.BrowserTask;

public class BrowserObjects {
    public static void main(String[] args) {

        Browser chrome = new Browser();
        FireFox fireFox = new FireFox();
        Opera opera = new Opera();
        Safari safari = new Safari();

        chrome.openBrowser();
        fireFox.closeBrowser();
        opera.openBrowser();
        safari.closeBrowser();


    }
}
