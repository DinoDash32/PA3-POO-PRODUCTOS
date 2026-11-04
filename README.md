# PA3-POO-PRODUCTOS
Gestión de productos con ArrayList y Collections en Java

## Descripción del trabajo

Este proyecto es un programa en Java que gestiona productos en memoria usando colecciones. Elegimos productos porque tienen datos claros (id, nombre, categoría, precio y stock) y es un caso fácil de entender y de probar. El programa permite listar, agregar, buscar, eliminar y ordenar productos desde un menú en la consola.

## Cómo se guardan los datos

Los productos se guardan en un ArrayList<Producto> dentro de la clase GestorProductos. Cada producto es un objeto de la clase Producto, con su id, nombre, categoría, precio y stock.

Al iniciar, el método cargarDatosIniciales agrega 8 productos de ejemplo con add, y el método listar recorre la lista con un for para mostrarlos.

Usamos un ArrayList en lugar de un arreglo común porque crece solo cuando se agregan productos, y permite eliminar y ordenar con métodos ya hechos (remove y Collections.sort) sin manejar posiciones a mano.

- Donny Scrach Gaspar Araujo (Integrante 1): repositorio, clase Producto, lista inicial y listado de productos.
- Kathleen Carola Durand Quispe (Integrante 3): eliminar productos por id y ordenar la lista por precio y por nombre usando Collections.