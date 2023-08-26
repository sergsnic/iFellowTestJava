package Task3;

public enum ScaleTemperature {
    KELVIN("° K"), REAUMUR("° R"),FAHRENHEIT("° F");
    private String degreeScale;

    ScaleTemperature(String degreeScale) {
        this.degreeScale = degreeScale;
    }

    public String getDegreeScale() {
        return degreeScale;
    }
}
