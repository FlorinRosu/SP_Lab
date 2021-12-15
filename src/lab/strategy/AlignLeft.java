package lab.strategy;

import java.util.List;

import lab.composite.Paragraph;

public class AlignLeft implements AlignStrategy {
	private static final long serialVersionUID = -1638434848002772096L;

	@Override
	public void render(Paragraph paragraph, AlignContext alignContext) {
		List<String> prerenderedSentences = AlignHelper.prerender(paragraph, alignContext);
		
		/* Left alignment is the default alignment */
		prerenderedSentences.forEach(System.out::println);
	}
	
}
