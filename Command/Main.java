package Command;

import Command.editor.BoldCommand;
import Command.editor.History;
import Command.editor.HtmlDocument;
import Command.editor.UndoCommand;
import Command.fx.Button;
import Iterator.BrowseHistory;
import Iterator.Iterator;
import java.util.prefs.BackingStoreException;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        // composite commands
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
        composite.execute();

        // undo operation
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("hello world");
        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());

    }
}