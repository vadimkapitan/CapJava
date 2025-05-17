package topic3Enums.task4Season;

public enum Season {
    WINTER(-22.2), SPRING(15.2), SUMMER(29.3), FALL(0.1);

    private final double temp;

    Season(double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return  "Season: " + name() +" - avgTemp: "+ + temp + " ^C";
    }
}
