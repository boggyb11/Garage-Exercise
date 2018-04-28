import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reading {

	BufferedReader br = null;
	String line;
	
	public void readFile() {
		
		try {
			
//			All this can be written in one line
//			File myFile = new File("file1.txt");
//			FileReader r = new FileReader(myFile);
//			br = new BufferedReader(r);
			
			br= new BufferedReader( new FileReader("file1.txt"));
			
			try {
				
				while((line = br.readLine()) != null) {
					
					String[] PersonVariables = line.split(",");
					Person newPerson = new Person(PersonVariables[0], PersonVariables[1], PersonVariables[2]);
					
					Person.PersonList2.add(newPerson);
					System.out.println(newPerson);
				}
				
			} 
			catch (IOException e) {
					e.printStackTrace();
			}
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(br!=null)
				
				try {
					br.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
	}
	
}
