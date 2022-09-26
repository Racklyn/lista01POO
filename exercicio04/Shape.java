package exercicio04;

abstract public class Shape {
    private Color color;

    abstract Double area();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
