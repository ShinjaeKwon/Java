public class ShapeMain {
    public static void main(String[] args) {
        Canvas canvas = new Canvas(20);

        Line line = new Line(new Point(1,2), new Point(7,12));
        Rect rect = new Rect(new Point(2, 2), 5, 5);
        Tri tri = new Tri(new Point(5, 5), new Point(2,2), new Point(9, 1));
        Circle circle = new Circle(new Point(4,5),9);

        canvas.add(line);
        canvas.add(rect);
        canvas.add(tri);
        canvas.add(circle);
        canvas.draw();
        System.out.println("-----------------");
        canvas.move(-2, 4);
        canvas.draw();
        canvas.size();
        canvas.scaleUp(3);
        canvas.draw();
        System.out.println("-----------------");
        Rect rect1 = new Rect(new Point(6,7), 4,17);
        System.out.println(rect.compareTo(rect1));

    }
}
