/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author zlaifer
 */
public class Modelo_Cliente {

    protected String IdCliente;
    protected String TipoIdentificacion;
    protected String NombreCliente;
    protected String IdCodPostal;
    protected String IdPoblacion;
    protected String IdProvincia;
    protected String Direccion;
    protected String Telefonos;
    protected String email;

    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getTipoIdentificacion() {
        return TipoIdentificacion;
    }

    public void setTipoIdentificacion(String TipoIdentificacion) {
        this.TipoIdentificacion = TipoIdentificacion;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getIdCodPostal() {
        return IdCodPostal;
    }

    public void setIdCodPostal(String IdCodPostal) {
        this.IdCodPostal = IdCodPostal;
    }

    public String getIdPoblacion() {
        return IdPoblacion;
    }

    public void setIdPoblacion(String IdPoblacion) {
        this.IdPoblacion = IdPoblacion;
    }

    public String getIdProvincia() {
        return IdProvincia;
    }

    public void setIdProvincia(String IdProvincia) {
        this.IdProvincia = IdProvincia;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefonos() {
        return Telefonos;
    }

    public void setTelefonos(String Telefonos) {
        this.Telefonos = Telefonos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Observaciones) {
        this.email = Observaciones;
    }
}
