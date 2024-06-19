package com.example.demo.controller;

import com.example.demo.dto.response.Response;
import io.swagger.v3.core.util.Json;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.request.UserRequestDTO;
import com.example.demo.dto.request.UserRequestSignInDTO;

@RestController
@RequestMapping("/v1/api")
public class UserController {

    @PostMapping("/user/signup")
//    public ResponseEntity<Response> addUser(@Valid @RequestBody UserRequestDTO userDTO) {
//        System.out.println("Received user signup request: " + Json.pretty(userDTO));
//        try {
//            // Logic to create user
//            // userService.createUser(userDTO);
//
//            // Assuming successful creation
//
//            // Return success response
//            Response response = new Response(HttpStatus.OK.value(),"Đăng kí thành công",  "userData " + "user_id");
//            return ResponseEntity.ok(response);
//        } catch (Exception ex) {
//            // Return error response
//            Response response = new Response(HttpStatus.CONFLICT.value(),"Đăng kí thất bại",  null);
//            return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
//        }
//    }
    public String addUser(@Valid @RequestBody UserRequestDTO userDTO) {
        System.out.println("Received user signup request: " + Json.pretty(userDTO));
        return "User signed up";
    }


    @PostMapping("/user/signin")
    public String signIn(@Valid @RequestBody UserRequestSignInDTO userRequestSignInDTO) {
        return "User signed in";
    }

    @PatchMapping("/v1/api/user/updated/{user_id}")
    public String updateUser(@Valid @RequestParam("user_id") String userId, @RequestBody UserRequestDTO userDTO) {
        return "User updated for: " + userId;
    }

    @DeleteMapping("/user/delete/{user_id}")
    public String deleteUser(@Valid @RequestParam("user_id") String user_id) {
        return "User deleted";
    }
}
