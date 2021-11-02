package addressbooksystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContactMain {

		static Map<Integer, ArrayList<AddContact>>  hashMap = new HashMap<Integer, ArrayList<AddContact>>();
	    static InputScanner inputScanner = new InputScanner();

		public static void main(String[] args) {
		
			System.out.println("enter the address book limit");
			int addressBookLimit = inputScanner.inputInteger();
			for (int i = 1; i <= addressBookLimit; i++) {
				System.out.println("enter name of addressbook");
	            
	            String addressBookName = inputScanner.inputString();
	            System.out.println("Addres book name is :" + addressBookName);
				ArrayList<AddContact> addContactDetails = new <AddContact>ArrayList();
				while (true) {
					AddContact addPersonDetails = new AddContact();
					System.out.printf(
							"Input  01 to add Details, 02 to Edit details, 03 to delete details . \n Enter any  single Digit Number  to Ignore");
					int options = inputScanner.inputInteger();
					if (options == 01 || options == 02 || options == 03||options == 04 ) {
						switch (options) {
						case 01:
							addPersonDetails.setContactDetails();
							addContactDetails.add(addPersonDetails);
							break;
						case 02:
							System.out.println("Enter the name to edit");
							addPersonDetails.editDetails(addContactDetails);
							break;
						case 03:
							addPersonDetails.deleteDetails(addContactDetails);
							break;
						default:
							System.out.println("you have not perform any operation");
							break;
						}

					} else {
						System.out.println("Details are uptodate");
						break;
					}
				}
				
				hashMap.put(i, addContactDetails);
			}
			for(int i=1; i<=hashMap.size(); i++) {
				System.out.println("address book "+i);
				System.out.println(hashMap.get(i));	
			}		
		}		
}
		


