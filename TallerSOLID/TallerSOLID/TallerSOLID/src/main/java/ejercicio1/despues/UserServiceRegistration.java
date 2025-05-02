package ejercicio1.despues;

/**
 * 
 * @author Sebastián Ramos
 */
class UserServiceRegistration {
    private String username; 
    private String password; 
    private String email; 
    
    public void registerUser(String username, String password, String email){
        System.out.println("Registrando usuario");
    }
}
class SendEmail{
    public void sendWelcomeEmail(String email){
        System.out.println("Enviando email de bienvenida");
    }
}