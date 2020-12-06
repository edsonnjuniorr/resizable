public class ResizableCircle extends circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        setRadius(getRadius() * percent / 100.0);
    }

    @Override
    public String toString() {
        return "Resizablecircle{" + super.toString() + "}";
    }
}