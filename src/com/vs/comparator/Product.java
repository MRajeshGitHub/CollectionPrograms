package com.vs.comparator;

public class Product  implements Comparable<Product>{
	
	int pid;
	String pname;
	double pcost;
	public Product(int pid, String pname, double pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if(pid==o.pid)
		return 0;
		else if(pid>o.pid)
			return 1;
		else
			return -1;
	}
	

}
