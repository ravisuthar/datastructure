package designpattern.sort;

class Volt {
	private int volt;

	public Volt(int volt) {
		this.volt = volt;
	}

	public int getVolt() {
		return volt;
	}

	public void setVolt(int volt) {
		this.volt = volt;
	}

}

class Socket {
	public Volt produceVolt() {
		return new Volt(120);
	}
}

interface SocketAdapter {
	Volt get30Volt();

	Volt get60Volt();
}

class SocketAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get30Volt() {
		return convert(4);
	}

	@Override
	public Volt get60Volt() {
		return convert(2);
	}

	private Volt convert(int i) {
		return new Volt(120 / i);
	}
}

public class TestAdapter {
	public static void main(String[] args) {
			SocketAdapterImpl ad =new SocketAdapterImpl();
			Volt v30=ad.get30Volt();
	}
}
