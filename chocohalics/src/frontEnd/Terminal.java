package frontEnd;

public class Terminal {
	
	String UIType;

	public void output(String output){
		switch(UIType){
		case "Console":
			Console.setOutput(output); 
			break;
		case "GUI":
			GUI.setOutput(output);
			break;
		}
		

}
