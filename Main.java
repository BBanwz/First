public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setHeight(2.0);
        triangle.setLength(2.0);
        System.out.println(triangle.calcarea());
        System.out.println(triangle.calcper());

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.setHeight(2.5);
        parallelogram.setLength_a(2.5);
        parallelogram.setLength_b(2.5);
        System.out.println(parallelogram.calcarea());
        System.out.println(parallelogram.calcper());
    }
}
