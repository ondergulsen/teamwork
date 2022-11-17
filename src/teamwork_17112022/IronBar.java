package teamwork_17112022;

public class IronBar {
    private int length;

    public IronBar(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String showData(){
        return "Length of bar is: " + length;
    }
}
