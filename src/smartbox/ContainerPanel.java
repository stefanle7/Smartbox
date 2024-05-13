package smartbox;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;

import javax.swing.*;

import mvc.*;

public class ContainerPanel extends AppPanel {
    java.awt.List components;

    public ContainerPanel(AppFactory factory) {
        // set up controls
        super(factory);

        // creating the buttons + actionlistener
        JButton addButton = new JButton("Add");
        addButton.addActionListener(this);

        JButton removeButton = new JButton("Rem");
        removeButton.addActionListener(this);

        JButton runButton = new JButton("Run");
        runButton.addActionListener(this);

        // adding the buttons to the control panel
        controls.add(addButton);
        controls.add(removeButton);
        controls.add(runButton);
    }

    // this override needed to re-initialize component fields table:
    public void setModel(Model m) {
        super.setModel(m);
        ((Container) m).initContainer(); // restore fields of components
    }

    public static void main(String[] args) {
        AppPanel panel = new ContainerPanel(new ContainerFactory());
        panel.display();
    }
}