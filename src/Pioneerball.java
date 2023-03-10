public final class Pioneerball extends Voleyball {
    private int amountOfBalls;

    public int getAmountOfBalls() {
        return amountOfBalls;
    }

    public Pioneerball(TypeOfSport typeOfSport, Stadium stadium,
                       int numberOfPlayers, int point, String referee,int amountOfBalls) {
        super(typeOfSport, stadium, numberOfPlayers, point, referee);
        this.amountOfBalls = amountOfBalls;
    }

    @Override
    public void goPass() {
        super.goPass();
        System.out.println("подавай!");

    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nAmount of balls: "+ amountOfBalls;
    }
}
