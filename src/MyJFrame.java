import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.soa.ws.tp.WebServiceComposite;
import com.soa.ws.tp.WebServiceCompositeImplService;


public class MyJFrame extends JFrame{
	
	private JTextField textField;

	public MyJFrame () {
		super();
		initMyJFrame();
	}

	private void initMyJFrame() {
		this.setSize(500, 450);
		this.setTitle("JFrame - Exercice");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("ID Produit: ");
	    this.getContentPane().add(label);
	    
	    textField = new JTextField("Entrez id produit..");
	    textField.setColumns(20);
	    this.getContentPane().add(textField);
	    
	    JButton button = new JButton("Submit");
	    this.getContentPane().add(button);
	    button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				WebServiceCompositeImplService service = new WebServiceCompositeImplService();
				WebServiceComposite stub  = service.getWebServiceCompositeImplPort();
				
				String str = stub.verifCategProduct(textField.getText());
				
				System.out.println(str);
				
			}});
		
	}


}
