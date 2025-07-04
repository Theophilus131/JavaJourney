package enumTask;

public enum GeoPoliticalZones {

    NorthCentral("Benue","FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NorthEast("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NorthWest("Kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SouthEast("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SouthSouth("Akwa_ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"),
    SouthWest("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo");

    private final String[] geoPoliticatalZone;
    ;

    GeoPoliticalZones(String ... geoPoliticalZone){
        this.geoPoliticatalZone = geoPoliticalZone;
    }

    private String getPoliticalZone(){
        return  geoPoliticatalZone[0];
        //System.out.println();
    };

}
