    package com.elaparato.model;

    import jakarta.persistence.*;
    import lombok.Getter;
    import lombok.Setter;

    import java.util.Date;
    import java.util.List;

    @Getter
    @Setter
    @Entity
    public class Venta {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id_venta;

        @Temporal(TemporalType.DATE)
        private Date fecha;

        @ManyToMany(mappedBy = "listaVentas")
        private List<Producto> listaProductos;

        public Venta() {
        }

        public Venta(int id_venta, Date fecha, List<Producto> listaProductos) {
            this.id_venta = id_venta;
            this.fecha = fecha;
            this.listaProductos = listaProductos;
        }
    }
