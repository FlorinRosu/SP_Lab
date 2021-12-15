package lab.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class AlignContext {
	public static final int DEFAULT_CHARACTER_LIMIT = 20;
	
	@Setter
	@Getter
	private int maximumCharactersPerLine;
}
