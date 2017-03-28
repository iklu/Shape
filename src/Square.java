import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ovidiu on 28-Mar-17.
 */
public class Square extends Shape implements ShapeInterface {
    private List<Integer> sides;
    public Square(int side) {

        if(sides == null){
            sides = new ArrayList();
        }
        sides = Arrays.asList(side, side, side, side);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        return sides.equals(square.sides);
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
