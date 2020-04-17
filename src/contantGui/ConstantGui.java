package contantGui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class ConstantGui {

	public static final String DF_PATH = "/ima/forest.jpg";
	public static Font FONT= new Font("Parchment", Font.PLAIN	,18);
	
	private static final Dimension SCREEN_SIZE  = Toolkit.getDefaultToolkit().getScreenSize();
	public static final double SCREEN_WIDTH = SCREEN_SIZE.getWidth();
	public static final double SCREEN_HEIGTH = SCREEN_SIZE.getHeight();

}
