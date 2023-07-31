package com.nam.product.product_work;

import java.util.List;



public class Menu {
	
	public void mainMenu()
	{
		String condition = null;
		do {
			
			System.out.println("Product Menu\n");
			System.out.println("1.Create Product\n2.Get Product\n3.Get All\n4.Update Product\n5.Delete Product");
			int choice = Read.readInt("Select 1-5:");
			switch (choice) {
			case 1:
				insertProduct();
				break;
			case 2:
				readProduct();
				break;
			case 3:
				getAll();
				break;
			case 4:
				updateProduct();
				break;
			case 5:
				deleteProduct();
				break;
			default:
				System.out.println("Invalid options");
			}
			condition = Read.readString("Enter Y to continue:");
		} while (condition.equals("Y"));
		
	}
	public void insertProduct()
	{
    	
        Product prod1 = new Product();
       
        prod1.setProductID(Read.readInt("Enter Product ID:"));
        prod1.setProductName(Read.readString("Enter Product Name: "));
        prod1.setProductPrice(Read.readInt("Enter Product Price: "));
        prod1.setQuantity(Read.readInt("Enter Quantity"));
        prod1.setProductTax(Read.readInt("Read Product Tax"));
        prod1.setTotalPrice(prod1.getProductTax() + prod1.getProductPrice() * prod1.getQuantity());
        
        CRUDproduct.add(prod1);
        
	}
	public void print(Product prod)
	{
		System.out.println("Product ID: " + prod.getProductID());
		System.out.println("Product Name: " + prod.getProductName());
		System.out.println("Product Price: " + prod.getProductPrice());
		System.out.println("Product Quantity: " + prod.getQuantity());
		System.out.println("Product Tax: " + prod.getProductTax());
		System.out.println("Product Total Price: " + prod.getTotalPrice());
		System.out.println("\n");
	}
	public void readProduct()
	{
		int pId = Read.readInt("Enter Product ID: ");
		Product prod = CRUDproduct.get(pId);
		print(prod);
	}
	public void updateProduct()
	{
		int pId = Read.readInt("Enter Product ID: ");
		Product prod = CRUDproduct.get(pId);
		System.out.println("Which field do you want to update?" + "\n1.Product ID\n2.Product Name\n3.Product Price\n4.Quantity\n5.Product Tax");
		int choice = Read.readInt("Select 1-5");
		switch(choice)
		{
			case 1: 
				prod.setProductID(Read.readInt("Enter new Product ID:")); 
				break;
			case 2: 
				prod.setProductName(Read.readString("Enter Product New Name:"));
				break;
			case 3: 
				prod.setProductPrice(Read.readInt("Enter new Product Price:"));
				break;
			case 4: 
				prod.setQuantity(Read.readInt("Enter new quantity:"));
				break;
			case 5: 
				prod.setProductTax(Read.readInt("Enter New Product Tax:"));
				break;
			default:
				System.out.println("Invalid options");
		}
		prod.setTotalPrice(prod.getProductTax() + prod.getProductPrice() * prod.getQuantity());
		CRUDproduct.update(prod);
	}
	public void deleteProduct()
	{
		int id = Read.readInt("Enter Product ID to Delete:");
		CRUDproduct.delete(CRUDproduct.get(id));
	}
	public void getAll()
	{
		List<Product> list = CRUDproduct.getAll();
		for(Product i : list)
		{
			print(i);
		}
	}
}
