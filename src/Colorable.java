import java.awt.*;

public interface Colorable {
    public Color getColor ();

    public static class Color {
        private int red,green,blue;
        Color(int red, int green, int blue){
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
        int getRed (){
            return red;
        }
        int getGreen (){
            return green;
        }
        int getBlue (){
            return blue;
        }

        @Override
        public String toString() {
            return "Color{" + "red=" + red + ", green=" + green + ", blue=" + blue + '}';
        }
    }
}
