package _03_modulo._3_bumble_bee.bumble_bee;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BumbleBee extends JPanel {

	public BumbleBee() {
		setBackground(Color.WHITE);

	}

	public static void main(String[] args) {

		final int frameWidth = 800;
		final int frameHeight = 800;

		BumbleBee b = new BumbleBee();
		JFrame frame = new JFrame();

		frame.add(b);

		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.pack();

	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		for (int i = 10; i > 0; i--) {

			if (i % 2 == 0) {
				g.setColor(Color.black);
			}

			else {
				g.setColor(Color.yellow);
			}

			g.fillOval(500 - i * 20, 500 - i * 20, 50, 50);

		}

		g.setColor(Color.black);
		g.fillOval(490, 500, 10, 10);
		g.fillOval(510, 500, 10, 10);
		g.fillArc(500, 510, 20, 20, 100, 130);
		g.fillOval(490, 450, 4, 30);
		g.fillOval(510, 455, 4, 30);
	}
}
