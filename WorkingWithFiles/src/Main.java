
public class Main {

	public static void main(String[] args) {

		//occupation, name age
		Person P1 = new Person("Truck Driver", "Dale", "30");
		Person P5 = new Person("Football Player", "James", "22");
		Person P4 = new Person("Teacher", "Darren", "50");
		Person P3 = new Person("Builder", "Tony", "41");
		Person P2 = new Person("Software Consultant", "Ben", "25");
		
		Person.PersonList1.add(P1);
		Person.PersonList1.add(P2);
		Person.PersonList1.add(P3);
		Person.PersonList1.add(P4);
		Person.PersonList1.add(P5);
		
		System.out.println("Printing out ArrayList1:");
		Person.printArrayList1();
		Writing myWriter = new Writing();
		myWriter.WriteFile();
		System.out.println("ArrayList Written to file1.txt !!!");

		System.out.println("Reading File and copying to new ArrayList....");
		reading myReader = new reading();
		myReader.readFile();
		
	}
}

/*
 * I need to iterate through the Array list 
 * I need to write each object to a file
 * I need to use a Buffered writer
 * 
 * I need to create a seperate array list 
 * I need to read from the created file and fill the array list 
 * 
 * String.split should be used
 * 
 * 
 * 
 * */




