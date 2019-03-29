import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class View extends JFrame{

	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	JPanel addPanel = new JPanel(); 
	
	private JTextField firstNumber1  = new JTextField(10);
	private JLabel additionLabel1 = new JLabel("-");
	private JTextField secondNumber1 = new JTextField(10);
	private JButton calculateButton1 = new JButton("Calculate");
	private JTextField calcSolution1 = new JTextField(10);
	JPanel addPanel1 = new JPanel(); 
	private JTextField firstNumber11  = new JTextField(10);
	private JLabel additionLabel11 = new JLabel("*");
	private JTextField secondNumber11 = new JTextField(10);
	private JButton calculateButton11 = new JButton("Calculate");
	private JTextField calcSolution11 = new JTextField(10);
	JPanel addPanel11 = new JPanel(); 
	
	private JTextField firstNumber111 = new JTextField(10);
	private JLabel additionLabel111 = new JLabel("/");
	private JTextField secondNumber111 = new JTextField(10);
	private JButton calculateButton111 = new JButton("Calculate");
	private JTextField calcSolution111 = new JTextField(10);
	JPanel addPanel111 = new JPanel(); 
	
	private JTextField firstNumber1111  = new JTextField(10);
	private JLabel additionLabel1111 = new JLabel("%");
	private JTextField secondNumber1111 = new JTextField(10);
	private JButton calculateButton1111 = new JButton("Calculate");
	private JTextField calcSolution1111 = new JTextField(10);
	JPanel addPanel1111 = new JPanel(); 
	
	private JTextField firstNumber11111  = new JTextField(10);
	private JLabel additionLabel11111 = new JLabel("sqr");
	private JButton calculateButton11111 = new JButton("Calculate");
	private JTextField calcSolution11111 = new JTextField(10);
	JPanel addPanel11111 = new JPanel(); 
	View()
	{
		addPanel.add(firstNumber);
		addPanel.add(additionLabel);
		addPanel.add(secondNumber);
		addPanel.add(calculateButton);
		addPanel.add(calcSolution);
		
		addPanel.add(firstNumber1);
		addPanel.add(additionLabel1);
		addPanel.add(secondNumber1);
		addPanel.add(calculateButton1);
		addPanel.add(calcSolution1);
		
		addPanel.add(firstNumber11);
		addPanel.add(additionLabel11);
		addPanel.add(secondNumber11);
		addPanel.add(calculateButton11);
		addPanel.add(calcSolution11);
		
		addPanel.add(firstNumber111);
		addPanel.add(additionLabel111);
		addPanel.add(secondNumber111);
		addPanel.add(calculateButton111);
		addPanel.add(calcSolution111);
		
		addPanel.add(firstNumber1111);
		addPanel.add(additionLabel1111);
		addPanel.add(secondNumber1111);
		addPanel.add(calculateButton1111);
		addPanel.add(calcSolution1111);
		
		addPanel.add(firstNumber11111);
		addPanel.add(additionLabel11111);
		addPanel.add(calculateButton11111);
		addPanel.add(calcSolution11111);
		
		
		
		this.add(addPanel);
		
		//this.setLocationRelativeTo(null);
     //  this. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

	}//construcot
	void addLsn(ActionListener lisn)
	{
		calculateButton.addActionListener(lisn);
	}
	void subLsn(ActionListener lisn)
	{
		calculateButton1.addActionListener(lisn);
	}
	void mulLsn(ActionListener lisn)
	{
		calculateButton11.addActionListener(lisn);
	}
	void divLsn(ActionListener lisn)
	{
		calculateButton111.addActionListener(lisn);
	}
	void remLsn(ActionListener lisn)
	{
		calculateButton1111.addActionListener(lisn);
	}
	void sqrLsn(ActionListener lisn)
	{
		calculateButton11111.addActionListener(lisn);
		
	}
	
	
	

	public int getFirstNumber(){

		return Integer.parseInt(firstNumber.getText());

	}

	public int getSecondNumber(){

		return Integer.parseInt(secondNumber.getText());

	}

	public void setCalcSolution(double solution){

		calcSolution.setText(Double.toString(solution));
	}

	public int getFirstNumber1(){

		return Integer.parseInt(firstNumber1.getText());

	}

	public int getSecondNumber1(){

		return Integer.parseInt(secondNumber1.getText());

	}

	
	public void setCalcSolution1(double solution){

		calcSolution1.setText(Double.toString(solution));

	}
		public int getFirstNumber11(){

			return Integer.parseInt(firstNumber11.getText());

		}

		public int getSecondNumber11(){

			return Integer.parseInt(secondNumber11.getText());

		}

		
		public void setCalcSolution11(double result){

			calcSolution11.setText(Double.toString(result));

		}
		
		public int getFirstNumber111(){

			return Integer.parseInt(firstNumber111.getText());

		}

		public int getSecondNumber111(){

			return Integer.parseInt(secondNumber111.getText());

		}

		
		public void setCalcSolution111(double solution){

			calcSolution111.setText(Double.toString(solution));

		}
		
		public int getFirstNumber1111(){

			return Integer.parseInt(firstNumber1111.getText());

		}

		public int getSecondNumber1111(){

			return Integer.parseInt(secondNumber1111.getText());

		}

		
		public void setCalcSolution1111(double solution){

			calcSolution1111.setText(Double.toString(solution));

		}
		
		public int getFirstNumber11111(){

			return Integer.parseInt(firstNumber11111.getText());

		}

		public void setCalcSolution11111(double solution){

			calcSolution11111.setText(Double.toString(solution));

		}
		
		void displayErrorMessage(String errorMessage){

			JOptionPane.showMessageDialog(this, errorMessage);

		}
		
		

}//class
