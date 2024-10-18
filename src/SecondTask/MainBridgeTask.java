package SecondTask;

public class MainBridgeTask {
    public static void main(String[] args){
        Renderer windowRenderer = new WindowsRenderer();
        Renderer linuxRenderer = new LinuxRenderer();

        Shape circle = new Circle(windowRenderer);
        Shape square = new Square(linuxRenderer);

        circle.draw();
        square.draw();
    }
}
