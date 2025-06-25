import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        difference();
        smallest();
        int x = 2;
        int y = 10;
        maths(x, y);

    }
    public static void  difference(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(54);
        numbers.add(122);
        numbers.add(99);
        numbers.add(9);
        numbers.add(41);
        numbers.add(1);


        Collections.sort(numbers);
        for (int i: numbers){}

        System.out.println("El número menor es: " + numbers.get(0));
        System.out.println("El número mayor es: "+ numbers.get(numbers.size() -1));

    }
    public static void  smallest(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(54);
        numbers.add(122);
        numbers.add(99);
        numbers.add(9);
        numbers.add(41);
        numbers.add(1);


        Collections.sort(numbers);
        for (int i: numbers){}

        System.out.println("El número menor es: " + numbers.get(0));
        System.out.println("El segundo número menor es: "+ numbers.get(1));
    }
    public static void  maths(int x, int y){

        //necesito calcular las dos partes de forma individual y hacer la suma
        // ¿dos o tres variables? ¿puedo hacerlo seguido?


        int parte1 = (int)Math.pow(x,2);
        int parte2 = (4 * y)/5 - x;
        int parte3 = (int) Math.pow(parte2, 2);

        int partes = (int)Math.pow(x,2) + (int)Math.pow(((4 * y)/5 - x),2);

        int resultado = parte1 + parte3;

        System.out.println("El total de la ecuación es: " + resultado);
        System.out.println("El total de la ecuación con todo seguido es: " + partes);
    }
    }
