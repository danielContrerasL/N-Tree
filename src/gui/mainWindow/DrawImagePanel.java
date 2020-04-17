package gui.mainWindow;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import contantGui.ConstantGui;

@SuppressWarnings("serial")
public class DrawImagePanel extends JPanel {

	private Image bg;

	public DrawImagePanel() {
		bg = new ImageIcon(getClass().getResource(ConstantGui.DF_PATH)).getImage();
	}

	public DrawImagePanel(Image bg) {
		this.bg = bg;
	}

	public void updateDfImage() {
		bg = new ImageIcon(getClass().getResource(ConstantGui.DF_PATH)).getImage();
		repaint();
	}

	public void updateBg(Image bg) {
		this.bg = bg;
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.bg, 0, 0, this.getWidth(), this.getHeight(), this);
	}

}
