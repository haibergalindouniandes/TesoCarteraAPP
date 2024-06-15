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
public class Modelo_Factura {

    protected int IdFactura;
    protected String NumeroFactura;
    protected String FormaPago;
    protected String Observaciones;
    protected Date FechaFactura;
    protected double SubTotalFactura;
    protected int CuotaIva;
    protected int DescuentoFactura;
    protected double TotalFactura;

    public int getIdFactura() {
        return IdFactura;
    }

    public void setIdFactura(int IdFactura) {
        this.IdFactura = IdFactura;
    }

    public String getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(String NumeroFactura) {
        this.NumeroFactura = NumeroFactura;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }

    public Date getFechaFactura() {
        return FechaFactura;
    }

    public void setFechaFactura(Date FechaFactura) {
        this.FechaFactura = FechaFactura;
    }

    public double getSubTotalFactura() {
        return SubTotalFactura;
    }

    public void setSubTotalFactura(double SubaTotalFactura) {
        this.SubTotalFactura = SubaTotalFactura;
    }

    public int getCuotaIva() {
        return CuotaIva;
    }

    public void setCuotaIva(int CuotaIva) {
        this.CuotaIva = CuotaIva;
    }

    public int getDescuentoFactura() {
        return DescuentoFactura;
    }

    public void setDescuentoFactura(int DescuentoFactura) {
        this.DescuentoFactura = DescuentoFactura;
    }

    public double getTotalFactura() {
        return TotalFactura;
    }

    public void setTotalFactura(double TotalFactura) {
        this.TotalFactura = TotalFactura;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
  
    
}
