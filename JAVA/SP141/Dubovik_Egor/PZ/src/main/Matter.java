package main;

import java.util.*;

public class Matter {
	protected String _name;
	
	public Matter(String name) {
		this._name = name;
	}
	
	public String getName() {
		return "name: "  + _name;
	}

	public void setName(String name) {
		this._name = name;
	}
}