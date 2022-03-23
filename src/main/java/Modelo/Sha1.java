package Modelo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Andre Mujica
 **/
public class Sha1 implements IPasswordHashLib {

    @Override
    public String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA1");

            byte[] array = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();

            for (byte b : array) {
                sb.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1, 3));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Sha1.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static void main(String[] args) {
        IPasswordHashLib generator = new Sha1();
        System.out.println(generator.hashPassword("andre27"));
    }

}
