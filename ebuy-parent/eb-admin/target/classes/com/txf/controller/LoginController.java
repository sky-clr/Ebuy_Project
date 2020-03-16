package com.txf.controller;

        import com.txf.service.UserService;
        import com.txf.utils.EncryptionUtil;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;

        import java.util.Date;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public String login(String username, String pwd) throws Exception{
        System.out.println(new Date());
        if(userService.login(username, EncryptionUtil.ToMD5(pwd))){
            System.out.print(new Date());
            return "index";
        }else {
            System.out.println(new Date());
            return "login";
        }

    }
}
