package Simstation;

import mvc.Model;
import mvc.View;

import java.awt.*;
import java.util.Iterator;

public class SimulationView extends View {

    protected final static int AGENT_SIZE = 10;
    protected Color agentColor = Color.WHITE;
    protected Color backgroundColor = Color.GRAY;

    public SimulationView(Model model) {
        super(model);
        this.setBackground(backgroundColor);
    }

    protected void drawAgents(Graphics gc) {
        Simulation simulation = (Simulation)model;
        Iterator<Agent> it = simulation.agentIterator();

        // get agent color
        gc.setColor(agentColor);

        // draw a circle for every agent
        int center = AGENT_SIZE / 2;
        while (it.hasNext()) {
            Agent c = it.next();

            // draw agent
            gc.fillOval(c.xc - center, c.yc - center, AGENT_SIZE, AGENT_SIZE);
        }
    }

    public void paintComponent(Graphics gc) {
        super.paintComponent(gc);
        Color oldColor = gc.getColor();

        // draw bounds for agents
        gc.setColor(Color.BLACK);
        drawAgents(gc);
        gc.setColor(oldColor);
    }
}