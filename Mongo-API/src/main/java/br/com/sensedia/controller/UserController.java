package br.com.sensedia.controller;

import br.com.sensedia.config.Routers;
import br.com.sensedia.model.User;
import br.com.sensedia.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = Routers.USER_BASE_ROUTE)
@Tag(name = "User", description = "Endpoint for user data")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    @Operation(summary = "Fetch User", description = "Get user by username", tags = { "User" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User found",
                    content = @Content(schema = @Schema(implementation = User.class))),
            @ApiResponse(responseCode = "404", description = "User not found")
    })
    @GetMapping(value = Routers.USERNAME_USER_BASE_ROUTE, produces = { "application/json"})
    public ResponseEntity<?> usernameController(@PathVariable String username){

        logger.info("USERNAME -> " + username);

        User user = userService.findUserByUsername(username);
        return ResponseEntity.status((user == null ? HttpStatus.NOT_FOUND : HttpStatus.ACCEPTED)).body(user);
    }

    @Operation(summary = "Save User", description = "Store user on database", tags = { "User" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User saved", content = @Content(schema = @Schema(implementation = User.class))),
            @ApiResponse(responseCode = "409", description = "User exists")
    })
    @PostMapping(produces = { "application/json"})
    public ResponseEntity<?> saveUserController(@RequestBody User user){
        User successUser = userService.saveUser(user);
        return ResponseEntity.status(successUser != null ? HttpStatus.ACCEPTED : HttpStatus.CONFLICT)
                .body(successUser != null ? successUser : null);
    }

    @Operation(summary = "Delete User", description = "Remove user from database base on ID", tags = { "User" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User deleted"),
            @ApiResponse(responseCode = "404", description = "User not found")
    })
    @DeleteMapping(value = Routers.ID_USER_DELETE_BASE_ROUTE, produces = { "application/json"})
    public ResponseEntity<?> deleteUserController(@PathVariable String id){
        boolean success = userService.deleteByID(id);
        return ResponseEntity.status(success ? HttpStatus.ACCEPTED : HttpStatus.NOT_FOUND).build();
    }

    @Operation(summary = "Update User", description = "Update all fields user on database", tags = { "User" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User updated", content = @Content(schema = @Schema(implementation = User.class))),
            @ApiResponse(responseCode = "400", description = "User not updated")
    })
    @PutMapping(produces = { "application/json"})
    public ResponseEntity<?> updateWholeUserController(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.updateUser(user));
    }

}
