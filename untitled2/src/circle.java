public class circle implements GeometricObject {
    // public - permite que todos (qualquer classe) acessem
    // private - permite que só a própria classe acesse
    // protected - permite que classe e subclasses acessem
    private double radius;

    public circle() {
        this.radius = 1.0d; // d força a demarcação de double
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                '}';
    }
}