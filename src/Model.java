import javax.swing.JOptionPane;

public class Model {

	double result, result1, result11,result111,result1111,result11111;
	
	
	public double addop(double no1, double no2)
	{
		
		try
		{
		result= no1 + no2; 
		}
	    catch (Exception ee)
		{
	    	JOptionPane.showMessageDialog(null, "Warning!!!!, it seems you entered invalid inputs, enter double numbers only.");
	    	result=0.0; 
	    		    
	   	}	
		return result;
		
	}//add
	
	public double subop(double no1, double no2)
	
	{
		
		try
		{
		result1= no1 - no2; 
		}
	    catch (Exception ee)
		{
	    	JOptionPane.showMessageDialog(null, "Warning!!!!, it seems you entered invalid inputs, enter double numbers only.");
	    	result1=0.0; 
	    	    
	   	}	
		return result1;
	}//sub
	
public double mulop(double no1, double no2)
	
	{
		
		try
		{
		result11= no1 * no2; 
		}
	    catch (Exception ee)
		{
	    	JOptionPane.showMessageDialog(null, "Warning!!!!, it seems you entered invalid inputs, enter double numbers only.");
	    	result11=0.0; 
	    		    
	   	}	
		return result11;
	}//mul

public double divop(double no1, double no2)
{
 
	
	if(no2 == 0)
	{
	JOptionPane.showMessageDialog(null, "DONT DIVIDE BY ZERO!!!");
	result111=0.0; 
	
	}
	else
	{
	try
	{
	result111 =no1/ no2; 
	}// end try 
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, "Warning!!!!, it seems you entered invalid inputs, enter double numbers only."); 
		result=0.0;
	
	}// end catch
	}// end else 
	return result111;
}// end divide
	

public double remop(double no1, double no2)
{

	no1 = (int) no1; 
	no2 = (int) no2; 
			
	if(no2 == 0)
	{
	JOptionPane.showMessageDialog(null, "DONT DIVIDE BY ZERO!!!");
	result1111=0.0; 
	 
	}
	else
	{		
	try
	{
		result =no1 % no2; 
	}
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, "Warning!!!!, it seems you entered invalid inputs, enter double numbers only.");
		result1111=0.0; 
	
	}// end catch	
	}// end else 
	return result1111;
   } // end remainder

public double sqrop(double no1)
{
	
	
	if(no1 >= 0)
	{
	try
	{
	result11111 = Math.sqrt(no1); 
	}
    catch (Exception ee)
	{
    	JOptionPane.showMessageDialog(null,"Warning!!!!, it seems you entered invalid inputs, enter double numbers only.");
    result11111=0.0; 
    	
   	}
	}// end if 
	else 
	{
		JOptionPane.showMessageDialog(null, "Insert Positive Values Only.");
		result11111=0.0; 
		
	}// end else 	
	
	return result11111;
	
}// end square root 


}//class
