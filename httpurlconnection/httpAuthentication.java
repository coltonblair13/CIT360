Authenticator.setDefault(new Authenticator() {
     protected PasswordAuthentication getPasswordAuthentication() {
       return new PasswordAuthentication(username, password.toCharArray());
     
   });
 }