package designpattern.pattern.creational.builder;

public class Pizza {

	//mandatory
	private String base;
	private String souse;
	
	//optional
	private String cheese;
	private String oregano;
	private String jelepino;
	private String onion;
	private String capsicum;
	
	private Pizza(PizzaBuilder pizzaBuilder) {
		this.base= pizzaBuilder.base;
		this.souse= pizzaBuilder.souse;
		
		this.cheese= pizzaBuilder.cheese;
		this.oregano= pizzaBuilder.oregano;
		this.jelepino= pizzaBuilder.jelepino;
		this.onion= pizzaBuilder.onion;
		this.capsicum= pizzaBuilder.capsicum;
	}
	


	//getter methods
	
	
	//toString
	@Override
	public String toString() {
		return "Pizza [base=" + base + ", souse=" + souse + ", cheese=" + cheese + ", oregano=" + oregano
				+ ", jelepino=" + jelepino + ", onion=" + onion + ", capsicum=" + capsicum + "]";
	}





	public static class PizzaBuilder{
		//mandatory
		private String base;
		private String souse;
		
		//optional
		private String cheese;
		private String oregano;
		private String jelepino;
		private String onion;
		private String capsicum;
		
		
		public PizzaBuilder(String base, String souse) {
			this.base=base;
			this.souse=souse;
		}	
		
		public PizzaBuilder setCheese(String cheese) {
			this.cheese=cheese;
			return this;
		}
		
		public PizzaBuilder setOregano(String oregano) {
			this.oregano=oregano;
			return this;
		}
		
		public PizzaBuilder setJelepino(String jelepino) {
			this.jelepino=jelepino;
			return this;
		}
		
		public PizzaBuilder setOnion(String onion) {
			this.onion=onion;
			return this;
		}
		
		public PizzaBuilder setcCapsicum(String capsicum) {
			this.capsicum=capsicum;
			return this;
		}
		
		public Pizza build() {
			return new Pizza(this);
		}
	}
}
