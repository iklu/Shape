import java.util.HashSet;
import java.util.Set;

/**
 * Created by ovidiu on 28-Mar-17.
 */
public class Shape implements ShapeInterface{

    public  int sum = 0;
    private Set<ShapeInterface> shapes;


    public void addShape(ShapeInterface shape ){
        if (shapes == null) {
            shapes = new HashSet<>();
        }
        if (!shapes.add(shape))
            throw new IllegalArgumentException("Shape already exists");

    }

    @Override
    public int getPerimeter() {
        for (ShapeInterface shape: shapes) {
            System.out.println(shape.getPerimeter());
            sum += shape.getPerimeter();
        }
        return sum;
    }
}
