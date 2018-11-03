
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
            //rt.getForObject("http://localhost:8080/usuarios/add?id=null&nombre=Bueno&correo=cabroGueno@someemailprovider.com", String.class); //add
            //rt.getForObject("http://localhost:8080/usuarios/delete?id=2", String.class); //delete
            //rt.getForObject("http://localhost:8080/usuarios/update?id=3&nombre=jajaja&correo=asdasds@someemailprovider.com", String.class);  // el update       
            String res=rt.getForObject("http://localhost:8080/usuarios/all", String.class); //read
            
            System.out.println(res);
        } catch (Exception e) {
        }
    }
    
}
