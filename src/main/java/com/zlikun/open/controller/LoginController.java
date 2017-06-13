package com.zlikun.open.controller;

import com.zlikun.open.AlipayConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 登录接入
 * @auther zlikun <zlikun-dev@hotmail.com>
 * @date 2017/6/13 16:54
 */
@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class) ;

    /** 支付宝授权请求 */
    private String authorizeUrl = "https://openauth.alipay.com/oauth2/publicAppAuthorize.htm" ;
    private String redirectUri = "http://alipay.zlikun.com/login/callback" ;

    @RequestMapping("/login")
    public String toLogin() throws UnsupportedEncodingException {

        String state = "zlikun" ;

        return String.format("redirect:%s?app_id=%s&scope=auth_user&redirect_uri=%s&state=%s"
                ,authorizeUrl , AlipayConfig.APPID , URLEncoder.encode(redirectUri ,"ISO-8859-1") ,state) ;
    }

    @RequestMapping("/login/callback")
    public void doCallback(String code ,String state) {

        logger.info("返回信息：code = {}、state = {}" ,code ,state);

    }

}
