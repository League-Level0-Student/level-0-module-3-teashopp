package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {

	public static void main(String[] args) {

		String sandwich = JOptionPane.showInputDialog("Would you like to make a late night sandwich?");

		if (sandwich.equalsIgnoreCase("yes")) {
			String lights = JOptionPane.showInputDialog("Are you going to turn on the lights down the staircase?");

			if (lights.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "You safely made it downstairs");
				String bread = JOptionPane.showInputDialog("Would you like to use buttermilk or whole wheat bread?");

				if (bread.equalsIgnoreCase("buttermilk")) {
					JOptionPane.showMessageDialog(null, "Good choice, buttermilk bread goes with everything.");
					String fillings = JOptionPane.showInputDialog("Are you going to go with spreads or meats?");

					if (fillings.equalsIgnoreCase("spreads")) {
						String spreads = JOptionPane.showInputDialog("Are you going with PB&J or just a preserve?");

						if (spreads.equalsIgnoreCase("PB&J")) {
							JOptionPane.showMessageDialog(null, "Great choice, a classic sandwich.");
							String milk = JOptionPane.showInputDialog("Are you going to drink some milk too?");

							if (milk.equalsIgnoreCase("yes")) {
								JOptionPane.showMessageDialog(null,
										"After eating your snack, you go back to bed full and happy.");

							}

							else {
								JOptionPane.showMessageDialog(null,
										"After your snack, you feel almost satisfied, but your mouth feels dry and dissapointed.");
							}

						}

						else {
							JOptionPane.showMessageDialog(null,
									"You feel as though the sandwich was too sweet, try again tomorrow.");
						}

					}

					else {
						JOptionPane.showMessageDialog(null, "Lunch has never tasted better at 2 am.");
						String meat = JOptionPane.showInputDialog("Would you like cold roast beef or turkey?");

						if (meat.equalsIgnoreCase("cold roast beef")) {
							String swiss = JOptionPane.showInputDialog(null, "Would you like swiss on that?");

							if (swiss.equalsIgnoreCase("yes")) {
								JOptionPane.showMessageDialog(null,
										"Great choice. You savor your sandwich and fall asleep quickly and comfortably.");

							}

							else {
								JOptionPane.showMessageDialog(null,
										"Dissapointing, but I won't judge. Enjoy your, frankly boring, sandwich.");
							}

						}

						else {
							String toppings = JOptionPane
									.showInputDialog("Would you like to add toppings? Lettuce, tomatoes, etc.");

							if (toppings.equalsIgnoreCase("yes")) {
								JOptionPane.showMessageDialog(null,
										"Fantastic, a classic sandwich that leaves you feeling full and ready for whatever will happen at this hour.");
							}

							else {
								JOptionPane.showMessageDialog(null,
										"Terrible decision. I hope your turkey is as dry as your affinity for sandwiches is weak.");
							}
						}
					}

				}

				else {
					JOptionPane.showMessageDialog(null,
							"It looks like you've let it rot! The smell has killed your appetite; might as well throw it out while you're up.");

				}
			}

			else {
				JOptionPane.showMessageDialog(null,
						"Oh, no, you've tripped over your cat, fallen down the stairs, and broken your leg! Better call someone!");

			}

		}

		else {
			JOptionPane.showMessageDialog(null, "Well, goodnight.");

		}
	}
}
