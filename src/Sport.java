import java.util.Random;

public class Sport {
    private TypeOfSport typeOfSport;
    private Stadium stadium;
    private int numberOfPlayers;

    public TypeOfSport getTypeOfSport() {
        return typeOfSport;
    }


    public Stadium getStadium() {
        return stadium;
    }


    public Sport(TypeOfSport typeOfSport, Stadium stadium, int numberOfPlayers) {
        this.typeOfSport = typeOfSport;
        this.stadium = stadium;
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }



    private int generateDefaultNumber(){
        Random random = new Random();
        return random.nextInt(12)+1;
    }
    public String getInfo(){
        return "Type of sport: " + typeOfSport +
                "\n Stadium address: "+ stadium.getAddress()+
                "\n Stadium name: "+ stadium.getName();
    }
}
