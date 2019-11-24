# mock-service
http mock service
支持http和https访问，http端口为8080，https端口为8443
- 生成ssl证书（暂时不需要）
    - keytool -genkey -alias tomcat  -storetype PKCS12 -keyalg RSA -keysize 2048  -keystore keystore.p12 -validity 3650
    - 生成证书的公钥和私钥
        - openssl pkcs12 -in keystore.p12 -clcerts -out public_key.pem
        - openssl pkcs12 -in keystore.p12 -nodes -out private_key.pem

    - postman访问个人证书认证的https网站
        - https://blog.csdn.net/huodoubi/article/details/89500123
        
        
        
* 目前进度
    - 支持http&https done
    - mock返回值策略 done
    - mock请求返回策略 todo
    - proxy策略 done
    - redirect策略 todo
    - 
    