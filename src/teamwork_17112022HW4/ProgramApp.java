package teamwork_17112022HW4;

import java.util.Scanner;

public class ProgramApp {
    public static void main(String[] args) {
//        Aşağıdaki özellik ve davranışlara sahip House sınıfı tasarlanacaktır.
//        bedroom:int
//        bathroom:int
//        heating:String {Gas, Electric}
//        cooling: boolean
//        hasPool:boolean
//        heat():void output: The house is heated.
//        runCoolingSystem():void {if cooling is true, output: Cooling system is working. if not, output: No Cooling System }
//        create a constructor - no parameter
//        create a constructor - with bedroom, bathroom and heating
//        Program sınıfı - main metodu içerisinde aşağıdaki görevleri yerine getiriniz.
//
//        create two House objects - one with no parameter constructor and the other with three parameters constructor
//
//        run heat() and runCoolingSystem() methods

        House house1= new House();
        House house2= new House(2,2,"Gas");
        house1.hasCool=true;

        house1.heat();
        house1.runCoolingSystem();

        System.out.println();

//        house2.hasCool=false;
        house2.heat();
        house2.runCoolingSystem();
    }
}
