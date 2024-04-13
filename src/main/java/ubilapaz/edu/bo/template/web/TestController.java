package ubilapaz.edu.bo.template.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ubilapaz.edu.bo.template.dto.Response;
import ubilapaz.edu.bo.template.dto.User;
import ubilapaz.edu.bo.template.dto.Usuario;

import java.time.LocalDateTime;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return new ResponseEntity<String>("Hola mundo!!", HttpStatus.OK);
    }

    @PostMapping("/test")
    public ResponseEntity<Usuario> dto(){
        //Usuario
        //nombre: Pablo
        //usuario: pgarcia
        //estodo: true
        Usuario user = new Usuario();
        user.setNombre("Pablo");
        user.setUsuario("pgarcia");
        user.setEstado(true);
        user.setFechaRegistro(LocalDateTime.now());
        return new ResponseEntity<Usuario>(user, HttpStatus.OK);
    }

    @GetMapping("/testDto")
    public ResponseEntity<Response> testDto(){
        Response response = new Response();
        response.setEstado(true);
        response.setMensaje("exito<");

        Usuario u = new Usuario();
        u.setNombre("pablo");
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @GetMapping("/dto")
    public ResponseEntity<User> dtoGet(){
        User u = new User();
        u.setNombre("javier");
        u.setUsername("username.javier");

        return new ResponseEntity<User>(u, HttpStatus.OK);
    }


}
