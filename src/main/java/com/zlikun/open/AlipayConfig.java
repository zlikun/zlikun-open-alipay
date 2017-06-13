package com.zlikun.open;

/**
 * 支付宝接入配置常量
 * @auther zlikun <zlikun-dev@hotmail.com>
 * @date 2017/6/13 16:37
 */
public interface AlipayConfig {

    /** 应用ID */
    String APPID = "2016080600178223" ;
    /** 支付网关 */
    String PAY_GATEWAY = "https://openapi.alipaydev.com/gateway.do" ;
    /** 应用私钥 */
    String APP_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCSWVPIG/cUhkbVH6XHCNvDdrD0QMPvrhZIBpiQNZ7GYyWuTge4jwC5+3e6FF5zw2M0gOOpBvenUVzVjULpUvQNoycWuXhq0/iSvKKdgNb8RuKd9ryuuQ1JzEWnn5/MFhhh8aLz6d/33hyxjZLsMA5VG5dnnz5G5/7RH8345eeRww7Me+eb/vIZ8KOKGRwhG8Ut0eSCSqIGR/7On3R/Q2NoEVXTdnpDlEGi+NDiqQ5Sm4Oy62uoLIsl2NGh9RWb7dwbaQ5vHshq5zuWzCKeHuhDLRiRk2qEQa9CrvMPN3ujA9EfftF1MaWJ2ks7IYqoCLLZ5uBnzrwXZlPzdKTTk4W/AgMBAAECggEAOn2rJ5JNuQ1FqA5jAl5+/uskJCryZIvOafEA7roPgDjGKZkUKuY0oyBnJJ7ZdSkFMEnHM5oORvgUw2EW+gvmcMDhcYqlHwUjFvp/f7Wrtt5Z2kpv9OEO94zF1g3NHxNBoXui5ht2ISnLjAcKTo2SXN+PLqINkOdOB6TPfIfeenm96QFDdD6Ye+/rn2PIEPMgMF5VgDynssEb6dL1SkaEGk+0WUKZg8wt1iRUOA0H7gapY8f3MBraU0CPjm1jeGLuXzEUdcnpVr3b55ebnauH2WPg7yHCN9jbHD0pPeW+cC9GU5BOKcw09909SrZrOVU5sUqfbd6m7X646mHuJDyxmQKBgQDvZAzJZjBu5bhYq2XDXreg0gNQLl+rfnMR/Bp+TDSTXfjjSoQTD4EiU8eogD9P2YyU5sAU7ARb6pvYyCn4itFP6tFOejqkcVkhP0OG/8uyXL70eyoehD309WHks3PsKxn/KhUsDfJYJjKxuBTgrojlv0oT0+btqplldHeRcP0rCwKBgQCcgLXB0zrJgpSoRfHpsdo0r3vCWJuNmOD4K47j/SsI/e3i/Yll0krz5FDoniMZwf4yQqk2nkTWJNuUedizKYqmTb42XXcQ3G2FashZa0uuBzutOwu4kbB8gyahoGTwWtb2PWYcWNjeETZZ9GMSsQEHC+3xO9WypaCuuOYQRARgnQKBgQDRfUVvTXze3yq2da9FC/M3yfDaTuqrwaljOLHaikeMGrU9+iygHXZNGvHi8+/zqZZLi67V4EBkS2d8ipWoCZroC76EpZQB6ass3Bb04Y5ZFK6KdenC8MjjP4UeRSgRqRpD4IjMl5vXJf5A5a1nfXURUJe7yDkTDLLWRNiJr03tRwKBgBKIh32xlwegCBy5U8GaBz4v/dbxCVLGZPXeqqhDJeKFt7Mm1SuSsL+bLR2vBHcbaw/mpwVJztsROFOn7kqhQ8MX98uWW/BKOkoPcDRuqWKthpqoIGY2EpFcMqn3RZzVFRnKAZqfxubdYPNcJpNjFL0R45aqwE7MoG+wg8YvV9ldAoGAJqB6wjmbSvNfBYduG/cBBILgf2OLIHH+cDVmN2SCAl9lQgFKPKlLadVCL3cSO26DuQUwL+tz1rZNh99mD8/wr/Q6nuV6xewRLzRd5Gvd42CLF+G7wvPSHNEa4O6cj7F44pVWZYcWOgsGeGida3pOA49kcd3NjhmtYHkuZJ5iLN0=" ;
    /** 应用公钥 */
    String APP_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkllTyBv3FIZG1R+lxwjbw3aw9EDD764WSAaYkDWexmMlrk4HuI8Auft3uhRec8NjNIDjqQb3p1Fc1Y1C6VL0DaMnFrl4atP4kryinYDW/Ebinfa8rrkNScxFp5+fzBYYYfGi8+nf994csY2S7DAOVRuXZ58+Ruf+0R/N+OXnkcMOzHvnm/7yGfCjihkcIRvFLdHkgkqiBkf+zp90f0NjaBFV03Z6Q5RBovjQ4qkOUpuDsutrqCyLJdjRofUVm+3cG2kObx7Iauc7lswinh7oQy0YkZNqhEGvQq7zDzd7owPRH37RdTGlidpLOyGKqAiy2ebgZ868F2ZT83Sk05OFvwIDAQAB" ;
    /** 支付宝公钥 */
    String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3TfivAGrDz3bDacGMjAt1+JYlDJyBdXGVjHyz8zJDwqamDbAgPPqBx61a4w6EaZvVMi5VHV2Md0znrqopdxD4EO9Lmf3xLPOgHXthse4ukJzRXy4qIu5nBG1vzAjp8LrGWu0lzLv6CKEiqsfp2l7H/ayVc7TGf82GMA1zeR6LwYrFWD5AX3rrVyhXFW9CFixpBJ6NWv57boUfK1GdmNnnLCaXriawWJ+uMeSj2BVh5n3TMSS3lkFtcW5lQPaUT2rlJBwbcu3Wv8Q0RE+rSfdDu8hGKPqa3cMDaIw/1MgBJWunVI1S3FTeWPdmoqDc6fTyk2jYOvasPa8A72YUf4KWQIDAQAB" ;

    /** 商户号 */
    String SELLER_ID = "2088102170160808" ;
    /** 商户帐号 */
    String SELLER_ACCOUNT = "pplwcn8157@sandbox.com" ;

    /** 签名类型 */
    String SIGN_TYPE = "RSA2" ;
    /** 字符集 */
    String CHARSET = "UTF-8" ;
    /** 格式，仅支持JSON */
    String FORMAT = "JSON" ;

}
