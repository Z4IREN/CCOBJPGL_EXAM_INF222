import Locations.*;
import Tourists.*;


public class App {
    public static void main(String[] args) throws Exception {

        Locations boracay = new Boracay();
        Locations batanes = new Batanes();
        Locations davao = new Davao();
        Locations palawan = new Palawan();
        Locations cebu = new Cebu();
        Locations subic = new Subic();

        Tourist Me = new Me();

        boracay.accept(Me);
        batanes.accept(Me);
        davao.accept(Me);
        palawan.accept(Me);
        cebu.accept(Me);
        subic.accept(Me);



    }
}