import javax.swing.*;
import javax.swing.table.*;

import java.awt.*;

public class GUII extends JFrame {

	public GUII() {
		setSize(1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("����ó�� �����ý���");

		
		setLayout(null);
		
		JButton btn1 = new JButton("����");
		add(btn1);
		btn1.setBounds(100, 50, 100, 50);

		JTextField txt1 = new JTextField(10);
		add(txt1);
		txt1.setBounds(200, 50, 100, 50);

		JButton btn2 = new JButton("����");
		add(btn2);
		btn2.setBounds(100, 100, 100, 50);

		JTextField txt2 = new JTextField(10);
		add(txt2);
		txt2.setBounds(200, 100, 100, 50);

		JButton btn3 = new JButton("����");
		add(btn3);
		btn3.setBounds(100, 150, 100, 50);

		JTextField txt3 = new JTextField(10);
		add(txt3);
		txt3.setBounds(200, 150, 100, 50);

		Button btn4 = new Button("����");
		add(btn4);
		btn4.setBounds(300, 50, 100, 50);

		Button btn5 = new Button("����");
		add(btn5);
		btn5.setBounds(300, 100, 100, 50);

		Button btn6 = new Button("����");
		add(btn6);
		btn6.setBounds(300, 150, 100, 50);

		JPanel panelTable = new JPanel();
		panelTable.setLayout(new BorderLayout());
		panelTable.setBounds(410, 0, 600, 350);
		
		String header[] = { "�л� �̸�", "����", "����", "����" };
		
		DefaultTableModel model = new DefaultTableModel(null, header);
		JTable table1 = new JTable(model);
		JScrollPane sc = new JScrollPane(table1);

		
		panelTable.add(sc, "West");
		add(panelTable);
		setVisible(true);

	}

	public static void main(String[] args) {
		GUII g = new GUII();

	}
}
