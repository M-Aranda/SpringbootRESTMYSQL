
package intentoconsumirrestspring;

import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Marce
 */
public class IntentoConsumirRestSpring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            RestTemplate rt= new RestTemplate();
            String res=rt.getForObject("http://localhost:8080/usuarios/all", String.class, 3);
            System.out.println(res);
        } catch (Exception e) {
        }
    }
    
}
