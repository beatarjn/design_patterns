package strategy.exercises_strategy.tea;

public class Shop {

    private Tea tea;

    public Shop(Tea tea) {
        this.tea = tea;
    }

    public String makeTea() {
        return "Make " + tea.make();
    }
}
