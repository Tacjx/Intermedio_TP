package TP;

import java.util.ArrayList;
import java.util.List;

public class Tecnicos {
    private String Id_Tec;
    private String Nombre_Tec;
    private String Apellido_Tec;
    private List<String>Especialidades=new ArrayList<>();
    private Boolean Disponible=Boolean.TRUE;

    public String getId_Tec() {
        return Id_Tec;
    }

    public void setId_Tec(String id_Tec) {
        Id_Tec = id_Tec;
    }

    public String getNombre_Tec() {
        return Nombre_Tec;
    }

    public void setNombre_Tec(String nombre_Tec) {
        Nombre_Tec = nombre_Tec;
    }

    public String getApellido_Tec() {
        return Apellido_Tec;
    }

    public void setApellido_Tec(String apellido_Tec) {
        Apellido_Tec = apellido_Tec;
    }

    public List<String> getEspecialidades() {
        return Especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        Especialidades = especialidades;
    }

    public Boolean getDisponible() {
        return Disponible;
    }

    public void setDisponible(Boolean disponible) {
        Disponible = disponible;
    }
}
