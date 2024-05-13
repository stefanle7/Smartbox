package PrisonersDilemma;

import Simstation.Simulation;
import Simstation.SimulationFactory;
import mvc.Model;
import mvc.View;

public class PrisonersDilemmaFactory extends SimulationFactory {
    @Override
    public Simulation makeModel() {
        return new PrisonersDilemmaSimulation();
    }

    @Override
    public View makeView(Model model) {
        return new PrisonersDilemmaView(model);
    }

    @Override
    public String getTitle() {
        return "Prisoner's Dilemma Simulation";
    }
}
