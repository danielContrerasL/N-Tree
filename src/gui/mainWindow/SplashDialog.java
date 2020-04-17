package gui.mainWindow;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JProgressBar;

import contantGui.ConstantGui;

@SuppressWarnings("serial")
public class SplashDialog extends JDialog {

	private JProgressBar progressBar;

	public SplashDialog() {
		setUndecorated(true);
		setAlwaysOnTop(true);
		initSizeWindow();
		setLayout(new BorderLayout());
		add(new DrawImagePanel());
		initProgresBar();
	}

	private void initProgresBar() {
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setFont(ConstantGui.FONT);
		progressBar.setBackground(new Color(93, 188, 210));
		progressBar.setForeground(new Color(101, 12, 153));
		add(progressBar, BorderLayout.SOUTH);
	}

	public void startProgressBar() {
		for (int i = 0; i <= 100; i++) {
			progressBar.setValue(i);
			try {
				Thread.sleep(100 - i);
			} catch (InterruptedException e) {
			}
		}
		dispose();
	}

	private void initSizeWindow() {
		setSize((int) (ConstantGui.SCREEN_WIDTH * 0.64), (int) (ConstantGui.SCREEN_HEIGTH * 0.6));
		setLocation((int) (ConstantGui.SCREEN_WIDTH * 0.18), (int) (ConstantGui.SCREEN_HEIGTH  * 0.2));
		setMinimumSize(getSize());
//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//		setSize((int) (screenSize.getWidth() * 0.64), (int) (screenSize.getHeight() * 0.6));
//		setLocation((int) (screenSize.getWidth() * 0.18), (int) (screenSize.getHeight() * 0.2));
//		setMinimumSize(getSize());
	}

}
