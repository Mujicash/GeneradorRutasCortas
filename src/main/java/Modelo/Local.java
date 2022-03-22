package Modelo;

/**
 * @author Andre Mujica
 **/
public class Local {

    private Integer idLocal;
    private String nombre;
    private Nodo ubicacion;

    public Local() {
    }

    public Local(Integer idLocal){
        this.idLocal = idLocal;
    }

    public Local(Integer idLocal, String nombre, Nodo ubicacion) {
        this.idLocal = idLocal;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Nodo ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString(){
        return idLocal + " - " + nombre;
    }

}
