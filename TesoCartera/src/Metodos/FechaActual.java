/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author zlaifer
 */
public class FechaActual {

    public static String fecha() {

        Date fecha_act = new Date();
        SimpleDateFormat form_fecha = new SimpleDateFormat("YYYY-MM-dd");

        return form_fecha.format(fecha_act);

    }

    public static String ano() {
      

          Date ano=new Date();
          SimpleDateFormat form_fecha=new SimpleDateFormat("YYYY");
      

          return form_fecha.format(ano);
      
    }

    public static String mes() {

        Date mes = new Date();
        SimpleDateFormat form_fecha = new SimpleDateFormat("MM");

        return form_fecha.format(mes);

    }

}
