package discounts;

import model.Cart;
import model.CartItem;
import model.Product;

public class ThirdProductFree implements ICanApplyDiscount{
	
	public boolean canApplyDiscount(Cart cart) {
		return cart.totalPriceOfProducts()>200;
	}
	
	public void applyDiscount (Cart cart) {
		for (CartItem item: cart.getItems()){
			item.setCurrentPrice(item.getCurrentPrice()*0);
		}
		
	}
}
