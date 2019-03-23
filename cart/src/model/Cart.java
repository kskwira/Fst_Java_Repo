package model;

	import java.util.ArrayList;

import discounts.ICanApplyDiscount;
import discounts.PercentDiscount;
import discounts.FreeCupDiscount;


	public class Cart {
		
		ArrayList<CartItem> items = new ArrayList<CartItem>();

		
		public double totalPriceOfProducts(){
			
			double sum = 0;
			for(CartItem item : items){
				sum += item.getProduct().getPrice();
			}
			return sum;
		}
		
		public double totalPriceOfDiscountedProducts(){
			double sum = 0;
			for(CartItem item : items){
				sum += item.getCurrentPrice();
			}
			return sum;
		}
		
		public ArrayList<CartItem> getItems() {
			return items;
		}
		
		/*
		public void applyDiscount (PercentDiscount discount) {
			if (discount.canApplyDiscount(this))
				discount.applyDiscount(this);
		}
		
		public void applyDiscount (FreeCupDiscount discount) {
			if (discount.canApplyDiscount(this))
				discount.applyDiscount(this);
		}
		*/
		
		public void applyDiscount(ICanApplyDiscount discount){
			if (discount.canApplyDiscount(this))
				discount.applyDiscount(this);
		}
	}
