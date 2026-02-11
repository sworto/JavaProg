import javax.swing.*;
import java.awt.*;
class check{
	public static void main(String[] args){
		JFrame basefield= new JFrame("PrimaryField");
		basefield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		basefield.setSize(1000,500);
		basefield.setVisible(true);


		String[] header={"A","B","C"};
		Object[][] data={
			{"123","456","789"},
			{"124","567","789"},
			{"223","998","989"}
		};
		JTable table= new JTable(data,header);
		JScrollPane sp= new JScrollPane(table);

		basefield.add(sp,BorderLayout.CENTER);
	}

}