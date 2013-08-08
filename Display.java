package com.egarduno.GPAcalc;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Display {
  private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lblGPA;
	private JLabel lbl4;
	private JTextField txtgpa;
	private JTextField txtCredits;
	private JButton btnCalc;
	private JButton btnAddGPA;
	private JButton btnExit;
	private GPAcalculator GPAcalc;
	
	public Display() {
		createFrame();
		GPAcalc = new GPAcalculator();
	}
	
	private void createFrame(){
		JFrame frame1 = new JFrame();
		frame1.setSize(400, 300);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.add(createGridPanel());
		frame1.setVisible(true);
	}

	private JPanel createGridPanel(){
		JPanel gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(3,2,5,5));
		
		lbl1 = new JLabel("Input Grade Point: ");
		txtgpa = new JTextField();
		lbl2 = new JLabel("Input Credit: ");
		txtCredits = new JTextField();
		
		lblGPA = new JLabel();
		lbl4 = new JLabel();
		
		btnCalc = new JButton("Calculate");
		btnCalc.addActionListener(new getGPA());
		
		btnAddGPA = new JButton("Add To GPA");
		btnAddGPA.addActionListener(new addEvent());
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new exitEvent());
		
		gridPanel.add(lbl1);
		gridPanel.add(txtgpa);
		gridPanel.add(lblGPA);
		gridPanel.add(lbl2);
		gridPanel.add(txtCredits);
		gridPanel.add(lbl4);
		gridPanel.add(btnCalc);
		gridPanel.add(btnAddGPA);
		gridPanel.add(btnExit);
		return gridPanel;
	}
	
	private class addEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Grades g = new Grades();			
			g.setGP(Double.parseDouble(txtgpa.getText()));
			g.setCredits(Double.parseDouble(txtCredits.getText()));

			GPAcalc.add(g);
			txtgpa.setText("");
			txtCredits.setText("");
		}
		
	}
	
	private class getGPA implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			double GPA=0;	
			GPA=GPAcalc.getGPA();
			lblGPA.setText("Your GPA is: "+ GPA);
		}
		
	}
	
	private class exitEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}
	}
	
}//End Class
