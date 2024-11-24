package xyz.konnor.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xyz.konnor.shortlink.admin.dto.resp.UserRespDTO;
import xyz.konnor.shortlink.admin.service.UserService;

/**
 * 用户管理控制层
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 根据用户名获取用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public UserRespDTO getUserByUsername(@PathVariable("username") String username) {
        return userService.getUserByUserName(username) ;
    }
}
