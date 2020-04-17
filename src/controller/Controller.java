package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.logWindow.LogWindow;
import gui.mainWindow.MainUserWindow;
import gui.mainWindow.SplashDialog;
import logic.ManagerLogIn;

public class Controller implements ActionListener {

	private MainUserWindow mainWindow;
	private SplashDialog dialog;
	private LogWindow logWindow;
	private ManagerLogIn managerLogIn;

	public Controller() {
		managerLogIn = new ManagerLogIn();
		openSplash();
	}

	private void openSplash() {
		dialog = new SplashDialog();
		dialog.setVisible(true);
		dialog.startProgressBar();
		logWindow = new LogWindow(this);
		logWindow.setVisible(true);
	}

	private void openWindow() {
		managerLogIn.asingValues(logWindow.getjTFLogIn(), logWindow.getPasswordLogIn());
		managerLogIn.validateLogIn();
		if (!managerLogIn.getUser().isSuperUser()) {
			logWindow.setVisible(false);
			mainWindow = new MainUserWindow();
			mainWindow.setVisible(true);
		} else {
			// ------------------admin window
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Actions.valueOf(e.getActionCommand())) {
		case ACTION_ENTER:
			openWindow();
			break;
		case ACTION_REGISTRY:

			break;

		default:
			break;
		}
	}

}
