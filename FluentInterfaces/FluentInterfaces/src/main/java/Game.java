import java.util.LinkedList;

public class Game implements GameIF, GameBuilderIF, LocationIF {
    private LinkedList<Player> playerList;
    public static void main(String... args){
        Game g	=	Game.create()
                .player("Tom")
                .player("Annie")
                .asMaster()
                .player("Louise")
                .setInSpace();
    }
    private Game(){

    }
    public GameBuilderIF create() {
        return new GameBuilder();
    }

    @Override
    public PlayerIF player(String name) {
        Player p = new Player(name);
        playerList.add(p);
        return p;
    }

    @Override
    public void end() {

    }

    @Override
    public End setInSpace() {
        return null;
    }

    @Override
    public End setOnEarth() {
        return null;
    }

    @Override
    public End setUnderwater() {
        return null;
    }
}
