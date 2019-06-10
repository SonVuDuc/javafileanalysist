class Method extends Data{
	public Method(String visibility, String scope, String type, String name){
		super(visibility,scope,type,name);
	}
	public String getMethod(){
		return visibility + " " + name + ": " + type;
	}
}
