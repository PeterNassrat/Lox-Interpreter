package jlox_interpreter;

@SuppressWarnings("serial")
public class Break extends RuntimeException {
	final Token breakKeyWord;

	Break(Token breakKeyWord) {
		this.breakKeyWord = breakKeyWord;
	}
}
