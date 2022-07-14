package definitions;

import io.cucumber.java.es.*;
import pageobjects.*;

import java.io.IOException;

import static support.util.evidencias;

public class carritoDefinition {
    menuPage menu;
    tarjetaPage tarjeta;
    carritoPage carrito;

    pagoPage pago;
    confirmacionPage confirmacion;

    public carritoDefinition() {
        menu=new menuPage();
        tarjeta=new tarjetaPage();
        carrito=new carritoPage();
        pago=new pagoPage();
        confirmacion=new confirmacionPage();
    }
    @Dado("que la web esta operativa")
    public void queLaWebEstaOperativa() {
        hooks.driver.get("https://demo.guru99.com/payment-gateway/purchasetoy.php");
    }

    @Cuando("se genera el numero de trajeta")
    public void seGeneraElNumeroDeTrajeta() throws IOException {
        menu.clickGenerarTarjeta();
        menu.ventanActiva();
        tarjeta.obtenerNroTarjeta();
        tarjeta.obtenerCVV();
        tarjeta.obtenerFecha();
        evidencias();
        tarjeta.ventanaInicial();
    }

    @Y("selecciona la cantidad {string}")
    public void seleccionaLaCantidad(String cantidad) throws IOException {
        carrito.seleccionarCantidad(cantidad);
        evidencias();


    }

    @Y("realiza la compra del producto")
    public void realizaLaCompraDelProducto() {
        carrito.clickComprar();

    }

    @E("ingresa los datos de la tarjeta")
    public void ingresaLosDatosDeLaTarjeta() throws IOException {
        pago.escribirNroTrajeta(tarjetaPage.nro_tarjeta);
        pago.seleccionarMes(tarjetaPage.mes);
        pago.seleccionarAnio(tarjetaPage.anio);
        pago.escribirNroCvv(tarjetaPage.cvv);
        evidencias();

    }

    @Y("paga el producto")
    public void pagaElProducto() {
        pago.clickPagar();
    }

    @Entonces("validar el mensaje de pago {string}")
    public void validarElMensajeDePago(String mensaje) throws IOException {
        confirmacion.validarMensaje(mensaje);
        evidencias();
        confirmacion.mostrarCodigo();
    }

    @Y("selecciona el mes {string}")
    public void seleccionaElMes(String mes) {
        pago.seleccionarMes(mes);
    }

    @Y("selecciona el año {string}")
    public void seleccionaElAño(String anio) {
        pago.seleccionarAnio(anio);
    }

    @Entonces("validar el mensaje del cuadro de dialogo {string}")
    public void validarElMensajeDelCuadroDeDialogo(String msj) {
        pago.obtenerTextoDialogo(msj);
        pago.aceptarDialogo();
    }

    @Y("selecciona el anio {string}")
    public void seleccionaElAnio(String anio) {
        pago.seleccionarAnio(anio);

    }
}
