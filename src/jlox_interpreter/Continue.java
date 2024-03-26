package jlox_interpreter;

@SuppressWarnings("serial")
public class Continue extends RuntimeException {
	final Token continueKeyWord;

	Continue(Token continueKeyWord) {
		this.continueKeyWord = continueKeyWord;
	}
}
