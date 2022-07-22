
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String firstName = scanner.nextLine();
            
            if (firstName.isEmpty()) {
                break;
            }
            
            String lastName = scanner.nextLine();
            String idNumber = scanner.nextLine();
            
            PersonalInformation piObject = new PersonalInformation(firstName, lastName, idNumber);
            
            infoCollection.add(piObject);
        }
        
        for (PersonalInformation piObject: infoCollection) {
            System.out.println(piObject.getFirstName() + " " + piObject.getLastName());
        }
    }
}
