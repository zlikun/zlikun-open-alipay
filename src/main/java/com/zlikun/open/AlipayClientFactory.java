package com.zlikun.open;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

/**
 * @auther zlikun <zlikun-dev@hotmail.com>
 * @date 2017/6/13 16:48
 */
public class AlipayClientFactory {

    public static final AlipayClient alipayClient = new DefaultAlipayClient(
            AlipayConfig.PAY_GATEWAY,
            AlipayConfig.APPID,
            AlipayConfig.APP_PRIVATE_KEY,
            AlipayConfig.FORMAT,
            AlipayConfig.CHARSET,
            AlipayConfig.ALIPAY_PUBLIC_KEY,
            AlipayConfig.SIGN_TYPE);

    public static final AlipayClient getInstance() {
        return alipayClient ;
    }

}
