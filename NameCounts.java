import acm.program.*;
import java.util.*;

public class NameCounts extends ConsoleProgram {

	HashMap<String,Integer> names = new HashMap<String,Integer>();
	String name;
	
	public void run() {
		
		promptForNames();

		printNames();
	}

	private void promptForNames() {

		while(true) {

			name = readLine("Enter name: ");
			if(name.equals("")) break;
			if(names.containsKey(name) == false) 
				names.put(name, 1);
			else {
				int addOne = names.get(name) + 1;
				names.put(name, addOne);
			}
		}
	}
	private void printNames() {
		for(String name : names.keySet()) {
			println("Entry [" + name + "] has count " + names.get(name));
		}
	}
}


