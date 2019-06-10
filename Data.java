class Data{
	String visibility, scope, type, name;
	public Data(String visibility, String scope, String type, String name){
		this.visibility = visibility;
		this.scope = scope;
		this.type = type;
		this.name = name;
	}
	public void setVisibility(String visibility){
		this.visibility = visibility;
	}
	public String getVisibility(){
		return visibility;
	}
	public void setScope(String scope){
		this.scope = scope;
	}
	public String getScope(){
		return scope;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}