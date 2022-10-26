/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package escuelaing.edu.co.arep_parcial2;

import org.eclipse.jetty.util.ajax.JSON;
import spark.Spark.*;

import static spark.Spark.*;

/**
 *
 * @author david.otalora-b
 */
public class Arep_parcial2 {



    public static void main(String[] args) {
        ServicePalindroma servicePalindroma = new ServicePalindroma();
        RoundRobin roundRobin = new RoundRobin();

        port(getPort());
        staticFileLocation("/files");
        get("/espalindromo", "text", (req, res)->{
            String value = req.queryParams("value");
            String response = servicePalindroma.isPalindroma(value) ? "Si es palíndromo" : "No es palíndromo";
            int puerto = roundRobin.calculate();
            System.out.println(puerto);
            return "{'operation': 'Palíndromo'," +
                    "'input': "+value+","
                    + "'output': "+ response + " }";
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }


}
