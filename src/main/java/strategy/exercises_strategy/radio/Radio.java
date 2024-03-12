package strategy.exercises_strategy.radio;

public class Radio {

    private Song song;

    public Radio(Song song) {
        this.song = song;
    }

    public String playMusic(){
        return "On the radio now: " + song.play();
    }
}
