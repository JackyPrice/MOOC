public class Bird {
    private String name;
    private String latinName;
    private int observationsCount;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        observationsCount = 0;
    }

    public void observation() {
        this.observationsCount++;
    }

    public int getObservationsCount() {
        return this.observationsCount;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void show() {
        System.out.println(this.name + " (" + this.latinName + "):" + this.observationsCount + " observations");
    }
}
