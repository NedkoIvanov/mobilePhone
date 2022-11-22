import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void showOptions(){
        System.out.println("1.Delete");
        System.out.println("2.Delete longest call");
        System.out.println("3.Delete all");
        System.out.println("4.Add");
        System.out.println("5.Find sum");
        System.out.println("6.exit");
        System.out.println("Choose what you want to do:");
    }
    public static void main(String[] args) {
        ArrayList<call> samsungCallHistory  = new ArrayList<>();
        samsungCallHistory.add(new call("20.11.2022","10:56",36));
        samsungCallHistory.add(new call("21.11.2022","23:22",16));
        samsungCallHistory.add(new call("22.11.2022","12:40",10));
        phone samsung = new phone("s7","samsung",1999.99,"Teodor Teodorov",
                new battery("li-ion",48,12),new screen(7,256),samsungCallHistory);
        System.out.println("All information about " + samsung.getOwnerName() + " phone:");
        System.out.println(samsung.toString());

        int choose = 0;
        Scanner scn = new Scanner(System.in);
        showOptions();
        choose = Integer.parseInt(scn.nextLine());
        while(choose>0 && choose<6){
            switch(choose){
                case 1:
                    samsung.deleteCall(scn);
                    showOptions();
                    break;
                case 2:
                    samsung.deleteLongestCall();
                    showOptions();
                    break;
                case 3:
                    samsung.deleteAllCalls();
                    showOptions();
                    break;
                case 4:
                    samsung.addCall(scn);
                    showOptions();
                    break;
                case 5:
                    System.out.println("Enter price per minutes from your contract:");
                    double price = Double.parseDouble(scn.nextLine());
                    System.out.printf("You need to pay: %.2f!%n",samsung.callPriceSum(price));
                    showOptions();
            };
            choose = Integer.parseInt(scn.nextLine());
        }

    }
}