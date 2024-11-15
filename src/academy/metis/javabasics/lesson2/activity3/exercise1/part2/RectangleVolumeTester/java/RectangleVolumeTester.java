package academy.metis.javabasics.lesson2.activity3.exercise1.part2.RectangleVolumeTester.java;
import java.awt.*;

public class RectangleVolumeTester {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.setSize(20, 30);
        double obvod = getVolume(rectangle);

        System.out.println("Obvod obdlznika je: " + obvod);
        System.out.println("Ocakavana hodnota: 600 ");
    }


    public static double getVolume(Rectangle rectangle) {

        double width = rectangle.getWidth();
        double height =rectangle.getHeight();
        return 2*(width + height);


    }

}


