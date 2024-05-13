package Simstation;

import mvc.Command;
import mvc.Model;
import mvc.Utilities;

public class StartCommand extends Command {
    public StartCommand(Model model) {
        super(model);
    }

    public void execute() throws Exception {
        Simulation simulation = (Simulation)model;
        if (simulation.isRunning()) {
            Utilities.error("Please start the simulation. It has not been started");
        } else {
            if (!simulation.unsavedChanges || Utilities.confirm("Are you sure? Unsaved changes will be lost!")) {
                simulation.start();
            }
        }
    }
}