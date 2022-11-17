package teamwork_17112022;

public class ShortBar extends IronBar{

    public ShortBar(int length) {
        super(length);
    }

    @Override
    public String showData() {
        return super.showData() + " This is a short iron bar";
    }
}
