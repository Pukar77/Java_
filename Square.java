public class Square {

    public double area() {
        double length = 20;
        double breadth = 1;
        double area;

        area = length * breadth;

        return area;
    }

    public double perimeter() {
        double length = 21.21;
        double breadth = 10.23;
        double perimeter;

        perimeter = 2 * (length + breadth);
        return perimeter;

    }

}

class InnerSquare extends Square {

    @Override
    public double area() {
        double length = 10;
        double breadth = 20;
        double area;

        area = length * breadth;

        return area;

    }

    @Override
    public double perimeter() {
        double length = 5;
        double breadth = 8;
        double perimeter;

        perimeter = 2 * (length + breadth);
        return perimeter;
    }

    public static void main(String[] args) {
        InnerSquare obj = new InnerSquare();
        double value = obj.area();
        double value1 = obj.perimeter();
        System.out.println("The area is " + value + " and the perimeter is " + value1);
        Square s1 = new Square();
        double firstarea = s1.area();
        double firstperimeter = s1.perimeter();
        System.out.println("The area is " + firstarea + " and the perimeter is " + firstperimeter);
    }

}
