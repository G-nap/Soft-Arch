package creational;

import java.io.IOException;
import java.text.ParseException;

// import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.digester.plugins.PluginConfigurationException;

public class Main {

    public static void main(String[] args) throws ParseException {

        // Current usage
        BookMetadataFormatter formatter = null;
        try {
            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.CSV);
            formatter.append(TestData.dragonBook);
            formatter.append(TestData.dinosaurBook);
            System.out.print(formatter.getMetadataString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (PluginConfigurationException e) {
            e.printStackTrace();
        }

        // Expected usage
//        BookMetadataExporter exporter = new XMLBookMetadataExporter();
//        exporter.add(TestData.sailboatBook);
//        exporter.add(TestData.GoFBook);
//        exporter.export(System.out);
    }
}
