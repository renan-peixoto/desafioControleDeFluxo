package contador;

public class Contador {

    public void toCount(int firstParam, int sndParam) throws ParametrosInvalidosException {
        if(firstParam > sndParam) throw new ParametrosInvalidosException();

        int count = sndParam - firstParam;

        for (int i = 1; i <= count; i++) {
            System.out.println("Printing the number: " + i);
        }
    }
}
