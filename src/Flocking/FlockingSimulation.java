package Flocking;

import Simstation.Simulation;
import Simstation.SimulationPanel;
import mvc.AppFactory;
import mvc.AppPanel;

public class FlockingSimulation extends Simulation{

    @Override
    public void populate() {
        for (int i = 0; i < 100; i++) { // Create birds
            Bird b = new Bird("Bird" + i);
            this.addAgent(b);
        }
    }

    public static void main(String[] args) {
        AppFactory factory = new FlockingFactory();
        AppPanel panel = new SimulationPanel(factory);
        panel.display();
    }

}
