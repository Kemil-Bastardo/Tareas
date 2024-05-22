import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MenuOpciones {
    public static void main(String[] args){
        int opcionIndice = 0;
        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        do {
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());
                switch (opcionIndice){
                    case 1:
                        System.out.println("Su usuario se a actualizado correctamente");
                        break;
                    case 2:
                        System.out.println("Su usuario se a eliminado correctamente");
                        break;
                    case 3:
                        System.out.println("Su usuario se a agregado correctamente");
                        break;
                    case 4:
                        System.out.println("Listado de usuarios");
                        break;
                    case 5:
                        System.out.println("Haz salido con exito!");
                        break;
                }
                
            }
        }while (opcionIndice!=5);

    }
}
