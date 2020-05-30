package pe.gob.osce.contratos.soap.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class FechaUtil {

	public static Date obtenerFechaFormatoPersonalizado(String fecha, String formato) {
		try {
			return new SimpleDateFormat(formato).parse(fecha);
		} catch (ParseException e) {
			return null;
		}

	}

	public static String obtenerFechaFormatoSimple(Date fecha, String formato) {
		return new SimpleDateFormat(formato).format(fecha);
	}

	public static Integer ultimoDiaDelMesYAno(int anio, int mes) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(anio, mes - 1, 1);
		return calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	public static Date obtenerFecha(int anio, int mes, int dia) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(anio, mes - 1, dia);

		return calendario.getTime();
	}
}
