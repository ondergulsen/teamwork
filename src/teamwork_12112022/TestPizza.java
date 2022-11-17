package teamwork_12112022;

public class TestPizza {
    public static void main(String[] args) {
//        Create a class called Pizza that contains information about a single pizza.
//
//        The Pizza class must contain ;
//        Private variables to store:
//        1- The size of the pizza (small, medium or large),
//        2- Number of cheeses,
//        3- Number of salami/sausages,
//        4-Number of spices,
//
//        Constructors that set all instance variables.
//        Generic methods for getting and setting instance variables.
//        A generic method called calcCost() to calculate the cost of pizza.
//
//        The cost of pizza is determined as follows:
//        Small: $10 + $2 per Variety
//        Medium: $12 + $2 per Variety
//        Large: $14 + $2 per Variety
//        A generic method called getDescription() returns a String containing the size of the pizza,
//        the quantity of each ingredient, and the cost of the pizza calculated by calcCost().
//        Write test code to create several pizzas and extract their descriptions.
//        For example, a large pizza with one cheese, one sausage and two spices should cost a total of $22.


        Pizza pizza1 = new Pizza("Large",1, 1, 2);
        Pizza pizza2 = new Pizza("small",1, 1, 1);
        Pizza pizza3 = new Pizza("Medium",2, 2, 2);

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);


       
    }
}
