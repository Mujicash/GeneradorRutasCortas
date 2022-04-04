package Modelo;

import Dao.UserException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Andre Mujica
 **/
public class WorkerRegistrationValidations {

    private Pattern pattern;
    private Matcher matcher;

    public void NamesValidation(String names) throws UserException {
        pattern = Pattern.compile("^[A-Z][a-z]+(\\s+[A-z][a-z]+){1,}$");
        matcher = pattern.matcher(names);

        if(names.equals("") || !matcher.matches()) {
            throw new UserException("Secuencia incorrecta para el nombre del trabajador");
        }

    }

    public void DNIValidation(String dni) throws UserException {
        pattern = Pattern.compile("^[1-9][0-9]{7}$");
        matcher = pattern.matcher(dni);

        if(dni.equals("") || !matcher.matches()) {
            throw new UserException("DNI invalido");
        }
    }

    public void EmailValidation(String email) throws UserException {
        pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        matcher = pattern.matcher(email);

        if(email.equals("") || !matcher.matches()) {
            throw new UserException("Correo invalido");
        }
    }

    public void UserNameValidation(String username) throws UserException {
        pattern = Pattern.compile("^[A-Za-z]\\w{5,29}$");
        matcher = pattern.matcher(username);

        if(username.equals("") || !matcher.matches()) {
            throw new UserException("Nombre de usuario invalido");
        }

    }

}
