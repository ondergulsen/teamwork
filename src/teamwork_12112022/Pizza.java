package teamwork_12112022;
public class Pizza {
    private String size;
    private int cheese;
    private int sausage;
    private int spice;

    public Pizza() {
    }

    public Pizza(String size, int cheese, int sausage, int spice) {
        this.size = size;
        this.cheese = cheese;
        this.sausage = sausage;
        this.spice = spice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getSausage() {
        return sausage;
    }

    public void setSausage(int sausage) {
        this.sausage = sausage;
    }

    public int getSpice() {
        return spice;
    }

    public void setSpice(int spice) {
        this.spice = spice;
    }

    public int calCost(){
        int cost=0;
        switch (size.toLowerCase()){
            case "small" -> {
                cost = 10 + ((cheese + sausage + spice) * 2);
            }
            case "medium" -> {
                cost = 12 + ((cheese + sausage + spice) * 2);
            }
            case "large" -> {
                cost = 14 + ((cheese + sausage + spice) * 2);
            }default -> System.out.println("Wrong choice!");

        }
        return cost;
    }

    public String toString(){
        return "The size of your pizza is: " + this.size.toLowerCase() + " Number of cheeses: " + this.cheese +
                " Number of sausages: " + this.sausage + " Number of spices: " + this.spice +
                " Total cost you should pay: " + calCost() + "$";
    }
}
