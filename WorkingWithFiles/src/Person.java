import java.util.ArrayList;

public class Person {
	
	public static ArrayList<Person> PersonList1 = new ArrayList<>();
	public static ArrayList<Person> PersonList2 = new ArrayList<>();
	
	String Occupation;
	String Name;
	String Age;
	
	public Person(String Occupation, String Name, String Age) {
		this.Age = Age;
		this.Occupation= Occupation;
		this.Name=Name;
	}

	public static void printArrayList1() {
		
		for (Person persons : PersonList1) {
			System.out.println(persons.toString());
		}
	}
	public static void printArrayList2() {
		
		for (Person persons : PersonList2) {
			System.out.println(persons.toString());
		}
	}
	

	
	
	@Override
	public String toString() {
		return "Person [Occupation=" + Occupation + ", Name=" + Name + ", Age=" + Age + "]";
	}

	
}
