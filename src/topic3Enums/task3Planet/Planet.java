package topic3Enums.task3Planet;

/**
 * Создайте перечисление Planet с элементами (например, EARTH, MARS, JUPITER) и следующими параметрами:
 * mass (масса в кг)
 * radius (радиус в метрах)
 * Реализуйте:
 * Конструктор с параметрами.
 * Метод surfaceGravity(), вычисляющий гравитацию по формуле:
 * G * mass / (radius * radius), где G = 6.67430e-11.
 * В классе PlanetDemo выведите для каждой планеты её гравитацию.
 */

public enum Planet {
    EARTH(3, 2), MARS(4, 5), JUPITER(6, 7);

    private final double mass;
    private final double radius;
    private final static double G = 6.67430e-11;


    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }


}
