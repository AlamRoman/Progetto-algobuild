package model.Components;

import model.Memory.MemoryStorage;

public class ComponentComment extends Component{

	private String comment;

	public ComponentComment(Component nextComponent1, Component nextComponent2, MemoryStorage memory,
			String comment) {
		super(nextComponent1, nextComponent2, memory);
		
		this.comment = comment;
	}

	public String execute() {
		return comment;
	}

	public void set(String comment) {
		this.comment = comment;
	}
	
}
