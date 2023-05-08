package Tourists;


import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("Chill lang");
    }

    public void visit(Boracay boracay) {
        System.out.println("ang pera ko ay " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("Boracay muna" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("La arep lods");
        }

      checkBudget();
        
    }

    public void visit(Batanes batanes) {

        if(budget >batanes.airFare){
            System.out.println("maraming bata dito");
            budget -= batanes.airFare;
        }else{
            System.out.println("La arep lods gg");
        }

        checkBudget();
    }
    public void visit(Davao davao) {
        if(budget >davao.airFare){
            System.out.println("FOOD TRIP MUNA NG DURIAN");
            budget -= davao.airFare;
        }else{
            System.out.println("Walang pang Durian");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("Palawan sa tagulan");
            budget -= palawan.airFare;
        }else{
            System.out.println("Di na mabili yung palawan");
        }

        checkBudget();
    }

    public void visit(Cebu cebu) {
        if(budget >cebu.airFare){
            System.out.println("Cebu na mga sir lezgggg");
            budget -= cebu.airFare;
        }else{
            System.out.println("Utang muna ako");
        }

        checkBudget();
    }

    public void visit(Subic subic) {
        if(budget >subic.airFare){
            System.out.println("Pakain na sa Tiger");
            budget -= subic.airFare;
        }else{
            System.out.println("Wala ng pambili ng Tiger");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}