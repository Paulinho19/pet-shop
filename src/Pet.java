public class Pet {
    private String name;
    private String race;
    private boolean isClean;

    public String getName(){
        return this.name;
    }

    public String getRace(){
        return this.race;
    }

    public boolean getIsClean(){
        return this.isClean;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRace(String race){
       this.race = race;
    }

    public void setClean(boolean isClean){
        this.isClean = isClean;
    }


}