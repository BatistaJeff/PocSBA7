package com.poc.ws.PocSBA7.resouces;


import com.poc.ws.PocSBA7.domain.User;
import com.poc.ws.PocSBA7.dto.UserDTO;
import com.poc.ws.PocSBA7.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public")
public class RegistrationResource {

    @Autowired
    private UserService userService;

    @PostMapping("/registration/users")
    public ResponseEntity<Void> registerUser(@RequestBody UserDTO userDTO){
        User user = this.userService.fromDTO(userDTO);
        this.userService.registerUser(user);
        return ResponseEntity.noContent().build();

    }

    @GetMapping("/regitrationConfirm/users")
    public ResponseEntity<GenericResponse> confirmRegistrationUser(@RequestParam("token") String token){
        final Object result = this.userService.validateVerificationToken(token);
        if (result.equals("valid")) {
            return ResponseEntity.ok().body(new GenericResponse("Success"));
        }
        return ResponseEntity.status(HttpStatus.SEE_OTHER).body(new GenericResponse(result.toString()));
    }

    @GetMapping(value = "/resendRegistrationToken/users")
    public ResponseEntity<Void> resendRegistrationToken(@RequestParam("email") String email) {
        this.userService.generateNewVerificationToken(email);
        return ResponseEntity.noContent().build();

    }

}
