package FreeLab;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String cats = JOptionPane.showInputDialog("How many cats do you have");
		// 2. Convert their answer into an int
		int cat = Integer.parseInt(cats);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
		if (cat > 3) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady!");
			System.exit(0);
		}
		// 4. If they have 3 or less, call the method below to show them a cat video
		if (cat <= 3 && cat > 0) {
			playVideo("https://www.youtube.com/watch?v=cbP2N1BQdYc");
			System.exit(0);
		}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		if (cat == 0) {
			playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
			System.exit(0);
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
