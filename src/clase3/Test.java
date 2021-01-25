package clase3;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>();
		
		English english = new English("Wilson");
		Spanish spanish = new Spanish("Estella");
		French french = new French("Wilder");
		Italian italian = new Italian("Celeste");
		Portuguese portuguese = new Portuguese("Isaí");
		
		people.add(english);
		people.add(spanish);
		people.add(french);
		people.add(italian);
		people.add(portuguese);
		
		for(int i = 0; i < people.size(); i++)
		{
			System.out.println(people.get(i).getName() + " " + people.get(i).greet());
		}

	}

}
