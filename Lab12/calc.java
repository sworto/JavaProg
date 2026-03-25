import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class calc implements ActionListener{
		JFrame f1= new JFrame();

		//Elements
		JTextField tf1= new JTextField();
		JTextField tf2= new JTextField();
		JTextField tf3= new JTextField();
		JButton b1= new JButton("Add");
		JButton b2= new JButton("Sub");
		JButton b3= new JButton("Mul");
		calc(){
			f1.setLayout(new GridLayout(2,3));
			f1.setSize(1000,1000);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f1.add(tf1);
			f1.add(tf2);
			f1.add(tf3);
			f1.add(b1);
			f1.add(b2);
			f1.add(b3);
			f1.setVisible(true);

			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
		}
	public static void main(String[] args){
		new calc();
		return;
	}
	public void actionPerformed(ActionEvent e){
		int x=Integer.parseInt(tf1.getText());
		int y=Integer.parseInt(tf2.getText());
		if(e.getSource()==b1){
			tf3.setText((x+y)+"");
			System.out.println("ADDITION: "+(x+y));
		}
		else if(e.getSource()==b2){
			tf3.setText((x-y)+"");
			System.out.println("SUBTRACTION: "+(x-y));
		}
		else if(e.getSource()==b3){
			tf3.setText((x*y)+"");
			System.out.println("MULTIPLICATION: "+(x*y));
		}
		else{
			tf3.setText("INVALID INPUTS UNKNOWN ERROR");
		}
		return;
	}
}