public class Voleyball extends Sport{
    private int point;
    private String referee;

    public Voleyball(TypeOfSport typeOfSport, Stadium stadium, int numberOfPlayers,int point,String referee) {
        super(typeOfSport, stadium, numberOfPlayers);
        this.point = point;
        this.referee = referee;


    }


    public int getPoint() {
        return point;
    }

    public String getReferee() {
        return referee;
    }

    public void goPass(){
        System.out.println("go pass!");
    }
    public final void goPass(String pass){
        System.out.println(pass);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nPoints: "+ point+
                "\nReferee: "+ referee;
    }
}