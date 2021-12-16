package lab.visitor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lab.composite.Section;
import lab.composite.TableOfContentsEntry;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TocGeneratorHelper {
	public static TableOfContentsEntry traverseSection(Section section, int sectionIndex) {
		return traverseSection(section, List.of(String.valueOf(sectionIndex)));
	}

	private static TableOfContentsEntry traverseSection(Section section, List<String> depthIndices) {
		TableOfContentsEntry tocEntry = new TableOfContentsEntry(
				String.join(".", depthIndices) + " " + section.getTitle());

		for (int i = 0; i < section.getChildrenCount(); i++) {
			if (section.get(i) instanceof Section) {
				List<String> updatedDepthIndices = Stream
						.concat(depthIndices.stream(), List.of(String.valueOf(i + 1)).stream())
						.collect(Collectors.toList());
				tocEntry.add(traverseSection((Section) section.get(i), updatedDepthIndices));
			}
		}

		return tocEntry;
	}
}
