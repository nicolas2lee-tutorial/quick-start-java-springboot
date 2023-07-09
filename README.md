# Enable https
Add self signed certificate to enable https

```shell
cd certs
keytool -genkey -alias quick-start-springboot -storetype PKCS12 -keyalg RSA -keypass changeit -keystore keystore.p12 
```

Add below configuration into application.yml
```yaml
server:
  port: 443
  ssl:
    key-store: certs/keystore.p12
    key-store-password: changeit
    keyStoreType: PKCS12
    keyAlias: quick-start-springboot
```