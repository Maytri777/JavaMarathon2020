package day7;

public class Player {
    private int stamina;
    private static int playersAmFeld = 6;
   // public static final int MAX_STAMINA = 100;
   // public static final int MIN_STAMINA = 0;

    public Player(int staminaR) {
        this.stamina = staminaR;
        System.out.println("Из конструктора: Player has power =" + this.stamina);
    }

    public int getStamina() {
        //System.out.println("Player has now stamina =" + this.stamina);
        return this.stamina;
    }

    public int getAnzahlAmFeld() {
        playersAmFeld = playersAmFeld - 1;
        return playersAmFeld;
    }

    public int run(int staminaX) {
        staminaX = staminaX - 1;
        if (staminaX == 0) {
            System.out.println("Игрок выдохся, идёт на скамейку запасных!");
            getAnzahlAmFeld();
        }
        return staminaX;
    }

    public void info() {
        if (playersAmFeld == 6) {
            System.out.println("\nНа поле нет свободных мест");
        }
        if (playersAmFeld < 6) {
            System.out.println("Команды неполные. На поле еще есть  " + (6 - playersAmFeld) + " свободных мест");
        }
    }
}
