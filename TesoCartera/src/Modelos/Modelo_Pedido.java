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
public class Modelo_Pedido {

    protected int IdPedido;
    protected String NumeroPedido;
    protected String FormaPago;
    protected String Observaciones;
    protected Date FechaPedido;
    protected double SubTotalPedido;
    protected int CuotaIva;
    protected int DescuentoPedido;
    protected double TotalPedido;

    public int getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(int IdPedido) {
        this.IdPedido = IdPedido;
    }

    public String getNumeroPedido() {
        return NumeroPedido;
    }

    public void setNumeroPedido(String NumeroPedido) {
        this.NumeroPedido = NumeroPedido;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public Date getFechaPedido() {
        return FechaPedido;
    }

    public void setFechaPedido(Date FechaPedido) {
        this.FechaPedido = FechaPedido;
    }

    public double getSubTotalPedido() {
        return SubTotalPedido;
    }

    public void setSubTotalPedido(double SubTotalPedido) {
        this.SubTotalPedido = SubTotalPedido;
    }

    public int getCuotaIva() {
        return CuotaIva;
    }

    public void setCuotaIva(int CuotaIva) {
        this.CuotaIva = CuotaIva;
    }

    public int getDescuentoPedido() {
        return DescuentoPedido;
    }

    public void setDescuentoPedido(int DescuentoPedido) {
        this.DescuentoPedido = DescuentoPedido;
    }

    public double getTotalPedido() {
        return TotalPedido;
    }

    public void setTotalPedido(double TotalPedido) {
        this.TotalPedido = TotalPedido;
    }
    

    
    
}
