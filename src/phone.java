import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class phone{

    private final String model;
    private final String brand;
    private double price;
    private final String ownerName;
    private battery battery;
    private screen screen;

    private ArrayList<call> calls;

    private static phone nokiaN95 = new phone("N95","Nokia",249.99,"Nedko Ivanov",
            new battery("li-ion",12,6),new screen(7,256));

    public phone(String model, String brand, double price, String ownerName, battery battery, screen screen, ArrayList<call> calls) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.ownerName = ownerName;
        this.battery = battery;
        this.screen = screen;
        this.calls = calls;
    }

    public phone(String model, String brand, double price, String ownerName, battery battery, screen screen) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.ownerName = ownerName;
        this.battery = battery;
        this.screen = screen;

    }



    public String getModel() {
        return model;
    }

    public battery getBattery() {
        return battery;
    }

    public double getPrice() {
        return price;
    }

    public screen getScreen() {
        return screen;
    }

    public String getBrand() {
        return brand;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone: "  +
                "model=" + model + ", brand=" + brand +
                ", price=" + price +
                ", ownerName='" + ownerName +
                ", " + battery +
                ", " + screen;
    }

    public static phone getNokiaN95() {
        return nokiaN95;
    }

    public String printNokiaInfo(){
        return "Brand:" + getNokiaN95().getBrand() + ", Model:" + getNokiaN95().getModel()
                + ", price:" + getNokiaN95().getPrice() + ", owner:" + getNokiaN95().getOwnerName()
                + ", batteryInfo:" + getNokiaN95().getBattery().toString()
                + ", screenInfo:" + getNokiaN95().getScreen().toString();
    }

    public void deleteAllCalls(){
        if(calls.isEmpty()){
            System.out.println("All calls are deleted.");
        }else {
            calls.removeAll(calls);
        }
    }
    public void deleteCall( Scanner scn){
        if(calls.isEmpty()){
            System.out.println("No recent history.");
        }else {
            System.out.println("All calls saved in callHistory:");
            dateCompare dateCompare = new dateCompare();
            Collections.sort(calls,dateCompare);
            for (int i = 0; i < calls.size(); i++) {
                System.out.println((i + 1) + "." + calls.get(i).getDate() + "/" + calls.get(i).getStartCall()
                + "/" + calls.get(i).getMinutes());
            }
            System.out.println("Choose which one you want to delete:");
            int del = Integer.parseInt(scn.nextLine());
            try {
                calls.remove(del - 1);
            }catch(IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void addCall(Scanner scn){
        System.out.println("Date:");
        String date = scn.nextLine();
        System.out.println("Start:");
        String startCall = scn.nextLine();
        System.out.println("Minutes talking:");
        int minutes = Integer.parseInt(scn.nextLine());
        calls.add(new call(date,startCall,minutes));
    }
    public double callPriceSum(double price){
        for(int i=0;i<calls.size();i++){
            price += (double)calls.get(i).getMinutes()*price;
        }
        return price;
    }
    public void deleteLongestCall(){
        Collections.sort(calls);
        calls.remove(calls.indexOf(calls.get(calls.size()-1)));
        System.out.println("All calls saved in callHistory after deleting the longest:");
        for (int i = 0; i < calls.size(); i++) {
            System.out.println((i + 1) + "." + calls.get(i).getDate() + "/" + calls.get(i).getStartCall()
                    + "/" + calls.get(i).getMinutes());
        }
    }

}
