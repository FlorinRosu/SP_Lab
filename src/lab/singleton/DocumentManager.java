package lab.singleton;

import lab.Book;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* Private constructor to restrict instance creation */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DocumentManager {
	@Getter
	@Setter
	private Book book;

    private static class DocumentManagerHolder {
        private static final DocumentManager INSTANCE = new DocumentManager();
    }

    public static DocumentManager getInstance() {
        return DocumentManagerHolder.INSTANCE;
    }
    
}
