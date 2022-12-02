package kisecok.testproject;

public class Color {

    private final int green;
    private final int red;
    private final int blue;


    public final static Color WHITE_COLOR = new Color(255, 255, 255);

    public Color(int r, int g, int b) {
        this.green = g;
        this.blue = b;
        this.red = r;
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        boolean isEquals = super.equals(o);

        if (isEquals) {
            return true;
        }

        /* Check if o is an instance of Color or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Color)) {
            return false;
        }

        // typecast o to Color so that we can compare data members
        Color c = (Color) o;

        // Compare the data members and return accordingly
        return green == c.green
                && red == c.red
                && blue == c.blue;
    }

    @Override
    public int hashCode() {

       String hashCode = red + "" + green + "" + blue + "";
        return Integer.valueOf(hashCode);
    }

    public int getGreen() {
        return green;
    }

    public int getRed() {
        return red;
    }

    public int getBlue() {
        return blue;
    }

    public String toString() {
        return red + "; " + green + "; " + blue + "";
    }

}
