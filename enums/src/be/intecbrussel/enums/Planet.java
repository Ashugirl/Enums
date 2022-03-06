package be.intecbrussel.enums;

public enum Planet {
    // list of planet radii (size);
    //Mercury: 2439 km, Earth: 6371 km, Mars: 3389 km
    //Venus: 6051 km, Saturn: 58232 km, Jupiter: 69911 km
    //Uranus: 25362 km, Neptune: 24622 km

    MERCURY(2439), VENUS(6051),
    EARTH(6371){
        @Override
        public String toString() {
            return "We are on earth!";
        }
    }, MARS(3389),
    JUPITER(69911), SATURN(58232),
    NEPTUNE(24622), URANUS(25362);
    private int radius;
    //default constructor
    Planet(){

    }
    //constructor with parameter
    Planet(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Planet{ name  = " + this.name() + "\n" +
                "radius=" + radius +
                "} " ;
    }
}
