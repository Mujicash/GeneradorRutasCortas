package Modelo;

import Controlador.Controllers;
import Controlador.CtrlPrincipal;
import Controlador.IControlador;
import Vista.IFrameView;

/**
 * @author Andre Mujica
 **/
public abstract class Usuario {

    private int idUsuario;
    private String usuario;
    private String contrasenia;
    private int idTipo;
    private String nombres;
    private String apellidos;
    private String correo;
    private String DNI;

    public Usuario(){
    }

    public Usuario(String usuario, String contrasenia, String nombres, String apellidos, String correo, String DNI, int idTipo) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.idTipo = idTipo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.DNI = DNI;
    }

    public Usuario(int idUsuario, String usuario, String contrasenia, String nombres, String apellidos, String correo, String DNI, int id_tipo) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.idTipo = id_tipo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.DNI = DNI;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public IControlador generarControlador(){
        IFrameView vista = IFrameView.Factory(Controllers.PRINCIPAL);
        IControlador controlador = vista.generarControlador();
        ((CtrlPrincipal) controlador).setConectado(this);
        return controlador;
    }

    @Override
    public String toString() {
        return "Usuario: " + usuario + " => " + nombres + ", " + apellidos;
    }
}
