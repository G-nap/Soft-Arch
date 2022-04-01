package creational;

import java.io.IOException;

public interface BookMetadataFormatter {
    BookMetadataFormatter reset() throws IOException;
    BookMetadataFormatter append(Book b) throws IOException;
    String getMetadataString();
}
