package Tourists;

import Locations.Boracay;
import Locations.Davao;
import Locations.Locations;
import Locations.Batanes;
import Locations.Palawan;
import Locations.Subic;
import Locations.Cebu;


public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

    void visit(Davao davao);
    
    void visit(Batanes batanes);

    void visit(Subic subic);

    void visit(Cebu cebu);

    void visit(Palawan palawan);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}