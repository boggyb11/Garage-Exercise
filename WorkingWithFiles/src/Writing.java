import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {

	
public void WriteFile() {
	
	BufferedWriter bw = null; 
	
	try {
		
		File file = new File("file1.txt"); //File location to write to
		FileWriter fw = new FileWriter(file); //create file writer
		bw = new BufferedWriter(fw);	// buffer around the file writer
		
		for(Person Persons : Person.PersonList1) { //loop through array list 
			bw.write(Persons.toString()+"\n"); // convert array list to string then write to file
		}
	}
	catch(IOException ioe){  // catch exceptions
		ioe.printStackTrace(); //print out trace
	}
	//finally to close the reader
	finally{
		
		try{
			if (bw!=null) {
				bw.close();
			}
		}
			catch(Exception ex) { //catch exceptions for this
				System.out.println("Error with Buffered Writer");
			}
			
	}
}
}


/* 
 * STEPS TO CREATE A FILE READER
 * 1. BUFFERED WRITER TO NULL
 * 
 * PUT IN TRY WITH RESOURCES:
 * 2. FILE LOCATION OBJECT (TAKES PATH)
 * 3. FILE WRITER OBJECT (TAKES FILE)
 * 4. BUFFER THE FILE WRITER
 * 5.LOGIC THEN BUFFERED WRITER . WRITE
 * 
 * CATCH EXCEPTIONS
 * 
 * FINALLY CLOSE THE WRITER
 * 
 * 
 * 
 * 
 * */
