Feature: Funcionalidad de creación de cuenta del cliente

  @smoke
  Scenario: Creación de cuenta éxitosa
    Given que la web este disponible
    And ingresar a la opcion de creacion de cuenta
    When ingresar un correo "ahgas123e34fd@mail.com"
    And seleccionar el género "señor"
    And ingresar nombre "Alexander"
    And ingresar apellido "Avila"
    And validar el correo "ahgas123e34fd@mail.com"
    And ingresar clave "123123123"
    And ingresar fecha de nacimiento "5/4/1995"
    And "si" permitir envío de newsletter
    And "no" permitir recesive
    And escribir empresa "mi empresa"
    And escribir primera direccion "mi casa 697"
    And escribir segunda direccion "mi segunda casa 697"
    And escribir ciudad "Lima"
    And seleccionar estado "Arizona"
    And escribir codigo postal "00000"
    And seleccionar pais "United States"
    And escribir info "Registro de mi ciudad"
    And escribir telefono "55555555"
    And escribir celular "654987321"
    And escribir alias "mi cuenta"
    And guardar registro

@tabla
  Scenario Outline: Creación de cuenta éxitosa con varios registros
    Given que la web este disponible
    And ingresar a la opcion de creacion de cuenta
    When ingresar un correo "<correo>"
    And seleccionar el género "<genero>"
    And ingresar nombre "<nombre>"
    And ingresar apellido "<apellido>"
    And validar el correo "<correo>"
    And ingresar clave "<clave>"
    And ingresar fecha de nacimiento "<fecha_nacimiento>"
    And "<newsletter>" permitir envío de newsletter
    And "<receive>" permitir recesive
    And escribir empresa "<empresa>"
    And escribir primera direccion "<direccion1>"
    And escribir segunda direccion "<direccion2>"
    And escribir ciudad "<ciudad>"
    And seleccionar estado "<estado>"
    And escribir codigo postal "<codigo_postal>"
    And seleccionar pais "<pais>"
    And escribir info "<info>"
    And escribir telefono "<telefono>"
    And escribir celular "<celular>"
    And escribir alias "<alias>"
    And guardar registro

    Examples:
      | correo          | genero | nombre | apellido | correo          | clave    | fecha_nacimiento | newsletter | receive | empresa | direccion1 | direccion2 | ciudad | estado | codigo_postal | pais | info | telefono | celular | alias |
      | ewasdq@mail.com | señor  | aldo   | asd      | ewasdq@mail.com | qwerasd  | 5/4/1995         | si         | no      | qwer    | qwer       | qwer       | qwer   | wqer   | 12345         | wqer | wqer | qwer     | qwer    | qwer  |
      | ewasdq@mail.com | señor  | aldo   | asd      | ewasdq@mail.com | qwerasd  | 5/4/1995         | si         | no      | qwer    | qwer       | qwer       | qwer   | wqer   | 12345         | wqer | wqer | qwer     | qwer    | qwer  |
      | ewasdq@mail.com | señor  | aldo   | asd      | ewasdq@mail.com | qwerasd  | 5/4/1995         | si         | no      | qwer    | qwer       | qwer       | qwer   | wqer   | 12345         | wqer | wqer | qwer     | qwer    | qwer  |
      | ewasdq@mail.com | señor  | aldo   | asd      | ewasdq@mail.com | qwerasd  | 5/4/1995         | si         | no      | qwer    | qwer       | qwer       | qwer   | wqer   | 12345         | wqer | wqer | qwer     | qwer    | qwer  |
      | ewasdq@mail.com | señor  | aldo   | asd      | ewasdq@mail.com | qwerasd  | 5/4/1995         | si         | no      | qwer    | qwer       | qwer       | qwer   | wqer   | 12345         | wqer | wqer | qwer     | qwer    | qwer  |
      | ewasdq@mail.com | señor  | aldo   | asd      | ewasdq@mail.com | qwerasd  | 5/4/1995         | si         | no      | qwer    | qwer       | qwer       | qwer   | wqer   | 12345         | wqer | wqer | qwer     | qwer    | qwer  |
      | ewasdq@mail.com | señor  | aldo   | asd      | ewasdq@mail.com | qwerasd  | 5/4/1995         | si         | no      | qwer    | qwer       | qwer       | qwer   | wqer   | 12345         | wqer | wqer | qwer     | qwer    | qwer  |
      | ewasdq@mail.com | señor  | aldo   | asd      | ewasdq@mail.com | qwerasd  | 5/4/1995         | si         | no      | qwer    | qwer       | qwer       | qwer   | wqer   | 12345         | wqer | wqer | qwer     | qwer    | qwer  |






