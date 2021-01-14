public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Circle's radius is: " + circle.getRadius() +"\nArea is: " + circle.getArea());

        Circle c2 = new Circle(10);
        System.out.println("C2's radius is: "+ c2.getRadius()+"\nArea is: "+ c2.getArea());
    }
}
