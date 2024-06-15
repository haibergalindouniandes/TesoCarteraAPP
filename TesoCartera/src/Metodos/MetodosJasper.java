/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class MetodosJasper {

    Conexion Con = new Conexion();
    Connection Conectar = Con.Conexion();
    JasperReport Jr = null;
    JasperPrint Jp = null;
    JasperViewer Jv = null;
    
     public void CrearReporte(String Patch,String ParametroJasper,String Parametro) {

//        String RutaReporte = "C:\\TesoCartera\\src\\Reportes\\ReportesClientes.jasper";

        try {

            Map parametro = new HashMap();
            parametro.put(ParametroJasper, Parametro);
//            Jr = JasperCompileManager.compileReport(RutaReporte);
//            Jp = JasperFillManager.fillReport(Jr, parametro, Conectar);
//            Jv = new JasperViewer(Jp);
//            Jv.setVisible(true);
//            Jv.setTitle("Reporte Cliente");
            Jr = (JasperReport) JRLoader.loadObjectFromFile(Patch);
            Jp = JasperFillManager.fillReport(Jr, parametro, Conectar);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Error En Ejecucion De Jasper: " + e);
        }

    }

    public void VisualizarReporte() {

        Jv = new JasperViewer(Jp,false);
        Jv.setVisible(true);
        Jv.setTitle("Reporte Cliente");
//        Jv.
    }
}
