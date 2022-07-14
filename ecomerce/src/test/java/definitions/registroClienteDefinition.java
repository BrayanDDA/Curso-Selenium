package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.*;

import java.io.IOException;

import static support.util.evidencias;

public class registroClienteDefinition {
    menuPage menu;
    autenticacionPage auth;
    crearCuentaPage cuenta;

    public registroClienteDefinition() {
        menu=new menuPage();
        auth=new autenticacionPage();
        cuenta=new crearCuentaPage();
    }

    @Given("que la web este disponible")
    public void queLaWebEsteDisponible() throws IOException {
        hooks.driver.get("http://automationpractice.com/index.php");
        evidencias();
    }

    @And("ingresar a la opcion de creacion de cuenta")
    public void ingresarALaOpcionDeCreacionDeCuenta() {
        menu.clickSignin();
    }

    @When("ingresar un correo {string}")
    public void ingresarUnCorreo(String correo) throws IOException {
        auth.ingresarCorreo(correo);
        evidencias();
        auth.clickCrearCuenta();
    }

    @And("seleccionar el género {string}")
    public void seleccionarElGénero(String genero) {
        cuenta.seleccionarGenero(genero);
    }

    @And("ingresar nombre {string}")
    public void ingresarNombre(String nombre) {
        cuenta.escribirNombre(nombre);
    }

    @And("ingresar apellido {string}")
    public void ingresarApellido(String apellido) {
        cuenta.escribirApellido(apellido);
    }

    @And("validar el correo {string}")
    public void validarElCorreo(String correo) {
        cuenta.validarCorreo(correo);
    }

    @And("ingresar clave {string}")
    public void ingresarClave(String clave) {
        cuenta.escribirClave(clave);
    }

    @And("ingresar fecha de nacimiento {string}")
    public void ingresarFechaDeNacimiento(String valor) {
        String[] fecha=valor.split("/");
        cuenta.SeleccionarDia(fecha[0]);
        cuenta.SeleccionarMes(fecha[1]);
        cuenta.SeleccionarAnio(fecha[2]);
    }

    @And("{string} permitir envío de newsletter")
    public void permitirEnvíoDeNewsletter(String opcion) {
        cuenta.permitirNewsletter(opcion);
    }

    @And("{string} permitir recesive")
    public void permitirRecesive(String opcion) {
        cuenta.permitirRecivo(opcion);
    }

    @And("escribir empresa {string}")
    public void escribirEmpresa(String empresa) {
        cuenta.escribirEmpresa(empresa);
    }

    @And("escribir primera direccion {string}")
    public void escribirPrimeraDireccion(String direccion) {
        cuenta.escribirDireccion1(direccion);
    }

    @And("escribir segunda direccion {string}")
    public void escribirSegundaDireccion(String direccion) {
        cuenta.escribirDireccion2(direccion);
    }

    @And("escribir ciudad {string}")
    public void escribirCiudad(String ciudad) {
        cuenta.escribirCiudad(ciudad);
    }

    @And("seleccionar estado {string}")
    public void seleccionarEstado(String estado) {
        cuenta.seleccionarEstado(estado);
    }

    @And("escribir codigo postal {string}")
    public void escribirCodigoPostal(String codigo) {
        cuenta.escribirPostal(codigo);
    }

    @And("seleccionar pais {string}")
    public void seleccionarPais(String pais) {
        cuenta.seleccionarPais(pais);
    }

    @And("escribir info {string}")
    public void escribirInfo(String info) {
        cuenta.escribirInformacion(info);
    }

    @And("escribir telefono {string}")
    public void escribirTelefono(String telef) {
        cuenta.escribirTelefono(telef);
    }

    @And("escribir celular {string}")
    public void escribirCelular(String cel) {
        cuenta.escribirCelular(cel);
    }

    @And("escribir alias {string}")
    public void escribirAlias(String alias) throws IOException {
        cuenta.escribirAlias(alias);
        evidencias();

    }

    @And("guardar registro")
    public void guardarRegistro() {
        cuenta.clickRegistrar();
    }
}
