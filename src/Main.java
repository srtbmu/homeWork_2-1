public class Main {
    public static void main(String[] args) {
        Stadium stadium = new Stadium("BOX","Tynalieva 2/4");
        Voleyball voleyball = new Voleyball(TypeOfSport.GROUND,stadium,12,20,"Argen");
        System.out.println(voleyball.getInfo());
        voleyball.goPass();
        voleyball.goPass("pass!");
        Stadium stadium1 = new Stadium("Olimp","Necrasova");
        Pioneerball pioneerball = new Pioneerball(TypeOfSport.GROUND,stadium1,12,10,"Bekmyrza",2);
        System.out.println(pioneerball.getInfo());
        pioneerball.goPass();
        pioneerball.goPass("go pass!");
        System.out.println("-----------------------------------------------");
        Stadium stadium2 = new Stadium("Fanat","Manas");
        Pioneerball pioneerball1= new Pioneerball(TypeOfSport.GROUND,stadium2,12,22,"Said",2);
        System.out.println(pioneerball1.getInfo());
        pioneerball1.goPass();
        pioneerball1.goPass("pass me!");



    }
}