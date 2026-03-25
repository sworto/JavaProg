import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class radiocolor implements ActionListener{
		JFrame f1= new JFrame("ColorToggleApp");

		JRadioButton rb1= new JRadioButton("Button1",true);
		JRadioButton rb2= new JRadioButton("Button2",false);
		ButtonGroup bg= new ButtonGroup();

		JTextField t1= new JTextField("TEXTFIELD1");
		JTextField t2= new JTextField("TEXTFIELD2");
	radiocolor(){
		f1.setSize(1000,1000);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLayout(new GridLayout(2,2));

		
		bg.add(rb1);
		bg.add(rb2);

		t1.setBackground(Color.RED);
		t2.setBackground(Color.BLUE);

		rb1.addActionListener(this);
		rb2.addActionListener(this);

		f1.add(rb1);
		f1.add(rb2);
		f1.add(t1);
		f1.add(t2);
		f1.pack();
		f1.setVisible(true);
	}
	public static void main(String[] args){
		new radiocolor();
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==rb1){
			t1.setBackground(Color.RED);
			t2.setBackground(Color.BLUE);
		}
		else{
			t1.setBackground(Color.BLUE);
			t2.setBackground(Color.RED);
		}
		return;
	}
}