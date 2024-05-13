package smartbox;

import mvc.*;
import javax.swing.*;

public class Run extends Command {

    public Run(Model m) {
        super(m);
    }

    // execute method
    @Override
    public void execute() throws Exception {
        Container container = (Container) model;
        String componentName = JOptionPane.showInputDialog(null, "Component name?");
        container.launch(componentName);
    }
}
