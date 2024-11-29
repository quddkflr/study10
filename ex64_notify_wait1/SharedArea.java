package ex64_notify_wait1;

public class SharedArea {
	private double result;

	SharedArea() {

	}

	public double getResult() {
		return result;

	}

	public void setResult(double result) {
		this.result = result;
	}

	private boolean isReady;

	public boolean isReady() {
		return isReady;
	}

	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}

}
