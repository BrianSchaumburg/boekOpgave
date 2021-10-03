public class Boek {
    private String titel, auteur;
    private int aantalPaginas, aantalHoofdstukken;

    public Boek(String titel, String auteur, int aantalPaginas, int aantalHoofdstukken) {
       if(titel == null || titel.trim().isEmpty() || aantalPaginas<0 || aantalHoofdstukken <0)
           throw new IllegalArgumentException("Controleer de ingevoerde gegevens");
        this.titel = titel;
        this.auteur = auteur;
        this.aantalPaginas = aantalPaginas;
        this.aantalHoofdstukken = aantalHoofdstukken;
    }
    public int aantalPaginasPerHoofdstuk()
    {
        return this.aantalPaginas / aantalHoofdstukken;
    }
    public String giveBookInfo(){
        String result = "Je bent het boek " + this.titel +
                " van auteur " + this.auteur + " aan het lezen,"
                + " dit is een boek van " + this.aantalPaginas + " pagina's dik.";

        result += "\nHet gemiddeld aantal pagina's per hoofdstuk zal zijn: " +
                this.aantalPaginasPerHoofdstuk();

        return result;
    }

}
