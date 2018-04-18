public class Player implements PlayerIF {
    private String name;
    private boolean asMaster;

    public Player(String name){
        this.name = name;
        asMaster = false;
    }

    @Override
    public GameBuilderIF asMaster() {
        asMaster = true;
        return GameBuilder;
    }
    
   /* public void setLocation(Location l){
        location = l;
    }
    public void setAsMaster(boolean b){
        asMaster = b;
    }*/
   /* private Player asMaster(){
        this.asMaster = true;
        return this;
    }*/
/*
    private Player player(String name){
        return gameBuilder.player(name);
    }
*/

}
