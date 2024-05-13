package smartbox;

import mvc.*;

public class ContainerFactory implements AppFactory {

    @Override
    public Model makeModel() {
        return new Container();
    }

    @Override
    public View makeView(Model m) {
        return new ContainerView(m);
    }

    @Override
    public String getTitle() {
        return "Smartbox Container";
    }

    @Override
    public String[] getHelp() {
        return new String[] {"Container help", "Add help", "Remove help", "Run help"};
    }

    @Override
    public String about() {
        return "Smartbox Container by Stefan Le.";
    }

    @Override
    public String[] getEditCommands() {
        return new String[] {"Add", "Rem", "Run"};
    }

    @Override
    public Command makeEditCommand(Model m, String name, Object object) {
        switch (name) {
            case "Add":
                return new Add(m);
            case "Rem":
                return new Remove(m);
            case "Run":
                return new Run(m);
        }
        return null;
    }
}
