package clase_23;

public class CurrencyConverter {

    /**
     * Objetos Pesados:
     * Usando Singleton - Mejora del Performance (rendimiento)
     * En caso existan varios objetos que utilizen el Patrón
     * de Diseño Singleton.
     * Solo se creará cuándo sea llamado
     * Solo se creará un unico objeto
     */
    private static CurrencyConverter instance;
    public static CurrencyConverter getInstance(){
        if (instance == null) {
            instance = new CurrencyConverter();
        }
        return instance;
    }

    /**
     * Usando Singleton - caso sencillo
     */
    /**
      private static final CurrencyConverter instance = new CurrencyConverter();
      public static CurrencyConverter getInstance(){
         return instance;
      }
     */

    public float convertirUsdToEur(float dolares) {
        return dolares * 0.91f;
    }

    public float convertirEurToUsd(float euros) {
        return euros * 1.10f;
    }
}
