public class Main {
    public static void main(String[] args) {
        circle c = new circle(2);
        System.out.println(c);
        System.out.println("Área de c: " + c.getArea());
        System.out.println("Perímetro de c: " + c.getPerimeter());

        ResizableCircle rc = new ResizableCircle(4);
        System.out.println(rc);
        rc.resize(50);
        System.out.println(rc);
        rc.resize(180);
        System.out.println(rc);
    }
}