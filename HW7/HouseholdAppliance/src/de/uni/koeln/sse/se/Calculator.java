package de.uni.koeln.sse.se;

public class Calculator implements HouseholdItemVisitor {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	public void CalculateMovingCost(HouseholdItem k) {
		k.accept(this);
	}
	public void PackingInstruction(HouseholdItem k) {
		k.accept2(this);
	}

	@Override
	public void MovingCostGlass(Glass glass) {
		double x;
		if(glass.tickness==1) {
			x=2*(glass.lenght);
		}else {
			if(glass.tickness==2) {
				x=1.2*(glass.lenght);
			}else{
				x=0.7*(glass.lenght);
			}
		}
	
		System.out.println("Total Cost of "+glass.name+" is:"+x+" Euros.");
		
	}

	@Override
	public void MovingCostFurniture(Furniture furniture) {
		double x=(5*(furniture.weight/20));
		System.out.println("Total Cost of "+furniture.name+" is:"+x+" Euros.");
		
	}

	@Override
	public void MovingCostElectronic(Electronic electronic) {
		double x;
		if(electronic.fragile==true) {
			x=5*((electronic.weight/10));
		}else{
			x=5*((electronic.weight/15));
		}
		System.out.println("Total Cost of "+electronic.name+" is:"+x+" Euros.");
		
	}
	@Override
	public void PackingInstructionGlass(Glass glass) {
		int x= glass.height+1;
		int y= glass.lenght+1;
		int z=glass.width+1;
		System.out.println(glass.name+":");
		System.out.println(" >should be wrapped with Bubble wraps and packed in a box with dimension: "+x+"x"+y+"x"+z);
		
	}
	@Override
	public void PackingInstructionFurniture(Furniture furniture) {
		int x=furniture.height+1;
		int y=furniture.lenght+1;
		System.out.println(furniture.name);
		System.out.println(" >should be covered with waterproof covers with area of: "+x+"x"+y);
	}
	@Override
	public void PackingInstructionElectronic(Electronic electronic) {
		int x= electronic.height+1;
		int y= electronic.lenght+1;
		int z=electronic.width+1;
		System.out.println(electronic.name+":");
		System.out.println(" >should be covered with Polyethylene foam film and packed in a box with dimension: "+x+"x"+y+"x"+z);
		
	}

}
