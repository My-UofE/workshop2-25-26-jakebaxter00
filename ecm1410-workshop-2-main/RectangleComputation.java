// Rectangle Computation application
public class RectangleComputation {
    public static void main(String[] args) {
        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);
        double ratio = height / width;

        String SHAPE = (Math.abs(ratio-1) >= 0.001) ? "rectangle" : "square";

        double area = height * width;
        double perimeter = (2 * height) + (2 * width);


        System.out.println("shape: " + SHAPE);
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
    }
}