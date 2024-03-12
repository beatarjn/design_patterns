package strategy.exercises_strategy.singer;

public class Artist {

    private Singer singer;

    public Artist(Singer singer) {
        this.singer = singer;
    }

    public void playSinger(){
        singer.sing();
    }
}
