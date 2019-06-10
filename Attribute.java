class Attribute extends Data{
	public Attribute(String visibility, String scope, String type, String name){
		super(visibility,scope,type,name);
	}
	public String getAttribute(){
		return visibility + " " + name + ": " + type;
	}
}
