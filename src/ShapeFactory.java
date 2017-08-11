
public class ShapeFactory {

   class Triangle implements Shape, Colorable {
        Triangle(){
            this.color = new Color(0,0,0);
        }
        private Color color;
        public void setColor (Color color){
            this.color = color;
        }
        @Override
        public Color getColor(){
            return color;
        }
        @Override
        public void draw (){
            System.out.println("i draw triangle  with color = " + color);
        }

       @Override
       public void getName() {
           System.out.println("Its Triangle");
       }
   }
    class Circle implements Shape, Colorable {
        Circle(){
            this.color = new Color(0,0,0);
        }
        private Color color;
        public void setColor (Color color){
            this.color = color;
        }
        @Override
        public Color getColor(){
            return color;
        }
        @Override
        public void draw (){
            System.out.println("i draw a circle with color = "+color);
        }

        @Override
        public void getName() {
            System.out.println("Its Circle");
        }
    }

    public Shape createCircle(){
        return new Circle();
    }
    public Shape createTriangle(){
        return new Triangle();
    }
}
