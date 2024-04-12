/* City class */
public class City {
    private String name = "";
    private String state = "";
    private double highTemp = 0.0;
    private double lowTemp = 0.0;

    public City(String name, String state, double highTemp, double lowTemp) {
        name = this.name;
        state = this.state;
        highTemp = this.highTemp;
        lowTemp = this.lowTemp;
    }

    public String getName() {
        return this.name;
    }

    public String getState() {
        return this.state;
    }

    public double getHighTemp() {
        return this.highTemp;
    }

    public double getLowTemp() {
        return this.lowTemp;
    }

    public void setHighTemp(double arg) {
        this.highTemp = arg;
    }

    public void setLowTemp(double arg) {
        this.lowTemp = arg;
    }

    public void printInfo() {
        // Denver, Colorado (High = 31.00, Low = -6.00)
        System.out.printf("%s , %s (High = %.2f, Low = %.2f)\n", name, state, highTemp, lowTemp);
    }
}