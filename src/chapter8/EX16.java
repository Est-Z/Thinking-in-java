package chapter8;


class AlertStatus{
    public String getStatus() {
        return "none";
    }
}

class RedAlertStatus extends AlertStatus{
    @Override
    public String getStatus() {
        return "red";
    }
}
class YellowAlertStatus extends AlertStatus{
    @Override
    public String getStatus() {
        return "yellow";
    }
}
class GreenAlertStatus extends AlertStatus{
    @Override
    public String getStatus() {
        return "green";
    }
}
class Starship{
    private AlertStatus alertStatus = new GreenAlertStatus();
    public void change(AlertStatus iStatus) {
        alertStatus = iStatus;
    }
    @Override
    public String toString() {
        return alertStatus.getStatus();
    }
}

public class EX16 {

    public static void main(String[] args) {
        Starship s = new Starship();
        System.out.println(s.toString());
        s.change(new YellowAlertStatus());
        System.out.println(s.toString());
        s.change(new RedAlertStatus());
        System.out.println(s.toString());

    }

} /* Output
green
yellow
red
*///:~
