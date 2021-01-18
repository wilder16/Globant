package class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		int option; 
		
		
		Scanner captor = new Scanner(System.in);
		List<ZooAnimal> animals = new ArrayList<ZooAnimal> ();

		
		do
		{
			System.out.println("XXXXXXXXXX      MAIN MANU       XXXXXXXXXX");
			System.out.println("XXXXXXXXXX 1) Add animal        XXXXXXXXXX");
			System.out.println("XXXXXXXXXX 2) Visualize animal  XXXXXXXXXX");
			System.out.println("XXXXXXXXXX 3) Exit              XXXXXXXXXX");
			option = captor.nextInt();
			captor.nextLine();
			
			switch (option) {
			case 1:
				String animalName, specie, featur, whatYouLikedBestAboutTheAnimal;
				ZooAnimal zooAnimal = new ZooAnimal();
			
				System.out.print("Please enter the name of the animal: ");
				animalName = captor.nextLine();
				zooAnimal.setAnimalName(animalName);
				
				System.out.print("Please enter the specie of the animal: ");
				specie = captor.nextLine();
				zooAnimal.setSpecies(specie);
				
				System.out.print("Please enter the featur of the animal: ");
				featur = captor.nextLine();
				zooAnimal.setFeatur(featur);
				
				System.out.print("Please enter what you liked the most about the animal: ");
				whatYouLikedBestAboutTheAnimal = captor.nextLine();
				zooAnimal.setWhatYouLikedBestAboutTheAnimal(whatYouLikedBestAboutTheAnimal);
				
				animals.add(zooAnimal);
				
				break;
				
			case 2: 
				if(animals == null || animals.size() == 0)
				{
				  System.out.println("You still cannot consult animals because you have not stored information");
		
				}
				else
				{
					System.out.print("Please enter the name of the animal you wish to consult: ");
					 animalName = captor.nextLine();
					 int index = 0 ;
					 boolean found = false;
					 for(int i = 0; i < animals.size(); i++)
					 {
						 ZooAnimal animal = animals.get(i);
						 if(animal.getAnimalName().equalsIgnoreCase(animalName))
						 {
							 found = true;
							 index = i;
							 
						 }
						 else 
						 { 
							 found = false; 
						 }
						 
					 }
					 if(found == false)
					 {
						 System.out.println("The wanted animal is not in storage");
					 }
					 else
					 {
						 ZooAnimal animal = animals.get(index);
						 
						 System.out.println(animal.getAnimalName());
						 System.out.println(animal.getSpecies());
						 System.out.println(animal.getFeatur());
						 System.out.println(animal.getWhatYouLikedBestAboutTheAnimal());
					 }
					 		 
				}
				break;
				
			case 3:
				System.out.println("Thank you for using our program");
				break; 

			default:
				System.out.println("You entered an incorrect option");
				break;
			}
			
		}while(option != 3);
	}

}
