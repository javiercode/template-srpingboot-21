package ubilapaz.edu.bo.template.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ubilapaz.edu.bo.template.dto.Response;
import ubilapaz.edu.bo.template.dto.UserDto;
import ubilapaz.edu.bo.template.dto.UsuarioDto;
import ubilapaz.edu.bo.template.entity.User;
import ubilapaz.edu.bo.template.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return new ResponseEntity<String>("Hola mundo!!", HttpStatus.OK);
    }

    @GetMapping("/testDto")
    public ResponseEntity<Response> testDto(){
        Response response = new Response();
        response.setEstado(true);
        response.setMensaje("exito<");

        UsuarioDto u = new UsuarioDto();
        u.setNombre("pablo");
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @GetMapping("/obtener/{id}")
    public ResponseEntity<UserDto> dtoGet(@PathVariable Integer id){

        User user= userRepository.getOne(1);

        UserDto u = new UserDto();
        u.setNombre(user.getNombre());
        u.setUsername(user.getUsername());

        return new ResponseEntity<UserDto>(u, HttpStatus.OK);
    }


}
