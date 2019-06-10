import java.util.*;
import java.util.ArrayList;
class ClassData{

	private ArrayList<Attribute> attributes = new ArrayList<Attribute>();
	private ArrayList<Method> methods = new ArrayList<Method>();

	String name, superClassName, implementName;
	public ClassData(String name, String superClassName, String implementName){
		this.name = name;
		this.superClassName = superClassName;
		this.implementName = implementName;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSuperClassName(String superClassName){
		this.superClassName = superClassName;
	}
	public void setImplementName(String implementName){
		this.implementName = implementName;
	}
	public String getName(){
		return this.name;	
	}
	public String getSuperClassName(){
		return this.superClassName;
	}
	public String getImplementName(){
		return this.implementName;
	}
	public void addMethods(Method method){
		methods.add(method);
	}
	public ArrayList<Method> getMethods(){
		return methods;
	}
	public void addAttribute(Attribute attribute){
		attributes.add(attribute);
	}
	public ArrayList<Attribute> getAttribute(){
		return attributes;
	}
	public void printDataClass(){
		if(getImplementName() == "" && getSuperClassName() == "" )
			System.out.println("Class: " +getName());
		
		else if(getSuperClassName() == "")
			System.out.println("Class: " +getName() +" implement " +getImplementName());
		
		else 
			System.out.println("Class: " +getName() +" extends " +getSuperClassName());	
			
		
		System.out.println("  Attribute: ");
		for(int i = 0; i < attributes.size(); i++){
			System.out.println(" + " +attributes.get(i).getAttribute());
		}

		System.out.println("  Method: ");
		for(int i = 0; i < methods.size(); i++){
			System.out.println(" + " +methods.get(i).getMethod());
		}
		System.out.println("============================================================");
	}
}
