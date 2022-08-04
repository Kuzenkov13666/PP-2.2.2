package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;

    private String series;
    private String stateNumber;

    public Car() {
    }

    public Car(String model, String series, String stateNumber) {
        this.model = model;
        this.series = series;
        this.stateNumber = stateNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }
}
