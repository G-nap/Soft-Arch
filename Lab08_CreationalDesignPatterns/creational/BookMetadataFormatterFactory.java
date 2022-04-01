package creational;

import java.io.IOException;
import java.text.ParseException;

public class BookMetadataFormatterFactory {
    public enum Format {
        CSV("CSV"),
        XML("XML"),
        JSON("JSON");

        public final String value;

        private Format(String value) {
            this.value = value;
        }
    }

    public static BookMetadataFormatter getBookMetadataFormatter(Format format)
            throws IOException, ParseException {
        BookMetadataFormatter formatter;
        switch (format) {
            case CSV:
                formatter = new CSVBookMetadataFormatter();
                break;
            case XML:
                formatter = new XMLBookMetadataFormatter();
                break;
            case JSON:
                formatter = new JSONBookMetadataFormatter();
                break;
            default:
                formatter = null;
        }
        return formatter;
    }
}
