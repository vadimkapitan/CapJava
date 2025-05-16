package topic3Enums.task3Planet;

public class PlanetDemo {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println(planet + ": " + planet.surfaceGravity());
        }
    }
}
