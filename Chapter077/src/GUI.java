import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

	public GUI() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("성적처리 관리시스템");
        
	    this.setLayout(null);
	    
	    
	    
	    JButton btn1 = new JButton("국어");
	    this.add(btn1);
	    btn1.setBounds(100, 50, 100, 50);
	    
	    
	    
	    JTextField txt1 = new JTextField(10);
	    this.add(txt1);
	    txt1.setBounds(100, 50, 250, 50);
	    
	    
	    
	   JButton btn2 = new JButton("수학");
	   this.add(btn2);
	   btn2.setBounds(100,100, 100, 50);
	    
	    
	    JTextField txt2 = new JTextField(10);
	    this.add(txt2);
	    txt2.setBounds(150, 100,  200, 50);
	    
	    
	    
	    //JButton btn3 = new JButton("영어");
	    //this.add(btn3); 
	    //btn3.setBounds(10, 20, 30, 50);
	    
	    
	    //JTextField txt3 = new JTextField(10);
	    // this.add(txt3);
	    // txt3.setBounds(0, 0, 30, 50);
	    
	    
	    
	    setVisible(true);
	}

	public static void main(String[] args) {
	    GUI g = new GUI();
	}
}