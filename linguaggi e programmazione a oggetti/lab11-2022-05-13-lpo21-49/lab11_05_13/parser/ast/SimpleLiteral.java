package lab11_05_13.parser.ast;

public abstract class SimpleLiteral<T> implements Exp {

	protected final T value;

	public SimpleLiteral(T n) {
		this.value = n;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" + value + ")";
	}
}
