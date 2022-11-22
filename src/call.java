import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;

public class call implements Comparable<call> {
    private String date;
    private String startCall;
    private int minutes;

    public call(String date , String startCall,int minutes){
        this.date = date;
        this.startCall = startCall;
        this.minutes = minutes;

    }

    public String dogetStartCall() {
        return startCall;
    }

    public String getDate() {
        return date;
    }

    public double getMinutes() {
        return minutes;
    }

    public String getStartCall() {
        return startCall;
    }
    @Override
    public int compareTo(@NotNull call o) {
        return this.minutes - o.minutes;
    }
}
