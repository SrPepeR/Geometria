package dad.bindings.model;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		MuebleFX mecedora = new MuebleFX();
		mecedora.setFabricante("CONFORAMA");
		mecedora.setModelo("MECEDORA200");
		mecedora.setTipo(TipoMueble.SILLA);
		mecedora.setFechaFabricacion(LocalDate.of(1990, 8, 15));
		
		System.out.println(mecedora.getFabricante());
		System.out.println(mecedora.getAntiguedad());

	}

}
