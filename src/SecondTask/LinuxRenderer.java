package SecondTask;

public class LinuxRenderer implements Renderer{
    @Override
    public void renderShape(String shape) {
        System.out.println("Rendering " + shape + " on Linux.");
    }
}
abstract class Shape{
    protected Renderer renderer;

    Shape(Renderer renderer){
        this.renderer = renderer;
    }
    abstract void draw();
}
class Circle extends Shape{
    Circle(Renderer renderer){
        super(renderer);
    }
    void draw(){
        renderer.renderShape(" Circle ");
    }
}

// Square shape
class Square extends Shape{
    Square(Renderer renderer){
        super(renderer);
    }
    void draw(){
        renderer.renderShape(" Square ");
    }
}
