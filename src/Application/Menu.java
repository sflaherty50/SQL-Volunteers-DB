package Application;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import dao.OrganizationsDao;
public class Menu {
	
	private OrganizationsDao orgDao = new OrganizationsDao();
	
	
	Scanner input = new Scanner(System.in);
	private List<String> tableOptions = Arrays.asList("Organizations",
													"Volunteers",
													"Projects");
	
	private List<String> orgOptions = Arrays.asList("Dislay organizations",
													"Display an organization",
													"Create an organization",
													"Delete an organization",
													"Return to main menu");
	
	private List<String> volOptions = Arrays.asList("Dislay volunteers",
													"Display a volunteer",
													"Create a volunteer",
													"Delete a volunteer",
													"Return to main menu");
	
	private List<String> projOptions = Arrays.asList("Dislay projects",
													"Display a project",
													"Create a project",
													"Delete a project",
													"Return to main menu");
	
	public void start() {
		String selection = "";
		do {
			System.out.println("\n**********Main-Menu**********");
			System.out.println("-----------------------------");
			printMainMenu();
			
			selection = input.nextLine();
			if(selection.equals("1")) {
				printOrgMenu();
			}else if(selection.equals("2")) {
				printVolMenu();
			}else if(selection.equals("3")) {
				printProjMenu();
			}
			
			System.out.println("\nPlease enter to continue to the program...");
			input.nextLine();
			
		}while (!selection.equals("-1"));
	}
	
	//printMainMenu() implmeentation
	private void printMainMenu() {
		printMenuPattern(tableOptions);
	}
	
	//printOrgMenu() implementation
	private void printOrgMenu() {
		printMenuPattern(orgOptions);
	}
	
	//printVolMenu() implmeentation
	private void printVolMenu() {
		printMenuPattern(volOptions);
	}
		
	//printProjMenu() implementation
	private void printProjMenu() {
		printMenuPattern(projOptions);
	}
	
	private void printMenuPattern(List<String> menu) {
		System.out.println("\nWhich table would you like to do maintenance to?");
		for (int i = 0; i<menu.size(); i++) {
			System.out.println(i+1 + ") " + menu.get(i));
		}
	}
}