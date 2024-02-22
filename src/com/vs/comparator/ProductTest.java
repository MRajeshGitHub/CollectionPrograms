package com.vs.comparator;

import java.util.Collections;
import java.util.LinkedList;

public class ProductTest {

	public static void main(String[] args) {
		// comparator project to test
		System.out.println("Product data using LinkedList :");
		LinkedList<Product> ll= new LinkedList<Product>();
		
		ll.add(new Product(129, "Pen", 10.0));
		ll.add(new Product(128, "Paper", 107.0));
		ll.add(new Product(125, "Pencil", 140.01));
		ll.add(new Product(126, "ruber", 160.0));
		
	
		
		Collections.sort(ll);//sorting using comparator interface with product class
		//print product after sort the product
		for(Product p:ll) {
			System.out.println(p.pid+","+p.pname+","+p.pcost);
		}
		

	}

}
