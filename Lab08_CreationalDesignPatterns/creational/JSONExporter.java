package creational;

public class JSONExporter implements Export {

    @Override
    public String exports() {
        System.out.println("Exported JSON");
        return null;
    }

}