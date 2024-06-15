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
public class Modelo_DetallePedido {

    protected int IdDetallePedido;
    protected double CantidadProducto;
    protected double PrecioTotalProducto;

    public int getIdDetallePedido() {
        return IdDetallePedido;
    }

    public void setIdDetallePedido(int IdDetallePedido) {
        this.IdDetallePedido = IdDetallePedido;
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

    public void setPrecioTotalProducto(double PrecioTotalProducto) {
        this.PrecioTotalProducto = PrecioTotalProducto;
    }

    
    
}
