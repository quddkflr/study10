package ex09_6object;

public class LimitedValue {
	static final int UPPER_LIMIT = 100000;
	int value;
	
	void setValue(int value) {
		if (value < UPPER_LIMIT)
			this.value = value;
		else
			this.value = UPPER_LIMIT;
	}

}
