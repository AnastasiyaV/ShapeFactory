
public class ShapesPrinter {
    public static void printShape(Shape shape){
            if( shape instanceof ShapeFactory.Triangle) {
                shape.draw();
                //System.out.println('im a triangle');
        }
        else if( shape instanceof ShapeFactory.Circle){
                shape.getName();
                System.out.println(((ShapeFactory.Circle) shape).getColor().toString());
                //System.out.println("im a circle");
        }else{
                shape.getName();
                shape.draw();
            }

    }
}
