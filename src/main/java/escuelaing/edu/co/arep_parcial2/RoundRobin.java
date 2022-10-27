package escuelaing.edu.co.arep_parcial2;

import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobin {

    private AtomicInteger valuePuerto1;
    private AtomicInteger valuePuerto2;
    private int puerto1;
    private int puerto2;

    public RoundRobin(){
        valuePuerto1 = new AtomicInteger(1);
        valuePuerto2 = new AtomicInteger(1);
        puerto1 = 4567;
        puerto2 = 4568;
    }

    public int calculate(){
        int newPort;
        if (valuePuerto2.get()>=7){
            newPort=puerto2;
            valuePuerto1.set(1);
        }
        else if (valuePuerto1.get()>=7){
            newPort = puerto2;
            valuePuerto2.set(1);
        } else{
            newPort = puerto1;
            valuePuerto1.addAndGet(1);
        }

        if (valuePuerto1.get()>100){valuePuerto1.set(1);valuePuerto2.set(1);}
        return newPort;

    }


}
