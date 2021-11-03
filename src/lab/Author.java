package lab;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Author {
	@Getter
	private String name;

	public void print() {
		System.out.println(String.format("Author: %s", name));
	}
}
