import java.util.ArrayList;

/**
 * Created by ovidiu on 28-Mar-17.
 */
public class Main {
    public static void main(String[] args) {

        ShapeInterface rectangle = new Rectangle(7, 3);
        ShapeInterface rectangle2 = new Rectangle(7, 3);
        ShapeInterface square = new Square(5);
        ShapeInterface triangle = new Triangle(4, 250, 3);

        Shape shape = new Shape();

        shape.addShape(rectangle);
        shape.addShape(rectangle2);
        shape.addShape(square);
        shape.addShape(triangle);

        double totalPerimeter = shape.getPerimeter();

        System.out.print("Total perimeters:" + totalPerimeter);

    }
}
