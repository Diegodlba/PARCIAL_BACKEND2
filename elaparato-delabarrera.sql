INSERT INTO producto ( nombre, descripcion, precio, cantidad)
VALUES 
  ('Lavadora Samsung', 'Lavadora de carga frontal con capacidad de 15 kg', 1299.99, 10),
  ('Refrigeradora LG', 'Refrigeradora de 3 puertas con capacidad de 25 pies cúbicos', 1599.99, 5),
  ('Televisor Sony', 'Televisor LED 4K de 55 pulgadas con Android TV', 899.99, 15),
  ('Horno eléctrico Whirlpool', 'Horno eléctrico de acero inoxidable con capacidad de 6.4 pies cúbicos', 799.99, 7),
  ('Aspiradora Dyson', 'Aspiradora inalámbrica con tecnología Cyclone V10', 499.99, 20);

INSERT INTO venta (fecha)
VALUES
  ('2023-01-15'),
  ('2023-02-05'),
  ('2023-03-10'),
  ('2023-04-20'),
  ('2023-05-01');

INSERT INTO producto_lista_ventas (lista_productos_id, lista_ventas_id_venta)
VALUES
  (1, 1),
  (2, 1),
  (3, 1),
  (1, 2),
  (4, 2),
  (2, 3),
  (5, 3),
  (3, 3),
  (1, 4),
  (2, 4),
  (5, 4),
  (3, 5),
  (4, 5);
