package discounts;

import model.Cart;

public interface ICanApplyDiscount {
	public boolean canApplyDiscount (Cart cart);
	public void applyDiscount (Cart cart);

}
