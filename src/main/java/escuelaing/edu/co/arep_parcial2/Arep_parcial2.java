/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package escuelaing.edu.co.arep_parcial2;

import spark.Spark.*;

import static spark.Spark.*;

/**
 *
 * @author david.otalora-b
 */
public class Arep_parcial2 {



    public static void main(String[] args) {
        ServicePalindroma servicePalindroma = new ServicePalindroma();
        port(getPort());
        staticFileLocation("/files");
        get("/espalindromo/", (req, res) -> {
            System.out.println();
            //boolean response = servicePalindroma.isPalindroma("");
            System.out.println(req+" "+res);
            return "hello";
        });

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }


}
