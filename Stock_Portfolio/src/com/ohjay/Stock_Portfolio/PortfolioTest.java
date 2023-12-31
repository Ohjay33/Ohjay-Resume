package com.ohjay.Stock_Portfolio;

public class PortfolioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Lets get started with this Portfolio");
//		System.out.println("Lets get started looking at these stocks and forex!!!");
		
		//creating an object thats an instance of a class
		//Stocks
		Stocks stock1 = new Stocks();
		Stocks stock2 = new Stocks();
		Stocks stock3 = new Stocks();
		//used with overloading constructor
		Stocks stock4 = new Stocks("Tesla,",550.50);
		
		stock1.setName("Google");
		stock2.setName("Delta");
		stock3.setName("Walmart");
		
		System.out.println(stock4.getName());
		System.out.println(stock4.getPrice());
	
		
		
		//Forex
		Forex pair1 = new Forex();
		Forex pair2 = new Forex();
		Forex pair3 = new Forex();
		//used with overloading constructor
		Forex pair4 = new Forex("US30", 100000);
		
		pair1.setName("GpbJpy");
		pair2.setName("EurUsd");
		pair3.setName("GpbChf");
		
		System.out.println(pair1.getName());
		System.out.println(pair4.getName());
		
		
		
		
		//Portfolios
		Portfolio portfolio1 = new Portfolio();
		Portfolio portfolio2 = new Portfolio();
		Portfolio portfolio3 = new Portfolio();
		Portfolio portfolio4 = new Portfolio("Ohjay", 1000000);
		
		
		
		portfolio1.setOwner("Corey");
		portfolio2.setOwner("Lisa");
		portfolio3.setOwner("BigOJ");
	
		portfolio1.setTotalBalance(500000);
		
		
		System.out.println(portfolio4.getStockList() );
		System.out.println(portfolio1.getOwner() );
		System.out.println(portfolio4.getOwner() );
		System.out.println(portfolio4.getTotalBalance() );
		
		
		//example after making getters and setters
		
		
		
		
		
		
		//Example before making getters and setters. 
//		stock1.name = "Google";
//		stock2.name = "Delta";
//		stock3.name = "Walmart";
//		stock1.color = "blue";
//		stock1.price = 50.50;
//		stock2.price = 75.20;
//		stock3.price = 500.00;
//		pair1.price = 1000.00;
//		pair2.price = 2000000.00;
//		pair3.price = 155.00;
		
		
		
//		System.out.println("this is the results of the example!! "  + stock1.name +  stock3.price);
//		System.out.println(pair1.getName());
//		System.out.println(stock1.getName());
//		System.out.println(pair2.price);
//		System.out.println(pair3.getName());
//		System.out.println(pair3.price);
//		System.out.println(String.format("stock 1 info: Name- %s. Price: %s ", stock1.name, stock1.price, stock1.color));
//		System.out.println(stock1.color);
	}

}
