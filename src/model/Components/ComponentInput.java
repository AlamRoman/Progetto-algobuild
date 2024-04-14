package model.Components;

import model.DebuggerConsole;
import model.Exceptions;
import model.Memory.MemoryStorage;
import model.Memory.Variable;

public class ComponentInput extends Component{

	private static final String referenceTypeMessage = "C-INPUT";
	private Variable finalVar;
	private String nomeVariabile;
	private Object inputValue;
	
	public ComponentInput(Component nextComponent1, Component nextComponent2, MemoryStorage memory, String nomeVariabile, Object inputValue) {
		super(nextComponent1, nextComponent2, memory);
		
		this.nomeVariabile = "";
		this.inputValue = null;
		
	}
	
	public Object execute() throws Exceptions{
		DebuggerConsole.getInstance().printDefaultInfoLog(Thread.currentThread(), referenceTypeMessage , "Executing...");
		finalVar = super.getMemory().getVariableByName(nomeVariabile);
		
		finalVar.setValue(inputValue);
		
		DebuggerConsole.getInstance().printDefaultSuccessLog(Thread.currentThread(), referenceTypeMessage , "Executed.");
		return null;
	}
	
	public void set(String nomeVariabile, Object inputValue) {
		this.nomeVariabile = nomeVariabile;
		this.inputValue = inputValue;
	}

	@Override
	public Component getNextComponent() {
		return super.getNextComponent1();
	}

	@Override
	public String print() {
		String out = "IN ";
		
		out += "$" + finalVar.getName();
		
		return out;
	}

	public String getNomeVariabile() {
		return nomeVariabile;
	}

	public void setNomeVariabile(String nomeVariabile) {
		this.nomeVariabile = nomeVariabile;
	}
	
}
