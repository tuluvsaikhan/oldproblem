import java.util.*; 

public enum RoundRobin { 
    EENIE, MEENIE, MINY, MO; 

    private final static RoundRobin[] values = values(); 
    private static int counter = -1; 

    public static RoundRobin nextInstance() {
        counter = (counter + 1) % values.length;
        return values[counter]; 
    } 

    public static void main(String[] args) { 
        for (int i = 0; i < 10; i++) 
            System.out.println(RoundRobin.nextInstance()); 
        // EENIE, MEENIE, MINY, MO, EENIE, MEENIE, MINY, MO, ... 
    } 
} 