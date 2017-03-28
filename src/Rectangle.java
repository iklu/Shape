import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ovidiu on 28-Mar-17.
 */
public class Rectangle extends Shape implements ShapeInterface {

    private List<Integer> sides;

     public Rectangle(int length, int width){
         if(sides == null){
             sides = new ArrayList();
         }
         sides = Arrays.asList(width, length, width, length);
     }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;

        return sides.equals(rectangle.sides);
    }

    @Override
    public int hashCode() {
        return sides.hashCode();
    }

    public int getPerimeter() {
        int sumSides = 0;

        //double side =0;
        for(int side: sides){
            sumSides +=side;
        }
        return sumSides;
    }
}
