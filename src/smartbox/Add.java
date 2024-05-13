package smartbox;

import mvc.*;

import javax.swing.*;

public class Add extends Command {
    public Add(Model model) { super(model); }

    @Override
    public void execute() throws Exception {
        Container container = (Container) model;
        String componentName = JOptionPane.showInputDialog(null, "Component name?");
        container.addComponent(componentName);
    }
}