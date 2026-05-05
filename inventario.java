import java.util.*;


class StockInsuficienteException extends RuntimeException {
    public StockInsuficienteException(String msg) {
        super(msg);
    }
}

// ===== PRODUCTO =====
class Producto {
    String codigo;
    String nombre;
    double precio;
    int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad > stock) {
            throw new StockInsuficienteException("No hay suficiente stock");
        }
        stock -= cantidad;
    }
}

// ===== VENTA =====
class Venta {
    String nombreProducto;
    int cantidad;
    double total;

    public Venta(String nombreProducto, int cantidad, double total) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String toString() {
        return nombreProducto + " | Cantidad: " + cantidad + " | Total: $" + total;
    }
}

// ===== MAIN =====
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Producto> productos = new HashMap<>();
        ArrayList<Venta> ventas = new ArrayList<>();

        int op = 0;

        do {
            try {
                System.out.println("\n--- INVENTARIO ---");
                System.out.println("1. Agregar producto");
                System.out.println("2. Ver productos");
                System.out.println("3. Vender");
                System.out.println("4. Ver ventas");
                System.out.println("5. Salir");
                System.out.print("Opción: ");

                op = sc.nextInt();

                switch (op) {

                    case 1:
                        sc.nextLine();
                        System.out.print("Código: ");
                        String cod = sc.nextLine();

                        System.out.print("Nombre: ");
                        String nom = sc.nextLine();

                        System.out.print("Precio: ");
                        double precio = sc.nextDouble();

                        System.out.print("Stock: ");
                        int stock = sc.nextInt();

                        productos.put(cod, new Producto(cod, nom, precio, stock));
                        System.out.println("Producto agregado");
                        break;

                    case 2:
                        for (Producto p : productos.values()) {
                            System.out.println(p.codigo + " - " + p.nombre +
                                    " - $" + p.precio + " - Stock: " + p.stock);
                        }
                        break;

                    case 3:
                        sc.nextLine();
                        System.out.print("Código del producto: ");
                        String c = sc.nextLine();

                        Producto p = productos.get(c);

                        if (p == null) {
                            System.out.println("No existe");
                            break;
                        }

                        System.out.print("Cantidad: ");
                        int cant = sc.nextInt();

                        try {
                            p.vender(cant);
                            double total = cant * p.precio;

                            ventas.add(new Venta(p.nombre, cant, total));

                            System.out.println("Venta realizada. Total: $" + total);

                        } catch (StockInsuficienteException e) {
                            System.out.println(e.getMessage());
                        }

                        break;

                    case 4:
                        for (Venta v : ventas) {
                            System.out.println(v);
                        }
                        break;
                }

            } catch (Exception e) {
                System.out.println("Error, ingrese bien los datos");
                sc.nextLine();
            }

        } while (op != 5);

        sc.close();
    }
}
