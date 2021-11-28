package de.uni.koeln.sse.Aufgabe2;

public class Test {

	public static void main(String[] args) {
		Composite OlymipicsTeams=new  Composite("OlymipicsTeams", 80, 160);
			Composite AsiaTeams=new Composite("AsiaTeam", 20,40 );
				Teams AfghanistanTeams=new  Leaf("AfghanistanTeam", 10,20 );//1
				Composite ChinaTeams=new  Composite("ChinaTeam", 10, 20);
					Composite ChinaWomensTeams=new  Composite("ChinaWomensTeam", 5, 10);
						Teams Taekwondo=new  Leaf("Taekwondo", 2, 5);//2
						Teams Waterpolo=new  Leaf("Waterpolo", 3, 5);//3
			Teams AfricaTeams=new  Leaf("AfricaTeam", 20, 40);//4
			Composite EuropeTeams=new  Composite("EuropeTeam", 20, 40);
				Composite GermanyTeams=new  Composite("GermanyTeam", 10, 20);
					Composite GermanyWomensTeams=new  Composite("GermanWomensTeam", 5, 10);
						Teams Cycling=new  Leaf("Cycling", 3, 5);//5
						Teams Tennis=new  Leaf("Tennis", 2, 5);//6
					Composite GermanyMensTeams=new  Composite("GermanMensTeam", 5, 10);
						Teams Football=new  Leaf("Football", 5, 10);//7
			Teams SouthAmericaTeams=new  Leaf("SouthAmericaTeam", 20, 40);//8
			
		OlymipicsTeams.addNode(AsiaTeams);
			AsiaTeams.addNode(AfghanistanTeams);//1
			AsiaTeams.addNode(ChinaTeams);	
				ChinaTeams.addNode(ChinaWomensTeams);
					ChinaWomensTeams.addNode(Taekwondo);//2
					ChinaWomensTeams.addNode(Waterpolo);//3
		OlymipicsTeams.addNode(AfricaTeams);//4
		OlymipicsTeams.addNode(EuropeTeams);
			EuropeTeams.addNode(GermanyTeams);
				GermanyTeams.addNode(GermanyWomensTeams);
					GermanyWomensTeams.addNode(Cycling);//5
					GermanyWomensTeams.addNode(Tennis);//6
				GermanyTeams.addNode(GermanyMensTeams);
					GermanyMensTeams.addNode(Football);//7
		OlymipicsTeams.addNode(SouthAmericaTeams);//8
		
		GermanyMensTeams.printNumberOfAthletes();
		GermanyTeams.printNumberOfGoldmedals();
		AsiaTeams.printNumberOfGoldmedals();
		OlymipicsTeams.printNumberOfAthletes();





			

	}

}
