package lab.strategy;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import lab.composite.Paragraph;

public class AlignRight implements AlignStrategy {
	private static final long serialVersionUID = -1638434848002772096L;
	
	@Override
	public void render(Paragraph paragraph, AlignContext alignContext) {
		List<String> prerenderedSentences = AlignHelper.prerender(paragraph, alignContext);

		for (String sentence : prerenderedSentences) {
			System.out.println(StringUtils.leftPad(sentence, alignContext.getMaximumCharactersPerLine()));
		}

	}

}
