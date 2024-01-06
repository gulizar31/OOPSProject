package ProjectJavaOOPS;

public interface Q11 {

        double calculateArea();

        double calculatePerimeter();

    }

    class Circle implements Q11 {

        private double r;

        private double pi;

        public Circle(double r, double pi) {
            this.r = r;
            this.pi = pi;
        }

        public double calculateArea() {
            double cArea = (pi * (r * r));
            return cArea;

        }

        @Override
        public double calculatePerimeter() {
            double cPerimeter = (2 * (pi * r));
            return cPerimeter;
        }
    }

    class Square implements Q11 {

        private int h;

        public Square(int h) {
            this.h = h;
        }

        @Override
        public double calculateArea() {
            int sArea = (h * h);
            return sArea;
        }

        @Override
        public double calculatePerimeter() {
            int sPerimeter = ((4 * h));
            return sPerimeter;
        }
    }

    class ShapeTester {

        public static void main(String[] args) {

            Circle circle = new Circle(5, 3.1415);
            Square square = new Square(6);

            System.out.println("Circle's Perimeter is:" + circle.calculatePerimeter());
            System.out.println("Circle's Area is:" + circle.calculateArea());
            System.out.println("Square's Perimeter is:" + circle.calculatePerimeter());
            System.out.println("Square's Area is:" + circle.calculateArea());

        }


    }

