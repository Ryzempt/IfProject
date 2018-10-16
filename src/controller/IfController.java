package controller;

//import selection
import ifmodel.FirmlyGraspIt;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class IfController
{
	/**
	 * Builds the instance of the Controller.
	 */
	public IfController()
	{

	}

	/**
	 * This is where the program starts calling methods to run the program.
	 */

	public void start()
	{
		askUser();
		loop();

	}

	 private void loopy()
	 {
	 boolean isDone = false;
	 int count = 0;

	 while(!isDone)
	 {
	 JOptionPane.showMessageDialog(null, "brother may I have some loops?");
	 count++;
	 if (count >= 10)
	{
	 isDone = true;
	 }
	 }
	 }

	private void loop()

	{
		 boolean isDone = false;

		 {
		 JOptionPane.showMessageDialog(null, "Skylar lost his chest, please help him find it");

		 
		 {
		{
		}
		int count = 0;
		for (int loop = 30; loop >= 0; loop -= 15)
		{
			askUser();
			JOptionPane.showMessageDialog(null, "The loop value is: " + loop + "'th Amazing loop I made");
		}
		 }
		 } 
	}

	private void LotsofGrasp()
	{
		//Local variables are ONLY visible in the method they are defined in!
		
		ArrayList<FirmlyGraspIt> myRuns = new ArrayList<FirmlyGraspIt>();
		
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		
		
		FirmlyGraspIt sampleRun = new FirmlyGraspIt();
		FirmlyGraspIt otherRun = new FirmlyGraspIt();
		
		myRuns.add(sampleRun);
		myRuns.add(sampleRun);
		myRuns.add(otherRun);
		
		for (int index =0; index < myRuns.size(); index +=1)
			
		{
			JOptionPane.showMessageDialog(null,  myRuns.get(index).getName());
			
			FirmlyGraspIt currentRun = myRuns.get(index);
			JOptionPane.showMessageDialog(null,  currentRun.getName());
			currentRun.setName("The new name is " + index + "run");
			currentRun.setDistance(index * (int) (Math.random() * 300));
			
		}
		
		{
			
		}
	
		
		for (int index = myRuns.size() - 1; index >= 0; index -= 1)
		{
			
		}
		
		for (FirmlyGraspIt current : myRuns)
		{
			JOptionPane.showMessageDialog(null,  "The run is named:" + current.getName());
		}
		
	}
	
	private void askUser()
	{

		String response = JOptionPane.showInputDialog(null, "What is the Distance");
		while (response == null || !validDouble(response))
		{
			
		}
		FirmlyGraspIt userFirmlyGraspIt = new FirmlyGraspIt();
		while (!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "No! type in a valid number for the distance");
		}
		userFirmlyGraspIt.setDistance(Double.parseDouble(response));
		
		response = JOptionPane.showInputDialog(null, "what is the name of the run?");
		if (response == null || response.equals("CTEC"))
		{
			JOptionPane.showMessageDialog(null, "You either pressed cancel, the X, or typed nothing >:(");
		}

	}

	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should type an integer value like 2");
		}
		return isValid;
	}

	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value");

		}
		{
			JOptionPane.showMessageDialog(null, "You are stupid");
		}

		return isValid;

	}
 
	{

	}
}
