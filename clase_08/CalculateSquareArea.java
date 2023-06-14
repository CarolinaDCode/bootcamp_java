package clase_08;

public class CalculateSquareArea {
    public static void main(String[] args){
        float suma = 0;
        suma += getSquareArea(15);
        suma += getSquareArea(10);
        System.out.println("Suma de todas las areas: " + suma);
    }

    /**
     * getSquareArea:
     * function that calculates and returns the area of a square
     */
    private static int getSquareArea(int lado) {
        return lado * lado;
    }
}
