/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import static Frames.F_Escritorio.Escritorio;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import static java.lang.System.in;
import static java.lang.System.out;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zlaifer
 */
public class MetodosGenerales {

    Conexion Con = new Conexion();
    Connection Conectar = Con.Conexion();
    Statement Sent;
    ResultSet Rs;
    ResultSetMetaData RsMd;
    Runtime Rt = Runtime.getRuntime();
    int ColumnasSql;
    PreparedStatement Ps;
    SimpleDateFormat Formateador_F = new SimpleDateFormat("yyyy-MM-dd");
    String origen;
    int Consecutivo;
    public static int BanderaGrabarDetalle=0;

    public void Listar(String SentenciaSql, JTable Tabla) {

        DefaultTableModel ModeloTable = new DefaultTableModel();
        Tabla.setModel(ModeloTable);
        try {
            Sent = (Statement) Conectar.createStatement();

            Rs = Sent.executeQuery(SentenciaSql);
            RsMd = Rs.getMetaData();

            ColumnasSql = RsMd.getColumnCount();

            for (int i = 1; i <= ColumnasSql; i++) {

                ModeloTable.addColumn(RsMd.getColumnLabel(i));
            }

            while (Rs.next()) {

                Object Fila[] = new Object[ColumnasSql];
                for (int i = 0; i < ColumnasSql; i++) {

                    Fila[i] = Rs.getObject(i + 1);
                }

                ModeloTable.addRow(Fila);
            }
            for (int aux = 0; aux < ColumnasSql; aux++) {

                Tabla.getColumnModel().getColumn(aux).setPreferredWidth(150);
            }

            Rs.close();
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }

    public void ListarDetalle(String SentenciaSql, JTable Tabla) {

        DefaultTableModel ModeloTable = new DefaultTableModel();
        Tabla.setModel(ModeloTable);
        try {
            Sent = (Statement) Conectar.createStatement();

            Rs = Sent.executeQuery(SentenciaSql);
            RsMd = Rs.getMetaData();

            ColumnasSql = RsMd.getColumnCount();

            for (int i = 1; i <= ColumnasSql; i++) {

                ModeloTable.addColumn(RsMd.getColumnLabel(i));
            }

            while (Rs.next()) {

                Object Fila[] = new Object[ColumnasSql];
                for (int i = 0; i < ColumnasSql; i++) {

                    Fila[i] = Rs.getObject(i + 1);
                }

                ModeloTable.addRow(Fila);
            }
            for (int aux = 0; aux < ColumnasSql; aux++) {

                Tabla.getColumnModel().getColumn(aux).setPreferredWidth(150);
            }

            Rs.close();
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }
//----------------------------------------------------------------

    public void Grabar(String TablaSql, String DatosSql) {

        int i = JOptionPane.showConfirmDialog(null, "¿Desea Grabar Los Datos?", "Grabar", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            String SentenciaSql;
            BanderaGrabarDetalle=1;
            try {
                Sent = (Statement) Conectar.createStatement();

                SentenciaSql = "insert into " + TablaSql + " values (" + DatosSql + ")";

                Sent.execute(SentenciaSql);
                Sent.close();

                JOptionPane.showMessageDialog(null, "Se Grabaron Los Datos Correctamente ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Al Grabar Datos: " + e, "Error", JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(null, e);
            }
        }else{
            
            BanderaGrabarDetalle=0;
            JOptionPane.showMessageDialog(null, "Se Cancelo La Grabacion De Datos ", "Cancelacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void GrabarHidden(String TablaSql, String DatosSql) {

        String SentenciaSql;

        try {
            Sent = (Statement) Conectar.createStatement();

            SentenciaSql = "insert into " + TablaSql + " values (" + DatosSql + ")";

            Sent.execute(SentenciaSql);
            Sent.close();

            System.out.println("Se Grabaron Los Datos Correctamente ");
        } catch (Exception e) {
            System.out.println("Error Al Grabar Datos: " + e);
        }
    }

//---------------------------------------------------------------------------
    public void Modificar(String TablaSql, String CamposSql) {

        int i = JOptionPane.showConfirmDialog(null, "¿Desea Modificar Los Datos?", "Modificar", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            String SentenciaSql;

            try {
                Sent = (Statement) Conectar.createStatement();

                SentenciaSql = "update " + TablaSql + " set " + CamposSql;

                Sent.executeUpdate(SentenciaSql);
                Sent.close();

                JOptionPane.showMessageDialog(null, "Se Modificaron Los Datos Correctamente ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Error Al Modificar Datos: " + e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void ModificarHidden(String TablaSql, String CamposSql) {

        String SentenciaSql;

        try {
            Sent = (Statement) Conectar.createStatement();

            SentenciaSql = "update " + TablaSql + " set " + CamposSql;

            Sent.executeUpdate(SentenciaSql);
            Sent.close();

            System.out.println("Se Modificaron Los Datos Correctamente ");
        } catch (Exception e) {

            System.out.println("Error Al Modificar Datos: " + e);

        }
    }
//-------------------------------------------------------------------------

    public void Eliminar(String TablaSql, String IdSql) {

        int i = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar Los Datos?", "Eliminar", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            String SentenciaSql = null;

            try {
                Sent = (Statement) Conectar.createStatement();

                SentenciaSql = "delete from " + TablaSql + " where " + IdSql;

                Sent.executeUpdate(SentenciaSql);
                Sent.close();

                JOptionPane.showMessageDialog(null, "Se Eliminaron Los Datos Correctamente ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {

                System.out.println("Sql: " + SentenciaSql);
                JOptionPane.showMessageDialog(null, "Error Al Eliminar Datos: " + e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
//---------------------------------------------------------------------------

    public void AdicionarFila(JTable Tabla, Object object[]) {
        //DefaultTableModel ModeloTable = new DefaultTableModel();
        //Tabla.setModel(ModeloTable);

        DefaultTableModel ModeloTable = (DefaultTableModel) Tabla.getModel();
//        Object nuevo[] = {ModeloTable.getRowCount() + 1, "", ""};
        ModeloTable.addRow(object);
    }

    public void ModificarFila(JTable Tabla, int Fila, int Columna, Object object) {
        //DefaultTableModel ModeloTable = new DefaultTableModel();
        //Tabla.setModel(ModeloTable);

        DefaultTableModel ModeloTable = (DefaultTableModel) Tabla.getModel();
//        Object nuevo[] = {ModeloTable.getRowCount() + 1, "", ""};

        ModeloTable.setValueAt(object, Fila, Columna);
    }

    public void EliminarFila(JTable Tabla, int Fila) {
        //DefaultTableModel ModeloTable = new DefaultTableModel();
        //Tabla.setModel(ModeloTable);

        DefaultTableModel ModeloTable = (DefaultTableModel) Tabla.getModel();
//        Object nuevo[] = {ModeloTable.getRowCount() + 1, "", ""};
        ModeloTable.removeRow(Fila);
    }

//---------------------------------------------------------------------------
    public void ExportarTabla(JTable Tabla, String NomArchivo) {

        int filas = Tabla.getRowCount();

        try {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos De Excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<JTable>();
                List<String> nom = new ArrayList<String>();
                tb.add(Tabla);
                nom.add(NomArchivo);
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {

                    ExportarExcel e = new ExportarExcel(tb, new File(file));
                    if (e.export()) {

                        JOptionPane.showMessageDialog(null, "Los Datos Fueron Exportados", "Mensaje de Informacion", JOptionPane.INFORMATION_MESSAGE);

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Hubo un error " + e.getMessage(), " Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }

    }
//---------------------------------------------------------------------------

    public void GenerarBackupMySQL(JTextField field,String PasswordMysql, String UsuarioMysql, String BaseDatos, String RutaBackup, String Extension) {

        if (!field.getText() .equals("") ) {
        try {
            Runtime runtime = Runtime.getRuntime();
            File BackupFile = new File(RutaBackup + Extension);
            FileWriter fw = new FileWriter(BackupFile);
            Process child = runtime.exec("C:\\xampp\\mysql\\bin\\mysqldump --opt --password=" + PasswordMysql + " --user=" + UsuarioMysql + " --databases " + BaseDatos);
            InputStreamReader irs = new InputStreamReader(child.getInputStream());
            BufferedReader br = new BufferedReader(irs);
            String line;
            while ((line = br.readLine()) != null) {
                fw.write(line + "\n");
            }
            fw.close();
            irs.close();
            br.close();
            JOptionPane.showMessageDialog(null, "\tCopia De Seguridad Generada Con Exito", "Copia De Seguridad", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error no se genero el archivo por el siguiente motivo:" + e.getMessage(), "Verificar", JOptionPane.ERROR_MESSAGE);
        }
        } else {
            JOptionPane.showMessageDialog(null, "El Campo Ruta No Puede Estar Vacio","Verificar",JOptionPane.ERROR_MESSAGE);
        }
        field.setText("");
    }

    public void ActualizarBackupMySQL(JTextField field,String host,String puerto,String usuario,String pass,String Basedatos) {

        String BaseDatos = "tesocartera";
        String SentenciaSql;
        if (!field.getText() .equals("") ) {

            try {

                Sent = (Statement) Conectar.createStatement();
                SentenciaSql = "drop database if exists " + BaseDatos;
                Sent.executeUpdate(SentenciaSql);

                Sent = (Statement) Conectar.createStatement();
                SentenciaSql = "create database if not exists " + BaseDatos;
                Sent.executeUpdate(SentenciaSql);
                
//                String comando = "C:\\xampp\\mysql\\bin\\mysql.exe --host=localhost --port=3306 --user=root --password= < D:\\copia.sql";
                String comando = "C:\\xampp\\mysql\\bin\\mysql.exe --host="+host+" --port="+puerto+" --user="+usuario+" --password="+pass+" "+BaseDatos+"< "+field.getText()+
                        "\nexit";
                File f = new File("restore.bat");
                FileOutputStream fos = new FileOutputStream(f);
                fos.write(comando.getBytes());
                fos.close();
                Process run = Runtime.getRuntime().exec("cmd /C start /I /MIN /WAIT restore.bat");
//                Process run1 = Runtime.getRuntime().exec("cmd /C exit");
                
                
                JOptionPane.showMessageDialog(null, "\tCopia Restaurada Con Exito", "Restauracion", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error no se genero el archivo por el siguiente motivo:" + e.getMessage(), "Verificar", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El Campo Ruta No Puede Estar Vacio","Verificar",JOptionPane.ERROR_MESSAGE);
        }
        field.setText("");
    }
    //---------------------------------------------------------------------------

    public void ReporteJasper(String RutaReporte) {

//        JasperReport ReporteJasper= JasperCompileManeger.compileReport(RutaReporte);
    }
//---------------------------------------------------------------------------    

    public void JComboBox(JComboBox Combo, JTextField TextField) {

        String Aux = (String) Combo.getSelectedItem();

        TextField.setText(Aux);
    }
//----------------------------------------------------------------------------    

    public void LimpiarJText(JTextField TextField) {

        TextField.setText("");
    }
//----------------------------------------------------------------------------    

    public void LimpiarJDate(JDateChooser Jdate) {

        Jdate.setDate(null);
    }
//----------------------------------------------------------------------------

    public void HabilitarJText(JTextField Jtext) {
        Jtext.setEnabled(true);
    }
//----------------------------------------------------------------------------

    public void HabilitarJDate(JDateChooser JDate) {
        JDate.setEnabled(true);
    }
//----------------------------------------------------------------------------    

    public void HabilitarJCombo(JComboBox JCombo) {
        JCombo.setEnabled(true);
    }
//----------------------------------------------------------------------------

    public void HabilitarJBtn(JButton JBn) {
        JBn.setEnabled(true);
    }
//----------------------------------------------------------------------------

    public void DesHabilitarJText(JTextField Jtext) {
        Jtext.setEnabled(false);
    }
//----------------------------------------------------------------------------

    public void DesHabilitarJDate(JDateChooser JDate) {
        JDate.setEnabled(false);
    }
//----------------------------------------------------------------------------

    public void DesHabilitarJCombo(JComboBox JCombo) {
        JCombo.setEnabled(false);
    }
//----------------------------------------------------------------------------    

    public void DesHabilitarJBtn(JButton JBtn) {
        JBtn.setEnabled(false);
    }
//----------------------------------------------------------------------------    

    public String ConvertirFechaString(JDateChooser JDate) {
        String FechaI = Formateador_F.format(JDate.getDate());

        return FechaI;
    }
//----------------------------------------------------------------------------    

    public void ObtenerDatoTabla(JTable Tabla, int Fila, JTextField Jtext, int Columna) {

        try {
            String valor = Tabla.getValueAt(Fila, Columna).toString();

            //System.out.println("el dato es: " + valor);
            if (!valor.equals("")) {
                Jtext.setText(valor);
            } else {
                Jtext.setText("");
            }
        } catch (Exception e) {
        }

    }
//----------------------------------------------------------------------------    

    public void ObtenerConsecutivo(String TablaSql, String Id, JTextField JText) {

        String SentenciaSql = null;
        int AuxConsecutivo = 0;
        try {
            Sent = (Statement) Conectar.createStatement();

            SentenciaSql = "select * from " + TablaSql;

            Rs = Sent.executeQuery(SentenciaSql);

            while (Rs.next()) {

                AuxConsecutivo = Rs.getInt(Id);

            }
            if (AuxConsecutivo == 0) {
                Consecutivo = AuxConsecutivo + 1;
                System.out.println("no hay valores para el id");
            } else {
                Consecutivo = AuxConsecutivo + 1;
            }

            JText.setText(String.valueOf(Consecutivo));
//                Sent.close();
            System.out.println("Se esta llendo por este metodo consecutivo");
        } catch (Exception e) {

            System.out.println("Error en el metodo consecutivo");
        }
    }

    public void ObtenerConsecutivoModificado(String TablaSql, String Id, JLabel JText) {

        String SentenciaSql = null;
        int AuxConsecutivo = 0;
        try {
            Sent = (Statement) Conectar.createStatement();

            SentenciaSql = "select " + Id + " from " + TablaSql + " order by " + Id + " desc limit 1";

            Rs = Sent.executeQuery(SentenciaSql);

            while (Rs.next()) {

                AuxConsecutivo = Rs.getInt(Id);

            }
            if (AuxConsecutivo == 0) {
                Consecutivo = AuxConsecutivo + 1;
                System.out.println("no hay valores para el id");
            } else {
                Consecutivo = AuxConsecutivo + 1;
            }

            JText.setText(String.valueOf(Consecutivo));
            Sent.close();
            System.out.println("Se esta llendo por este metodo consecutivo");
        } catch (Exception e) {

            System.out.println("Error en el metodo consecutivo");
        }
    }
//----------------------------------------------------------------------------    

    public void ObtenerFechaTabla(JTable Tabla, int Fila, JDateChooser JDate, int Columna) {

        String Fecha = (Tabla.getValueAt(Fila, Columna).toString());
        Date FechaSql = Date.valueOf(Fecha);
        JDate.setDate(FechaSql);

    }
//----------------------------------------------------------------------------    

    public void CentrarListFrame(JInternalFrame InternalFrame) {

        int x = (Escritorio.getWidth() / 2) - InternalFrame.getWidth() / 2;
        int y = (Escritorio.getHeight() / 2) - InternalFrame.getHeight() / 2;
        if (InternalFrame.isShowing()) {
            InternalFrame.setLocation(x, y);

        } else {
            Escritorio.add(InternalFrame);
            InternalFrame.setLocation(x, 100);
            InternalFrame.show();
        }
    }
//----------------------------------------------------------------------------        
//
//    public void ObtenerEdad(JDateChooser JDChooser, JTextField JtextF) {
//
//        java.util.Date FechaNacimiento = JDChooser.getDate();
//
//        Calendar fechaNacimiento = Calendar.getInstance();
//        //Se crea un objeto con la fecha actual
//        Calendar fechaActual = Calendar.getInstance();
//        //Se asigna la fecha recibida a la fecha de nacimiento.
//        fechaNacimiento.setTime(FechaNacimiento);
//        //Se restan la fecha actual y la fecha de nacimiento
//        int año = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
//        int mes = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
//        int dia = fechaActual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);
//        //Se ajusta el año dependiendo el mes y el día
//        if (mes < 0 || (mes == 0 && dia < 0)) {
//            año--;
//        }
//        //Regresa la edad en base a la fecha de nacimiento
//        JtextF.setText(String.valueOf(año));
//
//    }
//---------------------------------------------------------------------------- 

    public void cargar_consecutivo(String IDTablaSql, String TablaSql, JLabel LabelConsec) {
        //texconsecutivo.setEnabled(false);
        int consec = 0;
        String consecutivo;
        String sql = "select " + IDTablaSql + " from " + TablaSql + "";

        try {

            Statement st = (Statement) Conectar.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                consec = rs.getInt(IDTablaSql) + 1;

                consecutivo = String.valueOf(consec);
                LabelConsec.setText(consecutivo);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void CargarLIstaComboBox(String ConsultaSql, String Id, String Nombre, String Delimitador, JComboBox Combo) {

        //String sql = "select " + IDTablaSql + " from " + TablaSql + "";
        Combo.removeAllItems();
//        Combo.addItem("No hay ninguna");
        try {

            Statement st = (Statement) Conectar.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSql);

            while (rs.next()) {

                String Aux1 = rs.getString(Id);
                String Aux2 = rs.getString(Nombre);
                String Aux3 = Aux1 + Delimitador + Aux2;

                Combo.addItem(Aux3);
//                    Combo.addItem("No hay ninguna");
//                    System.out.println("hay algun valor nulo del combo");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void CargarComboBox(String ConsultaSql, String Id, JComboBox Combo) {

        Combo.removeAllItems();

        try {

            Statement st = (Statement) Conectar.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSql);

            Combo.addItem("");
            while (rs.next()) {

                String Aux1 = rs.getString(Id);

                Combo.addItem(Aux1);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ObtenerPrecio(String ConsultaSql, String CampoPrecio, JTextField jTextField) {
        try {

            Statement st = (Statement) Conectar.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSql);

            while (rs.next()) {

                String Aux1 = rs.getString(CampoPrecio);

                jTextField.setText(Aux1);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ObtenerDatosProducto(String ConsultaSql, String Descripcion, String Umedidad, String Precio, JTextField jTextDescripcion, JTextField jTextUmedida, JTextField jTextPrecio) {
        try {

            Statement st = (Statement) Conectar.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSql);

            while (rs.next()) {

                String Aux1 = rs.getString(Descripcion);
                String Aux2 = rs.getString(Umedidad);
                String Aux3 = rs.getString(Precio);

                jTextDescripcion.setText(Aux1);
                jTextUmedida.setText(Aux2);
                jTextPrecio.setText(Aux3);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
