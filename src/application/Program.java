package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		System.out.println("Enter how many items to add: ");
		Scanner sc = new Scanner(System.in);
		int n = sc. nextInt();
		
		//We must instantiate the generic type now
		PrintService<Integer> printService = new PrintService<>();
		for(int i=0;i<n;i++) {
			Integer value = sc.nextInt();
			printService.addValue(value);
		}
		
		printService.print();
		Integer first = printService.first();
		System.out.println("First: "+ first);
		
		sc.close();
		
	}

}
