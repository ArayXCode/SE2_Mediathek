/**
 * Eine abstrakt Implementation der Medium Klasse, die alle Medien in dem Programm repraesentiert.
 * @author TimGr
 *
 */
abstract class AbstractMedium implements Medium
{
    /**
     * Der Titel des Mediums
     * 
     */
    private String _titel;

    /**
     * Ein Kommentar zum Medium
     */
    private String _kommentar;

    /**
     * @param _titel Titel des Mediums
     * @param _kommentar Kommentar zum Medium
     * 
     * @require _titel != null
     * @require _kommentar != null
     * 
     * @ensure {@link #getTitel()} == titel
     * @ensure {@link #getKommentar()} == kommentar
     */
    protected AbstractMedium(String titel, String kommentar)
    {
        assert titel != null : "Vorbedingung verletzt: _titel != null";
        assert kommentar != null : "Vorbedingung verletzt: _kommentar != null";
        _titel = titel;
        _kommentar = kommentar;
    }

    /**
     * Gibt den Titel des Mediums zurück.
     * 
     * @return Den Titel des Mediums
     * 
     * @ensure result != null
     */
    public String getTitel()
    {
        return _titel;
    }

    /**
     * Ändert den Titel des Mediums.
     * 
     * @param titel Der Titel des Mediums
     * 
     * @require titel != null
     * @ensure getTitel() == titel
     */
    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        _titel = titel;
    }

    /**
     * Gibt den Kommentar zu diesem Medium zurück.
     * 
     * @return Den Kommentar zu diesem Medium.
     * 
     * @ensure result != null
     */
    public String getKommentar()
    {
        return _kommentar;
    }

    /**
     * Ändert den Kommentar des Mediums
     * 
     * @param kommentar Ein Kommentar zu diesem Medium
     * 
     * @require kommentar != null
     * @ensure getKommentar() == kommentar
     */
    public void setKommentar(String kommentar)
    {
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        _kommentar = kommentar;
    }

    /**
     * Gibt die Bezeichnung für die Medienart zurück.
     * 
     * @return Die Bezeichnung für die Medienart.
     * 
     * @ensure result != null
     */
    public abstract String getMedienBezeichnung();

    /**
     * Gibt einen formatierten Text mit allen Eigenschaften des Mediums zurück.
     * Jedes Attribute steht in einer eigenen Zeile mit der Form "Attributename:
     * Attributwert". Hinweis: Ein Zeilenumbruch wird durch den Character '\n'
     * dargestellt.
     * 
     * @return Eine Textrepräsentation des Mediums.
     * 
     * @ensure result != null
     */
    public String getFormatiertenString()
    {
        return ":\n" + "    " + "Titel: " + _titel + "\n" + "    "
                + "Kommentar: " + _kommentar;
    }

    /**
    * Berechnet die Mietgebuehr in Eurocent f¨ur eine angegebene Mietdauer
    * in Tagen
    **
    @param mietTage
    * Die Anzahl der Ausleihtage eines Mediums
    * @return Die Mietgeb ¨uhr in Eurocent als Geldbetrag
    **
    @require mietTage > 0
    **
    @ensure result != null
    */
    public Geldbetrag berechneMietgebuehr(int mietTage)
    {
        assert mietTage > 0 : "Vorbedingung verletzt: mietTage > 0";
        return new Geldbetrag(300 * mietTage);
    }
}
