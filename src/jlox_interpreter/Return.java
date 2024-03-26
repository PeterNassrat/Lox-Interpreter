package jlox_interpreter;

@SuppressWarnings("serial")
public class Return extends RuntimeException {
	final Object value;
	final Token returnKeyWord;

	Return(Object value, Token returnKeyWord) {
		super(null, null, false, false);
		this.value = value;
		this.returnKeyWord = returnKeyWord;
	}
}
