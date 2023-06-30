package State;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setTool(new SelectionTool());
        canvas.mouseUp();
        canvas.mouseDown();
    }
}