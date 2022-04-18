package com.kevyn.aplicacion;

import com.kevyn.dao.MascotaDao;
import com.kevyn.dao.PersonaDao;
import com.kevyn.dao.ProductoDao;
import com.kevyn.entidades.PersonasProductos;
import com.kevyn.gui.ConsulProductoGui;
import com.kevyn.gui.ConsultarMascotasGui;
import com.kevyn.gui.ConsultarPersonaGui;
import com.kevyn.gui.ConsultarProductosGui;
import com.kevyn.gui.RegistrarMascotasGui;
import com.kevyn.gui.RegistrarPersonasGui;
import com.kevyn.gui.RegistrarProductosGui;
import com.kevyn.gui.TotalDePersonasRegistradas;
import com.kevyn.gui.VentanaPrincipal;

public class Relaciones {

	VentanaPrincipal miVentanaPrincipal;
	
	public Relaciones() {
		
		Coordinador miCoordinador;
		RegistrarPersonasGui miRegistrarPersonasGui;
		RegistrarMascotasGui miRegistrarMascotasGui;
		RegistrarProductosGui miRegistrarProductosGui;
		
		ConsultarPersonaGui miConsultarPersonaGui;
		ConsultarMascotasGui miConsultarMascotasGui;
		ConsultarProductosGui miConsultarProductosGui;
		ConsulProductoGui miConsulProductoGui;
		
		TotalDePersonasRegistradas miTotalDePersonasRegistradas;
		
		PersonaDao miPersonaDao;
		MascotaDao miMascotaDao;
		ProductoDao miProductoDao;
		
		// se instancia por unica ocasion las clases declaradas 
		
		miVentanaPrincipal = new VentanaPrincipal();
		miCoordinador = new Coordinador();
		miRegistrarPersonasGui = new RegistrarPersonasGui(miVentanaPrincipal, true);
		miRegistrarMascotasGui = new RegistrarMascotasGui(miVentanaPrincipal, true, "");
		miRegistrarProductosGui = new RegistrarProductosGui(miVentanaPrincipal, true);
		
		miConsultarPersonaGui = new ConsultarPersonaGui();
		miConsultarMascotasGui = new ConsultarMascotasGui();
		miConsultarProductosGui = new ConsultarProductosGui();
		miConsulProductoGui = new ConsulProductoGui();
		
		miTotalDePersonasRegistradas = new TotalDePersonasRegistradas();
		
		miPersonaDao = new PersonaDao();
		miMascotaDao = new MascotaDao();
		miProductoDao = new ProductoDao();
		
		//Se establece la relación entre el coordinador y cada instancia unica
		//Al coordinador se le asigna el control de cada clase unica
		
		miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setRegistrarPersonasGui(miRegistrarPersonasGui);
		miCoordinador.setRegistrarMascotaGui(miRegistrarMascotasGui);
		miCoordinador.setRegistrarProductosGui(miRegistrarProductosGui);
		
		miCoordinador.setConsultarPersonaGui(miConsultarPersonaGui);
		miCoordinador.setConsultarMascotaGui(miConsultarMascotasGui);
		miCoordinador.setConsultarProductosGui(miConsultarProductosGui);
		miCoordinador.setConsultarProductosGui(miConsulProductoGui);
		
		miCoordinador.setTotalDePersonasRegistradas(miTotalDePersonasRegistradas);
		
		miCoordinador.setPersonaDao(miPersonaDao);
		miCoordinador.setMascotaDao(miMascotaDao);
		miCoordinador.setProductoDao(miProductoDao);
		
		
		//A cada clase unica se le asigna la unica instancia del coordinador
		
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miRegistrarPersonasGui.setCoordinador(miCoordinador);
		miRegistrarMascotasGui.setCoordinador(miCoordinador);
		miRegistrarProductosGui.setCoordinador(miCoordinador);
		miConsultarPersonaGui.setCoordinador(miCoordinador);
		miConsultarMascotasGui.setCoordinador(miCoordinador);
		miConsultarProductosGui.setCoordinador(miCoordinador);
		miConsulProductoGui.setCoordinador(miCoordinador);
		miTotalDePersonasRegistradas.setCoordinador(miCoordinador);
		miPersonaDao.setCoordinador(miCoordinador);
		miMascotaDao.setCoordinador(miCoordinador);
		miProductoDao.setCoordinador(miCoordinador);
	}
	
	public void iniciar() {
		miVentanaPrincipal.setVisible(true);
	}

}
