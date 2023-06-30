package State;

public class Canvas {
    private Tool tool;

    public Tool getTool() {
        return tool;
    }
    public void setTool(Tool tool) {
        this.tool = tool;
    }
    public void mouseDown() {
        tool.mouseDown();
    }
    public void mouseUp() {
        tool.mouseUp();
    }
}
