package design.patterns.decorators;

public interface DataSource {

    void writeData(String data);

    String readData();
}
