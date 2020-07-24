package _03_modulo._2_bullseye.bullseye;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.RepaintManager;

import org.jointheleague.graphical.robot.Robot;

public class bullseye extends JPanel {

	public bullseye() {
		setBackground(Color.WHITE);

	}

	public static void main(String[] args) {

		final int frameWidth = 800;
		final int frameHeight = 800;

		// Robot ethan = new Robot();
		// ethan.hide();

		bullseye b = new bullseye();
		JFrame frame = new JFrame();

		frame.add(b);

		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.pack();

	}

	@Override
	public void paintComponent(Graphics g) {
		// Graphics2D g2 = (Graphics2D) g;
		// g2.setPaint(Color.RED);
		// g2.draw(new Ellipse2D.Double(50, 50, 250, 250));

		super.paintComponent(g);

		for (int i = 25; i > 0; i--) {

			if (i % 2 == 0) {
				g.setColor(Color.RED);
			}

			else {
				g.setColor(Color.black);
			}
			
			g.fillOval(500-i*10, 500-i*10, 50+i*20, 50+i*20);
			
		}
	}
}
