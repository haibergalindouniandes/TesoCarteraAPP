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
public class Modelo_Producto {

    protected String IdProducto;
    protected String CodigoBarras;
    protected String ReferenciaProducto;
    protected String ReferenciaProductoCliente;
    protected String DescripcionCliente;
    protected double StockInicial;
    protected double StockActual;
    protected double PrecioProducto;
    protected double PrecioProductoVenta;
    protected String CategoriaProducto;
    protected String UnidadMedidad;

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getCodigoBarras() {
        return CodigoBarras;
    }

    public void setCodigoBarras(String CodigoBarras) {
        this.CodigoBarras = CodigoBarras;
    }

    public String getReferenciaProducto() {
        return ReferenciaProducto;
    }

    public void setReferenciaProducto(String ReferenciaProducto) {
        this.ReferenciaProducto = ReferenciaProducto;
    }

    public String getReferenciaProductoCliente() {
        return ReferenciaProductoCliente;
    }

    public void setReferenciaProductoCliente(String ReferenciaProductoCliente) {
        this.ReferenciaProductoCliente = ReferenciaProductoCliente;
    }

    public String getDescripcionCliente() {
        return DescripcionCliente;
    }

    public void setDescripcionCliente(String DescripcionCliente) {
        this.DescripcionCliente = DescripcionCliente;
    }

    public double getStockInicial() {
        return StockInicial;
    }

    public void setStockInicial(double StockInicial) {
        this.StockInicial = StockInicial;
    }

    public double getStockActual() {
        return StockActual;
    }

    public void setStockActual(double StockActual) {
        this.StockActual = StockActual;
    }

    public double getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(double PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }
    public double getPrecioProductoVenta() {
        return PrecioProductoVenta;
    }

    public void setPrecioProductoVenta(double PrecioProductoVenta) {
        this.PrecioProductoVenta = PrecioProductoVenta;
    }

    public String getCategoriaProducto() {
        return CategoriaProducto;
    }

    public void setCategoriaProducto(String CategoriaProducto) {
        this.CategoriaProducto = CategoriaProducto;
    }

    public String getUnidadMedidad() {
        return UnidadMedidad;
    }

    public void setUnidadMedidad(String UnidadMedidad) {
        this.UnidadMedidad = UnidadMedidad;
    }

    
}
