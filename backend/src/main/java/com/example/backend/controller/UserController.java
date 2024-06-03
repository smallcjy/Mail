package com.example.backend.controller;

import com.example.backend.entity.User;
import com.example.backend.result.Result;
import com.example.backend.service.SignupService;
import com.example.backend.service.UserService;
import com.example.backend.service.VerificationService;
import jakarta.validation.Valid;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Objects;

@RestController
@CrossOrigin(origins = "*")
public class UserController
{
//    session的字段名
    public static final String SESSION_NAME = "userInfo";

    @Autowired
    private SignupService signupService;

    @Autowired
    private VerificationService verificationService;
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 用户注册
     *
     * //@param user    传入注册用户
     * //@param errors  Validation的校验错误存放对象
     * //@param request 请求对象，用于操作session
     * //@return 注册结果
     */
    @PostMapping("/user/register")
    public Result<User> register(@Valid @RequestBody User user, BindingResult errors, HttpServletRequest request) {
        Result<User> result = new Result<>();

        // 打印请求参数
        logger.info("用户名: " + user.getUsername());
        logger.info("密码: " + user.getPassword());
        logger.info("完整的 User 对象: " + user.toString());

        // 检查校验结果
        if (errors.hasErrors()) {
            return Result.error("Validation校验失败，http的body不为JSON格式的数据！");
        }

        // 调用注册服务
        result = signupService.signup(user);
        return result;
    }

    @PostMapping("/user/verifycode")
    public Result<User> verify(@RequestBody @Valid User user, @RequestBody @Valid String vcode, BindingResult errors) {
        Result<User> result = new Result<>();
        // 检查校验
        if (errors.hasErrors()) {
            return Result.error("Validation校验失败，http的body不为JSON格式的数据！");
        }
        // 验证验证码
        boolean isVerified = verificationService.verifyCode(user.getTelephone(), vcode);
        if (!isVerified) {
            return Result.error("验证码错误！");
        }
        // 用户注册
        result = signupService.completeSignup(user);

        return result;
    }

}

