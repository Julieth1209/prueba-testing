#Autor Julieth Bermudez

Feature: la tienda kabal quiere seleccionar las diferentes prendas de temporada,
  agregarlas a su compra, navegar las diferentes secciones,
  registrarse, detallar sus datos para el envió de sus productos a domicilio.


  Scenario: el usuario realiza una compra  con varios productos
    Given  el usuario se registra en la plataforma
    When el usuario  selecciona los productos de compra
    Then se verifica la compra con exito



