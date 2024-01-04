package itsfaraz.patterns.factory.simple.shapes;

public abstract class ShapeFactory {
    public static Shape getShape(ShapeType type){
        switch (type){
            case CIRCLE:
                return new Circle();
            case TRIANGLE:
                return new Triangle();
            case SQUARE:
                return new Square();
        }
        return new Circle();
    }
}
