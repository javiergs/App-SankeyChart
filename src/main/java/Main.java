import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.flow.FlowPlot;
import org.jfree.data.flow.DefaultFlowDataset;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * A simple example of a Sankey chart using JFreeChart.
 * This example visualizes the distribution of a person's gross income into various categories.
 *
 * @author javiergs
 * @version 1.0
 */
public class Main extends JFrame {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.setTitle("Sankey Chart");
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setSize(800, 600);
		main.setVisible(true);
	}
	
	public Main() {
		setLayout(new BorderLayout());
		// Create dataset
		DefaultFlowDataset dataset = createDataset();
		// Generate colors
		ArrayList<Color> colors = generateColors(11);
		// Create Sankey chart
		FlowPlot plot = new FlowPlot(dataset);
		plot.setNodeColorSwatch(colors);
		JFreeChart chart = new JFreeChart(null, JFreeChart.DEFAULT_TITLE_FONT, plot, true);
		ChartPanel chartPanel = new ChartPanel(chart);
		add(chartPanel, BorderLayout.CENTER);
	}
	
	private ArrayList<Color> generateColors(int size) {
		ArrayList<Color> colors = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			// spread hues evenly
			float hue = (float) i / size;
			// keep colors vivid
			float saturation = 0.8f;
			// slightly bright
			float brightness = 0.9f;
			colors.add(Color.getHSBColor(hue, saturation, brightness));
		}
		return colors;
	}
	
	private DefaultFlowDataset createDataset() {
		DefaultFlowDataset dataset = new DefaultFlowDataset();
		// column, origen, destination, percentage
		dataset.setFlow(0, "Gross Income", "Net Income", 80);
		dataset.setFlow(0, "Gross Income", "Taxes", 20);
		dataset.setFlow(1, "Net Income", "Housing", 25);
		dataset.setFlow(1, "Net Income", "Savings", 25);
		dataset.setFlow(1, "Net Income", "Lifestyle", 20);
		dataset.setFlow(1, "Net Income", "Food", 15);
		dataset.setFlow(1, "Net Income", "Health", 5);
		dataset.setFlow(1, "Net Income", "Donations", 5);
		dataset.setFlow(1, "Net Income", "Amazon", 5);
		dataset.setFlow(1, "Taxes", "Federal", 50);
		dataset.setFlow(1, "Taxes", "State", 50);
		return dataset;
	}
	
}