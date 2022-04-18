package com.kevyn.aplicacion;

import java.util.ArrayList;
import java.util.List;

import com.kevyn.dao.MascotaDao;
import com.kevyn.dao.PersonaDao;
import com.kevyn.dao.ProductoDao;
import com.kevyn.entidades.Mascota;
import com.kevyn.entidades.Nacimiento;
import com.kevyn.entidades.Persona;
import com.kevyn.entidades.PersonasProductos;
import com.kevyn.entidades.Producto;
import com.kevyn.gui.ConsulProductoGui;
import com.kevyn.gui.ConsultarMascotasGui;
import com.kevyn.gui.ConsultarPersonaGui;
import com.kevyn.gui.ConsultarProductosGui;
import com.kevyn.gui.RegistrarMascotasGui;
import com.kevyn.gui.RegistrarPersonasGui;
import com.kevyn.gui.RegistrarProductosGui;
import com.kevyn.gui.TotalDePersonasRegistradas;
import com.kevyn.gui.VentanaPrincipal;

public class Coordinador {

	private VentanaPrincipal miVentanaPrincipal;
	private RegistrarPersonasGui miRegistrarPersonasGui;
	private RegistrarMascotasGui miRegistrarMascotasGui;
	private RegistrarProductosGui miRegistrarProductosGui;
	private ConsultarPersonaGui miConsultarPersonaGui;
	private ConsultarMascotasGui miConsultarMascotasGui;
	private ConsultarProductosGui miConsultarProductosGui;
	private TotalDePersonasRegistradas miTotalDePersonasRegistradas;
	private PersonaDao miPersonaDao;
	private MascotaDao miMascotaDao;
	private ProductoDao miProductoDao;
	private PersonasProductos miPersonasProductos;
	private ConsulProductoGui miConsulProductoGui;

	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
		
	}

	public void setRegistrarPersonasGui(RegistrarPersonasGui miRegistrarPersonasGui) {
		this.miRegistrarPersonasGui = miRegistrarPersonasGui;
		
	}

	public void setRegistrarMascotaGui(RegistrarMascotasGui miRegistrarMascotasGui) {
		this.miRegistrarMascotasGui=miRegistrarMascotasGui;
	}

	public void setRegistrarProductosGui(RegistrarProductosGui miRegistrarProductosGui) {
		this.miRegistrarProductosGui=miRegistrarProductosGui;
		
	}

	public void setConsultarPersonaGui(ConsultarPersonaGui miConsultarPersonaGui) {
		this.miConsultarPersonaGui=miConsultarPersonaGui;
	}

	public void setConsultarMascotaGui(ConsultarMascotasGui miConsultarMascotasGui) {
		this.miConsultarMascotasGui=miConsultarMascotasGui;
	}

	public void setConsultarProductosGui(ConsultarProductosGui miConsultarProductosGui) {
		this.miConsultarProductosGui=miConsultarProductosGui;
	}

	public void setTotalDePersonasRegistradas(TotalDePersonasRegistradas miTotalDePersonasRegistradas) {
		this.miTotalDePersonasRegistradas=miTotalDePersonasRegistradas;
	}

	public void setPersonaDao(PersonaDao miPersonaDao) {
		this.miPersonaDao=miPersonaDao;
	}

	public void setMascotaDao(MascotaDao miMascotaDao) {
		this.miMascotaDao=miMascotaDao;
	}

	public void setProductoDao(ProductoDao miProductoDao) {
		this.miProductoDao=miProductoDao;
	}

	public void setPersonasProductos(PersonasProductos miPersonasProductos) {
		this.miPersonasProductos=miPersonasProductos;
	}
	
	public void setConsultarProductosGui(ConsulProductoGui miConsulProductoGui) {
		this.miConsulProductoGui=miConsulProductoGui;
	}
	

	public void mostrarVentanaRegistroPersonas() {
		miRegistrarPersonasGui.setVisible(true);
	}

	public void mostrarVentanaRegistroMascotas() {
		miRegistrarMascotasGui.setVisible(true);
		
	}

	public void registrarVentanaRegistrarProductos() {
		miRegistrarProductosGui.setVisible(true);
		
	}

	public void mostrarVentanaConsultaPersona() {
		miConsultarPersonaGui.setVisible(true);
		
	}

	public void mostrarVentanaConsultaMascotas() {
		miConsultarMascotasGui.setVisible(true);
		
	}

	public void mostrarVentanaConsultarProductos() {
		miConsultarProductosGui.setVisible(true);
	}
	
	public void mostrarVentanaConsultProducto() {
		miConsulProductoGui.setVisible(true);
	}

	public void mostrarVentanaTotalDePersonasRegistradas() {
		miTotalDePersonasRegistradas.setVisible(true);
		
	}

	public Persona setConsultarPersona(Long idDocumento) {
		return miPersonaDao.consultarPersona(idDocumento);
	}

	public String registrarPersona(Persona miPersona) {
		return miPersonaDao.registrarPersona(miPersona);
	}

	public String actualizarNacimiento(Persona miPersona) {
		return miPersonaDao.actualizarPersona(miPersona);
	}

	public String actualizarPersona(Persona miPersona) {
		return miPersonaDao.actualizarPersona(miPersona);
	}


	public String eliminarPersona(Persona miPersona) {
		return miPersonaDao.eliminarPersona(miPersona);
	}

	public List<Persona> consultarTodaLaListaDePersonas() {
		return miPersonaDao.consultarListaPersonas();
	}

	public String registrarMascota(Mascota miMascota) {
		return miMascotaDao.registrarMascota(miMascota);
	}

	public Mascota SetConsultarMascota(Long idMascota) {
		return miMascotaDao.consultarMascota(idMascota);
	}

	public String actualizarMascota(Mascota miMascota, Long idMascota) {
		return miMascotaDao.actualizarMascota(miMascota, idMascota);
	}

	public String eliminarMascota(Mascota miMascota ,Long idMascota) {
		return miMascotaDao.eliminarMascota(miMascota,idMascota);
	}

	public String registrarProducto(Producto miProducto) {
		return miProductoDao.registrarProducto(miProducto);
	}

	public List<Producto> consultarTodosProductos() {
		return miProductoDao.ConsultarListaProductos();
	}

	public Producto consultarProducto(Long idProducto) {
		return miProductoDao.consultarProducto(idProducto);
	}

	public String actualizarProducto(Producto miProducto, Long idProducto) {
		return miProductoDao.actualizarProducto(miProducto, idProducto);
	}

	public String eliminarProducto(Producto miProducto, Long idProducto) {
		return miProductoDao.eliminarProducto(miProducto, idProducto);
	}

	public String registrarCompra(PersonasProductos producto) {
		return miProductoDao.registrarCompra(producto);
	}

	

	


	

}
