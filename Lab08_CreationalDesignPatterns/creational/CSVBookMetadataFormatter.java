package creational;

import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedList;
import java.util.List;

public class CSVBookMetadataFormatter implements BookMetadataFormatter {

    private StringWriter writer;
    private CSVPrinter csvPrinter;

    public CSVBookMetadataFormatter() throws IOException {
        reset();
    }

    public BookMetadataFormatter reset() throws IOException {
        writer = new StringWriter();
        csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
//            Stream<String> headers = Arrays.stream(Book.Metadata.values()).map(Book.Metadata::getValue);
        List<String> headers = new LinkedList<String>();
        for (Book.Metadata metadata : Book.Metadata.values()) {
            headers.add(metadata.value);
        }
        csvPrinter.printRecord(headers);
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) throws IOException {
        String authors = String.join("|", b.getAuthors());
        csvPrinter.printRecord(b.getISBN(), b.getTitle(), b.getPublisher(), authors);
        return this;
    }

    @Override
    public String getMetadataString() {
        return writer.toString();
    }
}
