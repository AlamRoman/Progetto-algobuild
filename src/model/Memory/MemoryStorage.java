package model.Memory;

import java.util.HashSet;
import java.util.Iterator;
import model.Exceptions;

public class MemoryStorage {
	
	HashSet<Variable> memory;
	private static MemoryStorage instance;

	public MemoryStorage() {
		super();
		this.memory = new HashSet<Variable>();
	}
	
	public static MemoryStorage getInstance() {
		instance = (instance==null) ? (new MemoryStorage()) : instance;
		return instance;
	}
	
	public static void destroyInstance() {
		instance = null;
	}
	
	public void addVariable(Variable var) throws Exceptions{
		System.out.println("Adding variable " + var + " to the memory");
		if(!memory.add(var)) {
			throw new Exceptions(Exceptions.EXISTING_VARIABLE, "| thrown in " + this.getClass().getSimpleName());
		}
		System.out.println("Added.");
		showMemory();
	}
	
	public Variable getVariableByName(String name) throws Exceptions{
		
		System.out.println("Getting variable with name: " + name);
		showMemory();
		for (Variable temp : memory) {
			System.out.println("Checking if " + temp.getName() + " == " + name);
			if(temp.getName().equals(name)) {
				return temp;
			}
			
		}
		
		throw new Exceptions(Exceptions.NON_EXISTING_VARIABLE, "| thrown in " + this.getClass().getSimpleName());
		
	}
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MEMORY TABLE\n");
        sb.append(String.format("%-15s %-15s %-15s\n", "Type", "VariableName", "Value"));
        sb.append("-----------------------------------\n");
        for (Variable var : memory) {
            sb.append(String.format("%-15s %-15s %-15s\n", var.getType(), var.getName(), var.getValue()));
        }
        return sb.toString();
    }
	
	public void showMemory() {
		System.out.println("\n" + this.toString() + "\n");
	}
	
	
	
}
