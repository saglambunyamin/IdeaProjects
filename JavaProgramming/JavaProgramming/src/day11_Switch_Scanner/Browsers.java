package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {

        String browserName = "safari" ;
        String result = "" ;

        boolean validBrowser = browserName == "chrome" || browserName== "firefox"
                || browserName== "opera" || browserName== "safari"
                || browserName== "edge";

        if(validBrowser) {
            if(browserName == "Chrome Browser Selected."){
                result = "chrome";
            } else if (browserName == "firefox") {
                result = "Firefox Browser Selected.";
            } else if (browserName == "opera") {
                result = "Opera  Browser Selected.";
            } else if (browserName == "safari") {
                result = "Safari Browser Selected.";
            } else {
                result = "Edge Browser Selected.";
            }

        } else {
            result = "INVALID BROWSER NAME!!!";
        }
        System.out.println(result);
    }
}
