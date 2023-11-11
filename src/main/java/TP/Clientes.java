package TP;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
    private String Cuit;
    private String Nombre_Cliente;
    private String Apellido_Cliente;
    private String Razon_Social;
    private List<String>Servicios=new ArrayList<>();

    public String getCuit() {
        return Cuit;
    }

    public void setCuit(String cuit) {
        Cuit = cuit;
    }

    public String getNombre_Cliente() {
        return Nombre_Cliente;
    }

    public void setNombre_Cliente(String nombre_Cliente) {
        Nombre_Cliente = nombre_Cliente;
    }

    public String getApellido_Cliente() {
        return Apellido_Cliente;
    }

    public void setApellido_Cliente(String apellido_Cliente) {
        Apellido_Cliente = apellido_Cliente;
    }

    public String getRazon_Social() {
        return Razon_Social;
    }

    public void setRazon_Social(String razon_Social) {
        Razon_Social = razon_Social;
    }

    public List<String> getServicios() {
        return Servicios;
    }

    public void setServicios(List<String> servicios) {
        Servicios = servicios;
    }
}
