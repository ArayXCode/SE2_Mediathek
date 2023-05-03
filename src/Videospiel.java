/**
 * Ein Videospiel ist ein {@link Medium}.
 * @author TimGr
 *
 */
public class Videospiel implements Medium
{
    /**
     * Der Titel des Videospiels
     */
    private String _titel;

    /**
     * Ein Kommentarzu dem Videospiel
     */
    private String _kommentar;

    /**
     * Ein System, auf dem das Videospiel gespielt werden kann
     */
    private String _system;

    /**
     * @param titel Der Titel des Videospiels
     * @param kommentar Ein Kommentar zum Videospiel
     * @param system Ein System, auf dem das Videospiel gespielt werden kann 
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure {@link #getTitel()} == titel
     * @ensure {@link #getKommentar()} == kommentar
     * @ensure {@link #get_system()} == system
     */
    public Videospiel(String titel, String kommentar, String system)
    {
        assert titel != null : "Vorbedingung verletzt: _titel != null";
        assert kommentar != null : "Vorbedingung verletzt: _kommentar != null";
        assert system != null : "Vorbedingung verletzt: konsole != null";
        _titel = titel;
        _kommentar = kommentar;
        _system = system;
    }

    @Override
    public String getKommentar()
    {
        return _kommentar;
    }

    @Override
    public String getMedienBezeichnung()
    {
        return "Videospiel";
    }

    /**
     * Gibt den Titel des Videospiels zurück
     * @return Titel des VideoSpiels
     */
    public String getTitel()
    {
        return _titel;
    }

    /**
     * Gibt das System des Videospiels zurück
     * @return System des Videospiels
     */
    public String get_system()
    {
        return _system;
    }

    @Override
    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + ":\n" + "    " + "Titel: " + _titel
                + "\n" + "    " + "Kommentar: " + _kommentar + "\n" + "    "
                + "System: " + _system + "\n";
    }

}
