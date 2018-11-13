package pattern.creational.builder;

public class Dmaas {

	public Dmaas(Builder builder) {
		this.username= builder.username;
		this.password= builder.password;
		this.param1= builder.param1;
		this.param2= builder.param2;
	}

	private String username;
	private String password;
	
	private String param1;
	private String param2;
	
	
	public static class Builder{
		
		private String username;
		private String password;
		
		private String param1;
		private String param2;
		
		public Builder(String username, String password){
			this.username=username;
			this.password=password;
		}
		
	   public Builder setParam1(String param1){
		   this.param1=param1;
		   return this;
	   }
	   
	   public Builder setParam2(String param2){
		   this.param2=param2;
		   return this;
	   }
	   
	   public Dmaas build(){
		   return new Dmaas(this);
	   }
		
	}
}
