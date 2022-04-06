package Modelo;

import org.jetbrains.annotations.NotNull;

/**
 * @author Andre Mujica
 **/
public class UsuarioDTO implements Comparable, SearchFilter {

    private final String userName;
    private final String fullName;
    private final String DNI;
    private final String email;
    private final String typeUser;

    public UsuarioDTO(String userName, String fullName, String DNI, String email, String typeUser) {
        this.userName = userName;
        this.fullName = fullName;
        this.DNI = DNI;
        this.email = email;
        this.typeUser = typeUser;
    }

    public String getUserName() {
        return userName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDNI() {
        return DNI;
    }

    public String getEmail() {
        return email;
    }

    public String getTypeUser() {
        return typeUser;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        int result = 0;

        try {
            String user = (o instanceof UsuarioDTO)? ((UsuarioDTO) o).getUserName() : (String) o;

            result = user.compareTo(userName);
            //result = (userName.contains(user))? 1 : 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public boolean matcher(String s) {
        return (userName.contains(s));
    }
}
