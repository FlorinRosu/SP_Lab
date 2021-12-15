package lab.strategy;

import java.io.Serializable;

import lab.composite.Paragraph;

public interface AlignStrategy extends Serializable {
	
	public void render(Paragraph paragraph, AlignContext alignContext);
	
}
