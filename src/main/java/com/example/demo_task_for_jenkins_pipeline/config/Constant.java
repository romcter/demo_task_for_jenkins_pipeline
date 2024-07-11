package com.example.demo_task_for_jenkins_pipeline.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Constant {
    @Value("${email.regex}")
    public static String EMAIL_REGEX;
}

//@Component
//@RequiredArgsConstructor
//public class ItbiTokenUtil {
//
//    @Value("${crmAuth.siteUser}")
//    private String siteUser;
//    @Value("${crmAuth.sitePass}")
//    private String sitePass;
//
//    private LoginDto CRED;
//    private String token;
//
//    private final ItbiAuthClient client;
//
//    @PostConstruct
//    public void init() {
//        CRED = new LoginDto(siteUser, sitePass);
//    }
//
//    public String getToken(){
//        if(token == null)
//            setToken();
//        return token;
//    }
