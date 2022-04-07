package creational;

import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONObject jsonObject;

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        String headers = "";
        for (Book.Metadata metadata : Book.Metadata.values()) {
            headers = headers+metadata.value;
        }
        JSONObject.escape(headers);

        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        String authors = String.join("|", b.getAuthors());
        String text = "";
        text = JSONObject.escape(b.getISBN()+ b.getTitle()+b.getPublisher()+authors);
        System.out.println(text);
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return jsonObject.toString();
    }
}
