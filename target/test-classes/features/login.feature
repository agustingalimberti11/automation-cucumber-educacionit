# language: es
Característica: Login de New Tours

  Escenario: Ingreso con usuario válido
    Dado que el usuario está en la página de New Tours
    Cuando ingresa el usuario "tutorial" y la clave "tutorial"
    Entonces el login es exitoso
