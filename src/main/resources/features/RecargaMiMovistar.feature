Feature: Mi Movistar Flujo de Recargas


#  REALIZAR RECARGA EXITOSA SIN GUARDAR TARJETA VALIDA (USUARIO NO TIENE TARJETAS GUARDADAS)
  @RecargaMiMovistar @Test-1
  Scenario Outline: Recarga Mi movistar
    Given se genera la URL mediante el API_TEST_recargas
    Given se ingresa en la URL el token generado "<caso_prueba>"
    And se ingresa el numero celular "<caso_prueba>"
    And monto a recargar "<caso_prueba>"
    And se da click en el boton Continuar
    When se ingresa el email "<caso_prueba>" y se da click en continuar
    And se ingresa el numero de tarjeta "<caso_prueba>"
    And se ingresa el mes de vencimiento "<caso_prueba>"
    And se ingresa el anio de vencimiento "<caso_prueba>"
    And se ingresa el codigo de verificacion "<caso_prueba>"
    And se da click en el boton Pagar
    Then se verifica que se hizo la recarga correcta.

    Examples:
      | caso_prueba |
      |           2 |

#REALIZAR RECARGA EXITOSA CON GUARDAR TARJETA VALIDA (USUARIO NO TIENE TARJETAS GUARDADAS)

  @RecargaMiMovistarGuardarTarjeta @Test-2
  Scenario Outline: Recargas en Mi Movistar Guardar Tarjeta
    Given se genera la URL mediante el API_TEST_recargas
    Given se ingresa en la URL el token generado "<caso_prueba>"
    And se ingresa el numero celular "<caso_prueba>"
    And monto a recargar "<caso_prueba>"
    And se da click en el boton Continuar
    When se ingresa el email "<caso_prueba>" y se da click en continuar
    And se ingresa el numero de tarjeta "<caso_prueba>"
    And se ingresa el mes de vencimiento "<caso_prueba>"
    And se ingresa el anio de vencimiento "<caso_prueba>"
    And se ingresa el codigo de verificacion "<caso_prueba>"
    And se selecciona la opción guardar tarjeta
    And se da click en el boton Pagar
    Then se verifica que se hizo la recarga correcta.

    Examples:
      | caso_prueba |
      |           1 |


#  REALIZAR RECARGA EXITOSA CON TARJETA GUARDADA (USUARIO TIENE 3 TARJETAS GUARDADAS)
  @RecargaMiMovistarTarjetaGuardada @Test-3
  Scenario Outline: Recarga Mi movistar tarjeta Guardada
    Given se genera la URL mediante el API_TEST_recargas
    Given se ingresa en la URL el token generado "<caso_prueba>"
    And se ingresa el numero celular "<caso_prueba>"
    And monto a recargar "<caso_prueba>"
    And se da click en el boton Continuar
    When se ingresa el email "<caso_prueba>"
    And se selecciona una tarjeta y se da click en el boton Pagar
    Then se verifica que se hizo la recarga exitosa
    Examples:
      | caso_prueba |
      |           1 |

#REALIZAR RECARGA EXITOSA CON GUARDAR TARJETA YA GUARDADA (USUARIO TIENE 1 TARJETA GUARDADA)
  @RecargaMiMovistarOtraTarjetayGuardadaTarjeta @Test-4
  Scenario Outline: Recarga Mi movistar tarjeta Guardada
    Given se genera la URL mediante el API_TEST_recargas
    Given se ingresa en la URL el token generado "<caso_prueba>"
    And se ingresa el numero celular "<caso_prueba>"
    And monto a recargar "<caso_prueba>"
    And se da click en el boton Continuar
    When se ingresa el email "<caso_prueba>"
    And se selecciona el boton pagar otra tarjeta
    And se ingresa datos de tarjeta "<caso_prueba>"
    And se selecciona la opción guardar tarjeta
    And se da click en el boton Pagar
    Then se verifica que se hizo la recarga correcta.
    Examples:
      | caso_prueba |
      |           1 |

#ELIMINAR TARJETA Y REALIZAR RECARGA EXITOSA CON GUARDAR TARJETA ELIMINADA
  @RecargaEliminarTarjetaYGuardar @Test-5
  Scenario Outline: Recarga Exitosa Eliminar Tarjeta y guardar tarjeta eliminada
    Given se genera la URL mediante el API_TEST_recargas
    Given se ingresa en la URL el token generado "<caso_prueba>"
    And se ingresa el numero celular "<caso_prueba>"
    And monto a recargar "<caso_prueba>"
    And se da click en el boton Continuar
    When se ingresa el email "<caso_prueba>"
    And se selecciona boton eliminar tarjeta
    And se ingresa datos de tarjeta "<caso_prueba>"
    And se selecciona la opción guardar tarjeta
    And se da click en el boton Pagar
    Then se verifica que se hizo la recarga correcta.
    Examples:
      | caso_prueba |
      |           1 |




#En observacion
  @Test-6
  Scenario Outline: Recargas en Mi Movistar WEB PUBLICA (Generando automáticamente Token 2 URL)
    Given se genera la URL mediante el API_TEST_recargasVersion2
    Given se ingresa en la URL el token generado "<caso_prueba>"
    When se ingresara el email "<caso_prueba>" y se da click en continuar
    And se ingresa el numero de tarjeta "<caso_prueba>"
    And se ingresa el mes de vencimiento "<caso_prueba>"
    And se ingresa el anio de vencimiento "<caso_prueba>"
    And se ingresa el codigo de verificacion "<caso_prueba>"
    And se da click en el boton Pagar
    Then se verifica que se hizo la recarga correcta.

    Examples:
      | caso_prueba |
      |           1 |