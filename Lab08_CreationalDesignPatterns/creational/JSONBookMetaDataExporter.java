package creational;
import java.io.PrintStream;

public class JSONBookMetaDataExporter extends BookMetadataExporter {

    @Override
    public Export createExport(PrintStream out) {
        return new JSONExporter();
    }
    
}