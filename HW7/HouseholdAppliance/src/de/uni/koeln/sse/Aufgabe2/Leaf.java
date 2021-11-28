package de.uni.koeln.sse.Aufgabe2;



public class Leaf implements Teams {
	private String name;
	private int NumberOfAthletes;
	private int NumberOfGoldmedals;
	public Leaf(String name,int NoA,int NoGm) {
		this.name=name;
		this.NumberOfAthletes=NoA;
		this.NumberOfGoldmedals=NoGm;
	}
	public void printName() {
		
        System.out.println("Team:"+this.name);
    }
	public void printNumberOfAthletes() {
		 System.out.println("Team:"+this.name+"Number of Athletes:"+this.NumberOfAthletes );
	}
	public void printNumberOfGoldmedals() {
		 System.out.println("Team:"+this.name+"Number of Goldmedals:"+this.NumberOfGoldmedals );
	}
	//Getter/Setter Methode
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfAthletes() {
		return NumberOfAthletes;
	}
	public void setNumberOfAthletes(int numberOfAthletes) {
		NumberOfAthletes = numberOfAthletes;
	}
	public int getNumberOfGoldMedals() {
		return NumberOfGoldMedals;
	}
	public void setNumberOfGoldMedals(int numberOfGoldMedals) {
		NumberOfGoldMedals = numberOfGoldMedals;
	}

}
