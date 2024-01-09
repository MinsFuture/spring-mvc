package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String user() {
        return "get users";
    }

    @PostMapping
    public String addUser() {
        return "post user";
    }

    @GetMapping("/{userID}")
    public String findUser(@PathVariable String userID) {
        return "get userID=" + userID;
    }

    @PatchMapping("/{userID}")
    public String updateUser(@PathVariable String userID) {
        return "update userID=" + userID;
    }

    @DeleteMapping("/{userID}")
    public String deleteUser(@PathVariable String userID) {
        return "delete userID=" + userID;
    }
}
