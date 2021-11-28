package de.uni.koeln.sse.se;

public interface HouseholdItem {

	public void accept(HouseholdItemVisitor housholdItemVisitor );

	public void accept2(HouseholdItemVisitor housholdItemVisitor);
}
