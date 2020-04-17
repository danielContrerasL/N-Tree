package gui.logWindow;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import contantGui.ConstantGui;
import controller.Actions;
import controller.Controller;

@SuppressWarnings("serial")
public class LogWindow extends JDialog {

	private JButton jBClose;
	private JButton jBLogIn;
	private JPanel centerPanel;
	private JPanel pageEndPanel;
	private GridBagConstraints c;

	private JPasswordField passwordField;
	private JPasswordField passwordConfirmField;
	private JPasswordField passwordLogInField;
	
	private JTextField jTFLogIn;
	private TitledBorder title;

	private JLabel jLNickName;
	private JLabel jLName;
	private JLabel jLGender;
	private JLabel jLPassword;
	private JLabel jLConfirm;
	
	private JRadioButton m;
	private JRadioButton f;
	private ButtonGroup b;

	public LogWindow(Controller controller) {
		b = new ButtonGroup();
		
		setLayout(new BorderLayout());
		setUndecorated(true);
		initWindowSize();
		initWindow(controller);
		setLocationRelativeTo(null);
	}

	private void initWindow(Controller controller) {
		initComponent(controller);
		initPageEndPanel();
		centerPanel.setLayout(new GridBagLayout());
		jBClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		p.add(jBClose);
		initRegistryPanel(controller);
		add(p, BorderLayout.PAGE_START);
		add(centerPanel, BorderLayout.CENTER);
	}
	
	private void initPageEndPanel() {
		pageEndPanel.setLayout(new FlowLayout());
		pageEndPanel.add(jTFLogIn);
		pageEndPanel.add(passwordLogInField);
		pageEndPanel.add(jBLogIn);
		add(pageEndPanel, BorderLayout.SOUTH);
	}
	
	private void initRegistryPanel(Controller controller) {
		c = new GridBagConstraints();
//		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.weighty = 0.01;
		c.gridheight = 1;
		for (int i = 0; i < 12; i++) {
			c.gridx = i;
			c.gridy = i;
			centerPanel.add(new JLabel(), c);
		}
		m = new JRadioButton("M");
		c.fill = GridBagConstraints.NONE;
		c.gridx = 7;
		c.gridy = 5;
		c.gridwidth = 1;
		c.gridheight = 1;
		centerPanel.add(m, c);
		f =new JRadioButton("f");
		c.gridx = 7;
		c.gridy = 6;
		c.gridwidth = 1;
		c.gridheight = 1;
		centerPanel.add(f, c);
		b.add(f);
		b.add(m);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		c.gridwidth = 3;
		c.gridheight = 1;
		centerPanel.add(jLNickName, c);
		
		c.gridx = 2;
		c.gridy = 3;
		c.gridwidth = 3;
		c.gridheight = 1;
		centerPanel.add(jLName, c);
		
		c.gridx = 2;
		c.gridy = 5;
		c.gridwidth = 3;
		c.gridheight = 1;
		centerPanel.add(jLGender, c);
		
		c.gridx = 2;
		c.gridy = 7;
		c.gridwidth = 3;
		c.gridheight = 1;
		centerPanel.add(jLPassword, c);
		
		c.gridx = 2;
		c.gridy = 9;
		c.gridwidth = 3;
		c.gridheight = 1;
		centerPanel.add(jLConfirm, c);
		
		JButton jBRegistry = new JButton("Registrarse");
		jBRegistry.addActionListener(controller);
		jBRegistry.setActionCommand(Actions.ACTION_REGISTRY.toString());
		c.gridx = 4;
		c.gridy = 11;
		c.gridwidth = 4;
		c.gridheight = 1;
		centerPanel.add(jBRegistry, c);
		
		c.gridx = 7;
		c.gridy = 1;
		c.gridwidth = 3;
		c.gridheight = 1;
		centerPanel.add(new TextField(), c);
		
		c.gridx = 7;
		c.gridy = 3;
		c.gridwidth = 3;
		c.gridheight = 1;
		centerPanel.add(new TextField(), c);
		
		c.gridx = 7;
		c.gridy = 7;
		c.gridwidth = 3;
		c.gridheight = 1;
		centerPanel.add(passwordField, c);
		
		c.gridx = 7;
		c.gridy = 9;
		c.gridwidth = 3;
		c.gridheight = 1;
		centerPanel.add(passwordConfirmField, c);
	}
	
	private void initComponent(Controller controller) {
		jBClose = new JButton("X");
		jBLogIn = new JButton("Entrar");
		jBLogIn.addActionListener(controller);
		jBLogIn.setActionCommand(Actions.ACTION_ENTER.toString());
		centerPanel = new JPanel();
		title = BorderFactory.createTitledBorder("Registro");
		centerPanel.setBorder(title);
		pageEndPanel = new JPanel();
		title = BorderFactory.createTitledBorder("Log-In");
		pageEndPanel.setPreferredSize(new Dimension(getWidth(), (int)(getHeight() * 0.18)));
		pageEndPanel.setBorder(title);
		jLNickName = new JLabel("Nick Name");
		jLName = new JLabel("Nombre");
		jLGender = new JLabel("Genero");
		jLPassword = new JLabel("Contraseña");
		jLConfirm = new JLabel("Confirmar Contraseña");
		passwordField = new JPasswordField();
		jTFLogIn = new JTextField();
		
		title = BorderFactory.createTitledBorder("Contraseña");
		passwordLogInField = new JPasswordField();
		Dimension d = new Dimension((int)(pageEndPanel.getPreferredSize().width * 0.45), (int)(pageEndPanel.getPreferredSize().height * 0.4));
		passwordLogInField.setBorder(title);
		passwordLogInField.setPreferredSize(d);
		passwordConfirmField = new JPasswordField();
		jTFLogIn.setPreferredSize(d);
		title = BorderFactory.createTitledBorder("Nick Name");
		jTFLogIn.setBorder(title);
	}
	
	public String getjTFLogIn() {
		return jTFLogIn.getText();
	}
	
	public String getPasswordLogIn() {
		String password = "";
		for (char i : passwordLogInField.getPassword()) {
			password += i;
		}
		return password;
	}

	private void initWindowSize() {
		setSize((int) (ConstantGui.SCREEN_WIDTH * 0.35), (int) (ConstantGui.SCREEN_HEIGTH * 0.7));
	}


}
