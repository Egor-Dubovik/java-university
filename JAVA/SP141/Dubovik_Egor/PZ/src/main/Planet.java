package main;

import java.util.ArrayList;
import java.util.List;

import main.Matter;
import main.Mainland;
import recording.Track;
import style.TrackStyles;

public class Planet extends Matter {
	private List<Mainland> mainlandlist = new ArrayList<>();
	private int _amount = 0;
	
	public Planet(String name) {
		super(name);
	}
	
	public void addMainland(Mainland currentMainland ) {
		mainlandlist.add(currentMainland);
		_amount++;
	}
	
	public String getMainlandAmount() {
		return super._name + " mainlands: "  + _amount;
	}
	
	public void getAllMainlands() {
		for (Mainland mainland : mainlandlist) {
			System.out.println(mainland.getName());
		}
	}
}



