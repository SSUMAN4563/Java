import java.util.Random;


class NumberProcessor
{
    volatile int number;
    volatile boolean available = false;
    void generateNumber()
    {
        Random r = new Random();
        while (true) {
            while (available) {
                Thread.yield();
            }
            number = r.nextInt(100)+1;
            System.out.println("Generated Number : "+number);
            available = true;

            for(int i = 0;i<1000000;i++)
            {

            }

        }
    }

void calculateSquare()
{
    while (true) {
        if (available && number %2==0) {
           int n  = number;
           System.out.println("Square of"+n+"="+(n*n));
           available = false; 
        }
    }
}

void calculateCube()
{
    while (true) {
        if (available && number %2!=0) {
           int n  = number;
           System.out.println("Cube of"+n+"="+(n*n*n));
           available = false; 
        }
    }
}
}

public class MultiThreadDemo {

    public static void main(String[] args) {
        
        NumberProcessor n = new NumberProcessor();
        
        
    }
    
}


