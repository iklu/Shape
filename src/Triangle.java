import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ovidiu on 28-Mar-17.
 */
public class Triangle extends Shape implements ShapeInterface {
    private List<Integer> sides;
    public Triangle(int a, int b, int c) {

        if(sides == null){
            sides = new ArrayList();
        }
        sides = Arrays.asList(a, b, c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        return sides.equals(triangle.sides);
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
