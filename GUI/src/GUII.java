import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class GUII extends JFrame {

	public GUII() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("����ó�� �����ý���");
        
	    this.setLayout(null);
	    
	    
	    
	    JButton btn1 = new JButton("����");
	    this.add(btn1);
	    btn1.setBounds(100, 50, 100, 50);
	    
	 
	    
	    JTextField txt1 = new JTextField(10);
	    this.add(txt1);
	    txt1.setBounds(200, 50, 100, 50);
	    
	    
	    
	    
	   JButton btn2 = new JButton("����");
	   this.add(btn2);
	   btn2.setBounds(100,100, 100, 50);
	    
	    
	    JTextField txt2 = new JTextField(10);
	    this.add(txt2);
	    txt2.setBounds(200, 100,  100, 50);
	    
	    
	    
	    JButton btn3 = new JButton("����");
	    this.add(btn3); 
	    btn3.setBounds(100,150, 100, 50);
	    
	    
	    JTextField txt3 = new JTextField(10);
	    this.add(txt3);
	    txt3.setBounds(200, 150, 100, 50);
	    
	    
	    Button btn4 = new Button("����");
	    this.add(btn4);
	    btn4.setBounds(150,1,1,1);
	    
	    setVisible(true);
	}

	public static void main(String[] args) {
	    GUII g = new GUII();
	}
}
