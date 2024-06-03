    package com.elaparato.model;

    import com.fasterxml.jackson.annotation.JsonIgnore;
    import jakarta.persistence.*;
    import lombok.Getter;
    import lombok.Setter;

    import java.util.List;

    @Getter
    @Setter
    @Entity
    public class Producto {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String nombre;
        private String descripcion;
        private int precio;
        private int cantidad;

        @ManyToMany
        @JoinTable(
                name = "producto_lista_ventas",
                joinColumns = @JoinColumn(name = "lista_productos_id"),
                inverseJoinColumns = @JoinColumn(name = "lista_ventas_id_venta")
        )
        @JsonIgnore
        private List<Venta> listaVentas;

        public Producto() {
        }

        public Producto(int id, String nombre, String descripcion, int precio, int cantidad, List<Venta> listaVentas) {
            this.id = id;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
            this.cantidad = cantidad;
            this.listaVentas = listaVentas;
        }
    }