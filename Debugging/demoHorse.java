/**
 * Created by jc320658 on 12/09/16.
 */
public class demoHorse {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        raceHorse horse2 = new raceHorse();
        horse1.setName("noel");
        horse1.setYear(2012);
        horse1.setColour("brown");
        horse2.setName("Maximus");
        horse2.setColour("white");
        horse2.setYear(2011);
        horse2.setRaces(2);
        System.out.println(horse1.getName() +" was born in " + horse1.getYear() + " and is a " + horse1.getColour() + " horse." );
        System.out.println(horse2.getName() +" was born in " + horse2.getYear() + " and is a " + horse2.getColour() + " horse." );
        System.out.println(horse2.getName() + " has been in " + horse2.getRaces() + " races.");


    }
}
