public class SK_025_HalloWeltApp2 {
    public static void main(String[] args) {

        // Unterprogramm aufrufen mit dem Argument "Jeffrey"
        GrussAusgeben("Jeffrey");
    }

    // Unterprogramm GrussAusgeben definieren mit dem Parameter Name
    protected static void GrussAusgeben(String Name) {

        // Unterprogramm GrussAusgeben gibt den String "Hallo " + Name + "!" aus
        String gruss = "Hallo " + Name + "!";
        System.out.println(gruss);
    }
}