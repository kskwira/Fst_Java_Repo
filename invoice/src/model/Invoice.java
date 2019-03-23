package model;

import java.util.ArrayList;

public class Invoice {
	
	private ArrayList<InvoicePosition> positions = new ArrayList<InvoicePosition>();
	
	public ArrayList<InvoicePosition> getPositions() {
		return positions;
	}
	
	private InvoicePosition positionWithProduct(Product product) {
		for (InvoicePosition position: positions)
		{
			if (position.getProduct().getCode().equals(product.getCode()))
				return position;
		}
		return null;
	}
	
	public void addPosition(InvoicePosition position){
		positions.add(position);
	}

	public void addPosition(Product product) {
		InvoicePosition position = positionWithProduct(product);
		if (position == null) {
			addPosition (new InvoicePosition(product));
			return;
		}
		position.setCount(position.getCount()+1);
		}
	}
