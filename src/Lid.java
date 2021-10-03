import java.util.Date;
public class Lid {
    private String voornaam, naam;
    private Date geboortedatum;
    public Lid(String v, String n ,Date gb  )
    {
        if(v == null || v.trim().isEmpty()||n.trim().isEmpty()|| n == null || gb == null)
            throw new IllegalArgumentException("Controleer de gegevens");
        voornaam = v;
        naam = n ;
        geboortedatum = gb ;
    }
    //geen andere methodes beschikbaar
}
