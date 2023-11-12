import java.util.Scanner; 

public class Shape {

    public int calculationArea(int a, int b) {
        return a * b;
    }

    public double calculationArea(int r){
        return Math.PI * r * r;
    }

    public double calculationArea(double a, double h) {
        return 0.5 * a * h;
    }

    public double calculationArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны прямоугольника - ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Square rectangle - "+shape.calculationArea(a, b));

        System.out.println("Введите радиус круга - ");
        int r = scanner.nextInt();
        System.out.println("Square circle - "+shape.calculationArea(r));

        System.out.println("Введите основание треугольника и высоту треугольника - ");
        double a1 = scanner.nextDouble();
        double h = scanner.nextDouble();
        System.out.println("Square triangle - "+shape.calculationArea(a1, h));

        System.out.println("Введите стороны триугольника - ");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        System.out.println("Square triangle (heron 's formula) - "+shape.calculationArea(a2, b2, c2));

    }
}
