interface SmartDevice {
    void turnOn();
    void turnOff();
    void displayStatus();
}

interface EnergyMonitor {
    double calculatePowerConsumption();
}

class SmartLight implements SmartDevice, EnergyMonitor {
    boolean on = false;
    public void turnOn() { on = true; }
    public void turnOff() { on = false; }
    public void displayStatus() { System.out.println("Light: " + (on ? "ON" : "OFF")); }
    public double calculatePowerConsumption() { return on ? (15 * 6) / 1000.0 : 0; }
}

class SmartFan implements SmartDevice, EnergyMonitor {
    boolean on = false;
    public void turnOn() { on = true; }
    public void turnOff() { on = false; }
    public void displayStatus() { System.out.println("Fan: " + (on ? "ON" : "OFF")); }
    public double calculatePowerConsumption() { return on ? (75 * 8) / 1000.0 : 0; }
}

class SmartAC implements SmartDevice, EnergyMonitor {
    boolean on = false;
    int hours = 5;
    public void turnOn() { on = true; }
    public void turnOff() { on = false; }
    public void displayStatus() { System.out.println("AC: " + (on ? "ON" : "OFF")); }
    public double calculatePowerConsumption() { return on ? (1500 * hours) / 1000.0 : 0; }
}

class Main {
    public static void main(String[] args) {
        SmartDevice[] d = { new SmartLight(), new SmartFan(), new SmartAC() };
        for (SmartDevice dev : d) {
            dev.turnOn();
            dev.displayStatus();
            System.out.println("Power: " + ((EnergyMonitor) dev).calculatePowerConsumption() + " kWh");
        }
    }
}
