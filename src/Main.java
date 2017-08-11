
public class Main {
    public static void main(String[] args) {
ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle1 = shapeFactory.createCircle();
        Shape triangle1 = shapeFactory.createTriangle();
   ShapesPrinter.printShape(triangle1);
   ShapesPrinter.printShape(circle1);
       ShapesPrinter.printShape(new Shape() {
           @Override
           public void draw() {
               System.out.println("fff");
           }

           @Override
           public void getName() {
               System.out.println("fff");
           }
       });
    }
}
