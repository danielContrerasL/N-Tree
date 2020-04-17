package gui.createCharacter;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import contantGui.ConstantGui;
import n_treeStructure.InitTree;

@SuppressWarnings("serial")
public class CreatorWindow extends JDialog {

	private JPanel jPanelTree;
	private JPanel jPanelCenter;
	private JLabel level;
	private DefaultMutableTreeNode carpetaRaiz;
	private DefaultTreeModel modelo;
	private InitTree logicTree;
	private JTree graficTree;

	public CreatorWindow() {
		jPanelTree = new JPanel();
		jPanelCenter = new JPanel();
		level = new JLabel("5");
		logicTree = new InitTree();
		setLayout(new BorderLayout());
		initWindowSize();
		jPanelCenter.setLayout(new FlowLayout(FlowLayout.CENTER));
		addSlider();
		setLocationRelativeTo(null);
//		crearArbol();
		jPanelTree.setPreferredSize(new Dimension((int) (getWidth() * 0.4), getHeight()));
		JScrollPane s = new JScrollPane(jPanelTree);
		add(s, BorderLayout.LINE_START);
	}

	private void initWindowSize() {
		setSize((int) (ConstantGui.SCREEN_WIDTH * 0.4), (int) (ConstantGui.SCREEN_HEIGTH * 0.6));
	}

//	private void crearArbol() {
//		carpetaRaiz = new DefaultMutableTreeNode("Personage");
//		modelo = new DefaultTreeModel(carpetaRaiz);
//		JTree tree = new JTree(modelo);
//		DefaultMutableTreeNode carpeta2 = new DefaultMutableTreeNode("De 3 o mayor");
//		DefaultMutableTreeNode archivo1 = new DefaultMutableTreeNode("Estartegia de 1");
//		DefaultMutableTreeNode archivo2 = new DefaultMutableTreeNode("Estartegia de 2");
//		DefaultMutableTreeNode archivo3 = new DefaultMutableTreeNode("Estartegia 3");
//		modelo.insertNodeInto(carpeta2, carpetaRaiz, 0);
//		modelo.insertNodeInto(archivo1, carpetaRaiz, 0);
//		modelo.insertNodeInto(archivo2, carpetaRaiz, 0);
//		DefaultMutableTreeNode archivo4 = new DefaultMutableTreeNode("Estartegia 4");
//		DefaultMutableTreeNode archivo5 = new DefaultMutableTreeNode("Estartegia 5");
//		DefaultMutableTreeNode archivo6 = new DefaultMutableTreeNode("Estartegia 6");
//		DefaultMutableTreeNode archivo7 = new DefaultMutableTreeNode("Estartegia 7");
//		DefaultMutableTreeNode archivo8 = new DefaultMutableTreeNode("Estartegia 8");
//		DefaultMutableTreeNode archivo9 = new DefaultMutableTreeNode("Estartegia 9");
//		DefaultMutableTreeNode archivo10 = new DefaultMutableTreeNode("Estartegia 10");
//		modelo.insertNodeInto(archivo3, carpeta2, 0);
//		modelo.insertNodeInto(archivo4, carpeta2, 1);
//		modelo.insertNodeInto(archivo5, carpeta2, 2);
//		modelo.insertNodeInto(archivo6, carpeta2, 3);
//		modelo.insertNodeInto(archivo7, carpeta2, 4);
//		modelo.insertNodeInto(archivo8, carpeta2, 5);
//		modelo.insertNodeInto(archivo9, carpeta2, 6);
//		modelo.insertNodeInto(archivo10, carpeta2, 7);
//		tree.setBackground(getBackground());
//		tree.expandPath(new TreePath(carpeta2.getPath()));
//		tree.collapsePath(new TreePath(carpeta2.getPath()));
//		jPanelTree.add(tree);
//	}


	private void addSlider() {
		int FPS_MIN = 0;
		int FPS_MAX = 10;
		int FPS_INIT = 0; // initial frames per second

		JSlider framesPerSecond = new JSlider(JSlider.HORIZONTAL, FPS_MIN, FPS_MAX, FPS_INIT);
		framesPerSecond.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println("Entro " + framesPerSecond.getValue());
				level.setText(framesPerSecond.getValue() + "");

			}
		});

		// Turn on labels at major tick marks.
		framesPerSecond.setMajorTickSpacing(5);
		framesPerSecond.setMinorTickSpacing(1);
		framesPerSecond.setPaintTicks(true);
		framesPerSecond.setPaintLabels(true);
		jPanelCenter.add(framesPerSecond);
		jPanelCenter.add(level);
		add(jPanelCenter, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new CreatorWindow().setVisible(true);
		
	}
}
