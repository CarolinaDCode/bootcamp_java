package clase_13.ejercicio_02;

public class Paladin extends PersonajeBase{

    public int getMaximoPtsDevida(){
        /**
         * level * 5 * 2 == super.getMaximoPtsDevida() * 2;
         */
        return super.getMaximoPtsDevida() * 2;
    }
}
