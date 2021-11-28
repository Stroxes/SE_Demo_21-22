package de.uni.koeln.sse.Aufgabe2;


import java.util.ArrayList;
import java.util.List;

public class Composite implements Teams {
	String name;
	private int NumberOfAthletes;
	private int NumberOfGoldMedals;
	private List<Teams> nodes;
	public Composite(String name,int NoA,int NoGm ) {
		this.name=name;
		this.NumberOfAthletes=NoA;
		this.NumberOfGoldMedals=NoGm;
		this.nodes=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	public void printName(){
		for (Teams sub : nodes){
			sub.printName();
			}
	}
	public void printNumberOfAthletes(){
		for (Teams sub : nodes){
			sub.printNumberOfAthletes();
			}
	}
	public void printNumberOfGoldmedals(){
		for (Teams sub : nodes){
			sub.printNumberOfGoldmedals();
			}
	}
	public void addNode(Teams team) {
			nodes.add(team);
	}
	public void addLeaf(Teams team) {
		nodes.add(team);
}
	public void removeNode(Teams team) {
		nodes.remove(team);
}

}
