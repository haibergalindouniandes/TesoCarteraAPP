/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Date;

/**
 *
 * @author zlaifer
 */
public class Modelo_DetalleFactura {

    public int getIdDetalleFactura() {
        return IdDetalleFactura;
    }

    public void setIdDetalleFactura(int IdDetalleFactura) {
        this.IdDetalleFactura = IdDetalleFactura;
    }

    public double getCantidadProducto() {
        return CantidadProducto;
    }

    public void setCantidadProducto(double CantidadProducto) {
        this.CantidadProducto = CantidadProducto;
    }

    public double getPrecioTotalProducto() {
        return PrecioTotalProducto;
    }

    public void setPrecioTotalProducto(double PrecioVentaProducto) {
        this.PrecioTotalProducto = PrecioVentaProducto;
    }

    protected int IdDetalleFactura;
    protected double CantidadProducto;
    protected double PrecioTotalProducto;

    
    
}