package teamwork_17112022;

public class LongBar extends IronBar {


    public LongBar(int length) {
        super(length);
    }

    @Override
    public String showData() {
        return super.showData() + " This is a long iron bar";
    }
}


