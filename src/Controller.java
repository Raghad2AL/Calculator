import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	View view = new View();
	Model model = new Model();
	
	Controller (View V, Model M)
	{
		this.view=V;
		this.model=M;
		this.view.addLsn(new addLisn());
		this.view.subLsn(new subLisn());
		this.view.mulLsn(new mulLisn());
		this.view.divLsn(new divLisn());
		this.view.remLsn(new remLisn());
		this.view.sqrLsn(new sqrLisn());

		
	}//con
	
	class addLisn implements  ActionListener{
		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
			try{

				firstNumber = view.getFirstNumber();
				secondNumber = view.getSecondNumber();

				double result = model.addop(firstNumber, secondNumber);

				view.setCalcSolution(result);

			}

			catch(NumberFormatException ex){

				System.out.println(ex);

			view.displayErrorMessage("You Need to Enter 2 Integers");

			}
		}
	}//add
	
	class subLisn implements  ActionListener{
		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
			try{

				firstNumber = view.getFirstNumber1();
				secondNumber = view.getSecondNumber1();

				double result = model.subop(firstNumber, secondNumber);

				view.setCalcSolution1(result);

			}

			catch(NumberFormatException ex){

				System.out.println(ex);

			view.displayErrorMessage("You Need to Enter 2 Integers");

			}
		}
	}//add
	
	class mulLisn implements  ActionListener{
		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
			try{

				firstNumber = view.getFirstNumber11();
				secondNumber = view.getSecondNumber11();

				double result = model.mulop(firstNumber, secondNumber);

				view.setCalcSolution11(result);

			}

			catch(NumberFormatException ex){

				System.out.println(ex);

			view.displayErrorMessage("You Need to Enter 2 Integers");

			}
		}
	}//add
	class divLisn implements  ActionListener{
		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
			try{

				firstNumber = view.getFirstNumber111();
				secondNumber = view.getSecondNumber111();

				double result = model.divop(firstNumber, secondNumber);

				view.setCalcSolution111(result);

			}

			catch(NumberFormatException ex){

				System.out.println(ex);

			view.displayErrorMessage("You Need to Enter 2 Integers");

			}
		}
	}//add
	class remLisn implements  ActionListener{
		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
			try{

				firstNumber = view.getFirstNumber1111();
				secondNumber = view.getSecondNumber1111();

				double result = model.remop(firstNumber, secondNumber);

				view.setCalcSolution1111(result);

			}

			catch(NumberFormatException ex){

				System.out.println(ex);

			view.displayErrorMessage("Please Enter Valus to the text area befor pressing the button");

			}
		}
	}//add
	class sqrLisn implements  ActionListener{
		public void actionPerformed(ActionEvent e) {
			int firstNumber=0;
			try{

				firstNumber = view.getFirstNumber11111();
				
				double result = model.sqrop(firstNumber);

				view.setCalcSolution11111(result);

			}

			catch(NumberFormatException ex){

				System.out.println(ex);

			view.displayErrorMessage("You Need to Enter 2 Integers");

			}
		}
	}//add
}//class
