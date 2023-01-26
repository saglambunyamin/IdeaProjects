package day51_Map;

public class Test_Enum {
    public static void main(String[] args) {

        Browser browser = Browser.SAFARI;

        System.out.println("browser = " + browser);

        switch (browser) {
            case FIREFOX:
                System.out.println("Firefox");
                break;
            case SAFARI:
                System.out.println("Safari");
                break;
            case OPERA:
                System.out.println("Opera");
                break;
            case EDGE:
                System.out.println("Edge");
                break;
            default:
                System.out.println("Chrome");
        }



    }
}
