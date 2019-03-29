
public class Main {
	public static void main(String[] args) {
    View myV = new View();
    Model myM = new Model();
    Controller myC = new Controller(myV,myM);
    myV.setSize(500,300);
	myV.setVisible(true);
	//this.pack();

	}
}
