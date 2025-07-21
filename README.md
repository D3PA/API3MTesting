# 🛒 API 3 Mobile Testing

## 📱 Descripción

Este proyecto corresponde a la **Actividad 3** de Mobile Testing para Teclab, en el cual se desarrolla una aplicación Android utilizando **Kotlin**. La app tiene como objetivo conectarse a una API externa y mostrar un **listado de productos** disponibles en una tienda e-commerce.

## 🔗 API utilizada

La información de los productos es obtenida desde la siguiente URL:

```
https://www.jsonkeeper.com/b/MX0A
```

El formato del JSON contiene los siguientes campos:

- `id`
- `name`
- `description`
- `price`
- `currency`
- `in_stock`

## 🎯 Objetivos de la actividad

- Conectarse a una API externa RESTful.
- Recuperar y parsear datos en formato JSON.
- Mostrar los productos en un listado simple con nombre y precio.
- Implementar la lógica usando Kotlin y arquitectura MVVM.
- Cargar la entrega en un repositorio público de GitHub.

## 🧩 Tecnologías usadas

- Kotlin
- Android SDK
- Retrofit (para llamadas a la API)
- ViewModel y LiveData
- RecyclerView

## 📂 Estructura del proyecto

- `MainActivity.kt` → Actividad principal con la lógica de presentación.
- `ProductAdapter.kt` → Adaptador del RecyclerView para mostrar los productos.
- `ProductViewModel.kt` → Contiene la lógica de conexión a la API y gestión de datos.
- `product_item.xml` → Layout para cada producto en la lista.
- `activity_main.xml` → Layout principal.
- `themes.xml` → Personalización de colores y estilos.
