package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(34, "Sarah", "sasasa45@gmail.com", LocalDate.parse("22/01/2003", fmt), 4200.0, obj);
		
		System.out.println(seller);
		
		

	}

}
