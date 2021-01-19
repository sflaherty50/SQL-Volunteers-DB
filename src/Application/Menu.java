package Application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.OrganizationsDao;

public class Menu {
	
	private OrganizationsDao orgDao = new OrganizationsDao();
	
	
	Scanner input = new Scanner(System.in);
	private List<String> menuOptions = Arrays.asList("Display a Car", 
													"Display Cars", 
													"Create a Car",  
													"Delete a Car");
	
	public void start() {
		System.out.print("Please provide Organization ID:");
		int selection = Integer.parseInt(input.nextLine());
//		if (orgDao.getOrgId(selection) == 0) {
//			//implement method to add an organization
//			
//		}else {
//			//displayOrganization();
//		}
		
	

	}
}
