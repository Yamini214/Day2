package Day4;

class HillStations{
    public void Location(){
        System.out.println("hill stations");
    }
    public void FamousFor(){
        System.out.println("for hills and its beauty");
    }
}
class Manali extends HillStations{
    public void Location(){
        System.out.println("Manali is located in Himachal Pradesh");
    }
    public void FamousFor(){
        System.out.println("Famous for  Adventure");
    }
}
class Mussoorie extends HillStations{
    public void Location(){
        System.out.println("Mussoorie is located in Uttarakhand");
    }
    public void FamousFor(){
        System.out.println("Famous for Hills Beauty ");
    }
}

class Gulmarg  extends HillStations{
    public void Location(){
        System.out.println("Gulmarg is located in Jammu & Kashmir");
    }
    public void FamousFor(){
        System.out.println("Famous for snow-covered mountains.");
    }
}
public class HillStation{
    public static void main(String[] args) {

        HillStations hillStations;
        hillStations=new HillStations();
        hillStations.Location();
        hillStations.FamousFor();

        hillStations=new Manali();
        hillStations.Location();
        hillStations.FamousFor();

        hillStations=new Mussoorie();
        hillStations.Location();
        hillStations.FamousFor();

        hillStations=new Gulmarg();
        hillStations.Location();
        hillStations.FamousFor();
    }
}
