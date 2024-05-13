package smartbox;
import mvc.*;

import java.beans.PropertyChangeEvent;

public class ContainerView extends View {

    private java.awt.List components;

    public ContainerView(Model model) {
        super(model);
        components = new java.awt.List(10);
        this.add(components);
    }

    // etc.
    @Override
    public void update() {
        Container containerModel = (Container) model;
        components.removeAll();
        for (Component component : containerModel.getComponents()) {
            components.add(component.toString());
        }
    }
}