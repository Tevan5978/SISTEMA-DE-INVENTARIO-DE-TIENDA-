# SISTEMA DE INVENTARIO DE TIENDA
ACA PODRAS ENCONTRAR UN CODIGO HECHO EN JAVA PARA UN SEISTEMA DE INVENTARIO DE UNA MICRO EMPRESA

# Sistema de Inventario (Ejercicio 3)

Este programa es un sistema básico de inventario desarrollado en Java por consola. Permite gestionar productos, realizar ventas y llevar un registro de las mismas.

## 🧠 Funcionalidades

- Agregar productos al inventario
- Ver lista de productos
- Realizar ventas (con control de stock)
- Registrar ventas realizadas
- Mostrar historial de ventas
- Manejo de errores si no hay suficiente stock

## 🛠️ Tecnologías usadas

- Java
- Programación orientada a objetos
- HashMap (para almacenar productos)
- ArrayList (para almacenar ventas)
- Excepciones personalizadas

## ▶️ Cómo ejecutar

1. Abrir el proyecto en IntelliJ, Eclipse o cualquier IDE de Java
2. Ejecutar la clase `Main`
3. Usar el menú en consola para interactuar con el sistema

## 📌 Estructura del programa

- `Producto`: representa un producto con código, nombre, precio y stock
- `Venta`: guarda la información de cada venta realizada
- `StockInsuficienteException`: maneja errores cuando no hay stock suficiente
- `Main`: contiene el menú y la lógica principal

## ⚠️ Notas

- El sistema funciona completamente por consola
- Los datos no se guardan al cerrar el programa (no hay persistencia)
- Se recomienda ingresar correctamente los datos para evitar errores

## 👨‍💻 Autor

Trabajo realizado como parte del taller de programación en Java. 
Por parte de:
1. Estevan González
2. Juan José Quinchía
