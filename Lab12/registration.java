import javax.swing.*;
import java.awt.*;
class registration{
	public static void main(String[] args){
		//Frame
		JFrame f1= new JFrame();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLayout(new GridLayout(2,3));
		f1.setSize(1000,1000);
		//Component
		JLabel lb= new JLabel("LabelName");
		JRadioButton rb= new JRadioButton("String");
		JTextField tf= new JTextField(20);
		JCheckBox jc= new JCheckBox("CheckBoxName",false);
		JLabel img= new JLabel(new ImageIcon("/home/sworto/Documents/JavaProg/Lab12/sampleimage.jpeg"));
		JButton jb= new JButton("Button");
		//Adding
		/*f1.add(jc,BorderLayout.EAST);
		f1.add(lb,BorderLayout.NORTH);
		f1.add(rb,BorderLayout.NORTH);
		f1.add(tf,BorderLayout.SOUTH);
		f1.add(img,BorderLayout.CENTER);
		f1.add(jb,BorderLayout.CENTER);*/

		f1.add(jc);
		f1.add(lb);
		f1.add(rb);
		f1.add(tf);
		f1.add(img);
		f1.add(jb);
		f1.pack();
		f1.setVisible(true);
		return;
	}
}