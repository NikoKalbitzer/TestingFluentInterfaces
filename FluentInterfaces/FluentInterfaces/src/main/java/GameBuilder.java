import java.util.LinkedList;
import java.util.List;

public class GameBuilder implements GameBuilderIF, {


    public GameBuilder() {
        playerList = new LinkedList();
    }
    /*public GameBuilder player(String name){
        Player p = new Player(name);
        playerList.add(p);
        return this;*//*
    }*/
    public GameBuilder asMaster(){
        playerList.getLast().setAsMaster(true);
        return this;
    }
    public GameBuilder setInSpace(){
        playerList.getLast().setLocation(Location.IN_SPACE);
        return this;
    }
    public GameBuilder setOnEarth(){
        playerList.getLast().setLocation(Location.ON_EARTH);
        return this;
    }
    public GameBuilder setUnderwater(){
        playerList.getLast().setLocation(Location.UNTERWATER);
        return this;
    }
}

