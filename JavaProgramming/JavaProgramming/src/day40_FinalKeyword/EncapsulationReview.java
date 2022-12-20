package day40_FinalKeyword;

import day39_Recap.ShapeTask.Circle;

public class EncapsulationReview {
    private Circle c1;

    public Circle getC1 () {
        return c1;
    }
    public void setC1 (Circle c1) {
        if (c1.setRadius() <= 0) {
            System.out.println("Invalid Radius Value");
            System.exit(0);
        }
        this.c1 = c1;
    }

}
