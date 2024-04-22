package view.flowChartComponents;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import controller.Controller;
import controller.FlowChartController;
import model.ID;
import model.Components.AlgorithmComponent;
import model.Components.ComponentAdd;

public class RectanglePanel extends FlowChartPanel {
	
	public RectanglePanel(AlgorithmComponent associatedComponent, FlowChartController controller) {
		super(associatedComponent, controller);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        if (super.executing) {
            g2d.setColor(Color.GREEN); // Se la booleana è vera, il bordo sarà verde
        } else {
            g2d.setColor(Color.BLACK); // Se la booleana è falsa, il bordo sarà nero
        }
        
        // Disegna un rettangolo
        setBackground(new Color(255, 255, 255));
        if(associatedComponent instanceof ComponentAdd) {      	        	
        	g2d.drawRect(60, 20, getWidth() - 120, getHeight() - 40);        	        	
        }else {
        	g2d.drawRect(1, 1, getWidth() - 2, getHeight() - 2);        	
        }
    }

}
