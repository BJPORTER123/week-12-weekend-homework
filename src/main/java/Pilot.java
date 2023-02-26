public class Pilot extends CrewMember {

    private String pilotLicense;

    public Pilot(String name, Rank rank, String pilotLicense) {
        super(name, rank);
        this.pilotLicense = pilotLicense;
    }

    public String flyPlane() {
        return "Plane is flying";
    }
}
