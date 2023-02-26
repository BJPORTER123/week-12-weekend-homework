public enum Rank {
    CAPTAIN,
    FIRST_OFFICER,
    LEAD_OFFICER,
    FLIGHT_ATTENDANT;

    @Override
    public String toString() {
        if (this == CAPTAIN) {
            return "Captain";
        } else if (this == FIRST_OFFICER) {
            return "First Officer";
        } else if (this == LEAD_OFFICER) {
            return "Lead Officer";
        } else if (this == FLIGHT_ATTENDANT) {
            return "Flight Attendant";
        } else {
            throw new IllegalArgumentException();
        }
    }
}
