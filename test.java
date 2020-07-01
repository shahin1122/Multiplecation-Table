package Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import JTextArea.textArea1;

public class test extends JFrame {
	private static final String EA53DB = null;
	private Container c ;
	private JLabel l1 , l2 ;
	private JTextField tf ;
	private JTextArea ta ; 
	private JButton b; 
	private ImageIcon img;
	private Font f , f1 ;
	private Cursor cursor ;
	
	
	test(){
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);
		img = new ImageIcon(getClass().getResource("Untitled-1.png"));
		f = new Font("Curlz MT" , Font.BOLD , 35);
		f1= new Font("Chiller" , Font.BOLD, 25);
		cursor = new Cursor(cursor.HAND_CURSOR);
		
		
		l1 = new JLabel(img);
		l1.setBounds(0,0 ,385 ,200);
		c.add(l1);
		
		l2 = new JLabel("Enter Number");
		l2.setBounds(20 , 215 ,220,40);
		l2.setFont(f);
		l2.setForeground(Color.white);
		c.add(l2);
		
		tf = new JTextField();
		tf.setBounds(255 , 215 ,90 , 40);
		tf.setHorizontalAlignment(JTextField.CENTER);
		tf.setBackground(Color.decode("#9B1E1E"));
		tf.setForeground(Color.white);
		tf.setFont(f);
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String value = tf.getText();
				if(value.isEmpty()) {
					JOptionPane.showMessageDialog(null, "You dont inter any number ");
					
				}else
				{
					int num = Integer.parseInt(tf.getText());
					
					for(int i = 1 ; i<= 10; i++) {
						int res = num * i ;
						
						String r = String.valueOf(res);
						String n = String.valueOf(num);
						String loop = String.valueOf(i);
						
						ta.append("         "+n + " X " + loop + " = " + res + "\n");
						
					}
					
					
				}
				
				
				}
				
				
				
			
		});
		
		
		c.add(tf);
		
		b = new JButton("Clear");
		b.setBounds(255 , 275 , 90,40);
		b.setBackground(Color.decode("#9B1E1E"));
		b.setForeground(Color.white);
		b.setFont(f1);
		b.setCursor(cursor);

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ta.setText("");
				tf.setText("");
				
			}
			
			
			
		});
		
		c.add(b);
		
		ta = new JTextArea();
		ta.setBounds(10, 320, 365, 335);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setForeground(Color.black);
		ta.setFont(f1);
		c.add(ta);
		
		
		
	}
	
	public static void main(String []args) {
		
		test table = new test();
		table.setVisible(true);
		table.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		table.setBounds(300,20,400,700);
		table.setTitle("Multiplication Table");
		table.setResizable(false);
		
	}

}
