package gui.mainWindow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import contantGui.ConstantGui;

@SuppressWarnings("serial")
public class MainAdminWindow extends JFrame{
	
	public MainAdminWindow() {
		initWindow();
	}

	private void initWindow() {
		setTitle("Administrador");
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initSizeWindow();
		initPanel();
	}

	private void initPanel() {
		JPanel p = new JPanel();
		p.setBackground(Color.RED);
		add(p, BorderLayout.WEST);
		p = new JPanel();
		p.setBackground(Color.YELLOW);
		add(p, BorderLayout.EAST);
		p = new JPanel();
		p.setBackground(Color.BLUE);
		p.setLayout(new BorderLayout());
		p.add(new JPanel(), BorderLayout.SOUTH);
		add(p, BorderLayout.CENTER);
	}

	private void initSizeWindow() {
		setMinimumSize(new Dimension((int)(ConstantGui.SCREEN_WIDTH* 0.75), (int)(ConstantGui.SCREEN_HEIGTH * 0.8)));
	}
	

}
