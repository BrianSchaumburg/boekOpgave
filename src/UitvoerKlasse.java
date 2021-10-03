public class UitvoerKlasse {
    public static void main(String [] args) {
        try {
            Boek boek = new Boek("HTML&CSS", "Duckett", 999, 10);

            System.out.println(boek.aantalPaginasPerHoofdstuk());
            System.out.println(boek.giveBookInfo());
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Het programma is afgelopen. ");
        }

    }

}
