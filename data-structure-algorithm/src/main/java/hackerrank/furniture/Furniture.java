package hackerrank.furniture;

/**
 * FURNITURE_TYPE("Furniture Name", floating-point cost)
*/

public enum Furniture {
	//constant should be first statement in enum class.
	CHAIR("Chair", 100.0f),
	TABLE("Table", 250.0f),
	COUCH("Couch", 500.0f);

	private final String label;
	private final float cost;

	Furniture(String label, float cost) {
		this.label = label;
		this.cost = cost;
	}

	public String label() {
		return label;
	}

	public float cost() {
		return cost;
	}
}