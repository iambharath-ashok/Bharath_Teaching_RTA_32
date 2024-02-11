package javatraining.day3.inheritance;

class Shape {
   void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {

}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape square = new Square();

        Shape shape2 = new Circle();


        Shape shape1 = new Square();

//        shape2.draw();

//        shape.draw();   // Output: Drawing a shape
//        circle.draw();  // Output: Drawing a circle
//        square.draw();  // Output: Drawing a square

        shape1 = new Circle();
        shape1.draw();
    }
}
