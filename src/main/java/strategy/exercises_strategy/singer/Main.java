package strategy.exercises_strategy.singer;

public class Main {

    public static void main(String[] args) {
        Artist canSing = new Artist(new BeautifulSinger());
        Artist canNotSing = new Artist(new OutOfTuneSinger());

        canSing.playSinger();
        canNotSing.playSinger();
    }
}