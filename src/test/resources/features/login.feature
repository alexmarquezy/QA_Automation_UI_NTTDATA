Feature: Autenticación de usuario
  Como un usuario de la página SauceDemo
  Quiero ingresar mis credenciales
  Para acceder al inventario de productos

  @LoginExitoso
  Scenario: Inicio de sesión exitoso
    Given que el usuario abre la página de SauceDemo
    When ingresa el usuario "standard_user" y la contraseña "secret_sauce"
    Then debería ver el título de la página "Products"