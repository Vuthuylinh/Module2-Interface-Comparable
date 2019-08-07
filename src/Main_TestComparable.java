import java.util.Arrays;
import java.util.Scanner;

public class Main_TestComparable {
    public static void main(String[] args) {
        //Test ComparableCircle
        ComparableCircle [] circles = new ComparableCircle[3];
        circles[0]= new ComparableCircle();
        circles[1]= new ComparableCircle(7);
        circles[2]= new ComparableCircle(2);
        System.out.println("Circles Before-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle.getRadius());
        }
        Arrays.sort(circles);
        System.out.println("Circles After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle.getRadius());
        }

        //Test ComparableRectangle
        ComparableRectangle[] rectangles=new ComparableRectangle[4];
        rectangles[0]= new ComparableRectangle();
        rectangles[1]= new ComparableRectangle(6,3);
        rectangles[2]= new ComparableRectangle("blue",true,9,4);
        rectangles[3]= new ComparableRectangle(7,3);
        System.out.println("Rectangles Before-sorted:");
        for(ComparableRectangle rectangle:rectangles){
            System.out.println(rectangle.getArea());
        }
        Arrays.sort(rectangles);
        System.out.println("Rectangles After-sorted:");
        for(ComparableRectangle rectangle:rectangles){
            System.out.println(rectangle.getArea());
        }

        //Test ComparableSquare
        ComparableSquare [] squares= new ComparableSquare[3];
        squares[0]=new ComparableSquare();
        squares[1]= new ComparableSquare(10);
        squares[2]= new ComparableSquare(6,"Orange",true);
        System.out.println("squares before sorted:");
        for(ComparableSquare square:squares){
            System.out.println(square);
        }

        Arrays.sort(squares);
        System.out.println("squares after sorted:");
        for(ComparableSquare square:squares){
            System.out.println(square);
        }


    }
}
