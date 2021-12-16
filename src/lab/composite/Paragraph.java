package lab.composite;

import org.apache.commons.lang3.SerializationUtils;

import lab.strategy.AlignContext;
import lab.strategy.AlignStrategy;
import lab.visitor.Visitor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class Paragraph implements Element {
	private static final long serialVersionUID = 1L;

	@NonNull
	@Getter
	private String text;
	@Setter
	private AlignStrategy alignStrategy;

	@Override
	public void render() {
		if (alignStrategy != null) {
			alignStrategy.render(this, new AlignContext(AlignContext.DEFAULT_CHARACTER_LIMIT));
		} else {
			System.out.println(text);
		}
	}

	@Override
	public void add(Element element) {

	}

	@Override
	public void remove(Element element) {

	}

	@Override
	public Element get(int index) {
		return null;
	}

	@Override
	public Element makeClone() {
		return SerializationUtils.clone(this);
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
