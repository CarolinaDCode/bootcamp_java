package clase_23;

public class Main {

    /**
     * SINGLETON
     * Link del video = "https://www.twitch.tv/videos/1886682199"
     * @param args
     */
    public static void main(String[] args) {

        float euros = CurrencyConverter.getInstance().convertirUsdToEur(10);
        System.out.println("Euros: " + euros);

    }
}
