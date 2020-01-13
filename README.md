# PocSBA7
POC - Springboot (Oauth2) + Angular7


## Para solicitar Token de acesso.
###Exemplo {
  Metodo: POST
  Authorization: Basic Auth // Credenciais {
    Username: cliente 
    Password: 123
   }
  URL: localhost:8080/oauth/token?grant_type=password&username=joao@gmail.com&password=123
}

## Para solicitar refresh token.
 ###Exemplo {
  Metodo: POST
  Authorization: Basic Auth // Credenciais {
    Username: cliente 
    Password: 123
   }
  URL: localhost:8080/oauth/token?grant_type=refresh_token&refresh_token={REFRESH_TOKEN}
}
