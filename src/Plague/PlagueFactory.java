package Plague;

import Simstation.SimulationFactory;
import mvc.Model;
import mvc.View;

public class PlagueFactory extends SimulationFactory {
    public Model makeModel(){
        return new PlagueSimulation();
    }
    public View makeView(Model model){
        return new PlagueView(model);
    }
    public String getTitle(){
        return "Plague Customization";
    }
}
