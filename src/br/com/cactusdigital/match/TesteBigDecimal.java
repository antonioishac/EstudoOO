package br.com.cactusdigital.match;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TesteBigDecimal {

	public static void main(String[] args) {

		// CEILING - Rounding mode to round towards positive infinity.

		// DOWN - Rounding mode to round towards zero.

		// FLOOR - Rounding mode to round towards negative infinity.

		// HALF_DOWN - Rounding mode to round towards "nearest neighbor" unless
		// both neighbors are equidistant, in which case round down.

		// HALF_EVEN - Rounding mode to round towards the "nearest neighbor"
		// unless both neighbors are equidistant, in which case, round towards
		// the even neighbor.

		// HALF_UP - Rounding mode to round towards "nearest neighbor" unless
		// both neighbors are equidistant, in which case round up.

		// UNNECESSARY - Rounding mode to assert that the requested operation
		// has an exact result, hence no rounding is necessary.

		// UP - Rounding mode to round away from zero.

		DecimalFormat df = new DecimalFormat("#,##0.00");

		BigDecimal num1 = new BigDecimal(0.01);
		BigDecimal num2 = new BigDecimal(0.02);
		BigDecimal resultSoma = num1.add(num2);

		System.out.println("resultado da soma: " + resultSoma);
		System.out.println("resultado da soma: " + df.format(resultSoma));
		System.out.println("resultado da soma com scale: " + resultSoma.setScale(2, RoundingMode.HALF_EVEN));

		System.out.println("---------------------------------------------------------------------------------");

		System.out.println("Subtrai");
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));

		System.out.println("");
		System.out.println("Soma");
		System.out.println(new BigDecimal("2.00").add(new BigDecimal("1.2")));

		System.out.println("");
		System.out.println("Compara");
		System.out.println(new BigDecimal("2.00").compareTo(new BigDecimal("2.00")));

		System.out.println("");
		System.out.println("Divide");
		System.out.println(new BigDecimal("2.00").divide(new BigDecimal("2.00")));

		System.out.println("");
		System.out.println("Máximo");
		System.out.println(new BigDecimal("2.00").max(new BigDecimal("3.5")));

		System.out.println("");
		System.out.println("Mínimo");
		System.out.println(new BigDecimal("2.00").min(new BigDecimal("1.6")));

		System.out.println("");
		System.out.println("Potência");
		System.out.println(new BigDecimal("2.00").pow(2));

		System.out.println("");
		System.out.println("Multiplica");
		System.out.println(new BigDecimal("2.00").multiply(new BigDecimal("1.8")));
	}

}
