package Memento;

public class EditorState {
    public String getContent() {
        return content;
    }

    private final String content;

    public EditorState(String content) {
        this.content = content;
    }
}

