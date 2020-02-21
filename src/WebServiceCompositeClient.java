import javax.swing.SwingUtilities;

public class WebServiceCompositeClient {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MyJFrame frame = new MyJFrame();			
				frame.setVisible(true);
				
			}
		});		

	}

}
