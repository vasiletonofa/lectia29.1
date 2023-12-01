package area;

public class Paint {

    private Figure figure; // Circle, Squar, Rectangle

    public void draw(Figure figure) {
        this.figure = figure;
        figure.draw();
    }

    public Figure getFigure() {
        return figure;
    }
}
