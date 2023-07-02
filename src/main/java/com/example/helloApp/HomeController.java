package com.example.helloApp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(HttpServletRequest request) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        return "🔥 Server IP : " + localHost.getHostAddress();
    }

}
