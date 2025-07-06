package enumTask;

public enum GeoPoliticalZones {

    NorthCentral("Benue","FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NorthEast("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NorthWest("Kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SouthEast("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SouthSouth("Akwa_ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"),
    SouthWest("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo");

    private String[] states;


    GeoPoliticalZones(String ... states){

        this.states = states;
    }

   public String [] getStates(){
        return states;
   }

   public void setStates(String ... states){
        this.states = states;
   }

   public static String getZone(String userState){
        for(GeoPoliticalZones zone : GeoPoliticalZones.values()){
            for(String state:zone.getStates()){
                if(state.equalsIgnoreCase(userState)){
                    return zone.name();
                }
            }
        }

        return userState + "not found";
   }

}
