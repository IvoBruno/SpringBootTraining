package org.application.master.resources;

import org.application.master.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/users")
public class UserResource {

   @GetMapping
   public ResponseEntity<User> getAllUser() {
      //ResponseEntity é o tipo de dado de retorno de uma requisição usada no springboot
      User u =  new User(1L, "Ivo Araujo", "ivo.araujo@email.com", "123456", "86999999999");
      return ResponseEntity.ok().body(u);
      //ResponseEntity.ok() retorna uma resposta positiva à requisição, enquanto o .body(u) retorna o corpo do objeto informado, no caso, "u"
   }
}
