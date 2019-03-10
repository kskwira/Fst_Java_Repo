package model;

import java.util.ArrayList;

public class Invoice {
	
	private ArrayList<InvoicePosition> positions = new ArrayList<InvoicePosition>();
	
	public ArrayList<InvoicePosition> getPositions() {
		return positions;
	}
	
	public void addPosition(InvoicePosition position){
		positions.add(position);
	}

}
