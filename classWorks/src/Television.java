
public class Television {
    private boolean isOn = false;

    public void toggle() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public static void main(String[] args) {
        Television television = new Television();
        System.out.println(television.isOn());
    }
}
