package de.uni.koeln.sse.se;

public interface HouseholdItemVisitor {
	public void MovingCostGlass(Glass glass);
	public void MovingCostFurniture(Furniture furniture);
	public void MovingCostElectronic(Electronic electronic);
	public void PackingInstructionGlass(Glass glass);
	public void  PackingInstructionFurniture(Furniture furniture);
	public void PackingInstructionElectronic(Electronic electronic);
}
