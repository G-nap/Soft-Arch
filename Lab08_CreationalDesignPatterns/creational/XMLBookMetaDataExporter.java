//new
package creational;

import java.io.PrintStream;

public class XMLBookMetaDataExporter extends BookMetadataExporter {

    @Override
    public Export createExport(PrintStream out) {
        return new XMLExport();
    }


}