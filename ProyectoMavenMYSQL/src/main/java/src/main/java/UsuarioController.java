
package src.main.java;

//import src.main.java.Usuario;
//import src.main.java.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController    // This means that this class is a (Rest)Controller
@RequestMapping(path = "/usuarios") // This means URL's start with /usuarios (after Application path)
//creo que tambien puede ser @RequestMapping( "/usuarios"), osea, sin el path=
public class UsuarioController {

    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UsuarioRepository usuarioRepository;

    //este metodo es el create
    @GetMapping(path = "/add") // Map ONLY GET Requests // seria http://localhost:8080/usuarios/add?id=null&nombre=algunombre&correo=alungmail@someemailprovider.com
    public @ResponseBody
    String addNewUser(@RequestParam String nombre,
             @RequestParam String correo) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Usuario n = new Usuario();
        n.setNombre(nombre);
        n.setCorreo(correo);
        usuarioRepository.save(n);
        return "Saved";
    }

    //este metodo es el read
    @GetMapping(path = "/all")//seria http://localhost:8080/usuarios/all
    public @ResponseBody
    Iterable<Usuario> getAllUsers() {
        return usuarioRepository.findAll();// This returns a JSON or XML with the users
    }
    
    //este metodo es el borrar
    @GetMapping(path = "/delete")//seria http://localhost:8080/usuarios/delete?id=1
    public @ResponseBody
    void delete(@RequestParam int id){
        Usuario u = new Usuario();
        u.setId(id);
        
        usuarioRepository.delete(u);
    }
}