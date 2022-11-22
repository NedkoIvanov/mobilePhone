public class battery {
    private String model;
    private int idleTime;
    private int hours;

    public battery(String model,int idleTime,int hours){
        this.model = model;
        this.idleTime = idleTime;
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public int getIdleTime() {
        return idleTime;
    }

    public String getModel() {
        return model;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setIdleTime(int idleTime) {
        this.idleTime = idleTime;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "BatteryModel='" + model + '\'' +
                ", BatteryIdleTime=" + idleTime +
                ", BatteryHours=" + hours;
    }
}
