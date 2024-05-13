package Flocking;

import Simstation.SimulationFactory;
import mvc.Model;

class FlockingFactory extends SimulationFactory {
    @Override
    public Model makeModel() {
        return new FlockingSimulation();
    }

    @Override
    public String getTitle() {
        return "Flocking Simulation";
    }
}
