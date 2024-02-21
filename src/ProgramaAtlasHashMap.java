import java.util.*;

public class ProgramaAtlasHashMap implements Comparator<String> {
    HashMap<String, String> atlas = new HashMap<>();

    Scanner teclado = new Scanner(System.in);

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

    public void anyadirEntradaAtlas() {
        System.out.print("Teclea un País: ");
        String opcion = teclado.next();
        System.out.print("Teclea una Capital: ");
        String opcion2 = teclado.next();
        atlas.put(opcion, opcion2);
    }


    public void mostrarContenidoActual() {
       for (String pais : atlas.keySet()) {
           String capital = atlas.get(pais);
           System.out.println("País: " + pais + "\tCapital: " + capital);
       }
       if (atlas.size() == 1) {
           System.out.println("Hay " + atlas.size() + " elemento en el Atlas");
       } else {
           System.out.println("Hay " + atlas.size() + " elementos en el Atlas");
       }
    }

    public void buscarEntradaAtlas() {
        System.out.print("Teclea un País: ");
        String opcion = teclado.next();
        if (atlas.containsKey(opcion)) {
            System.out.println("Capital: " + atlas.get(opcion));
        } else {
            System.out.println("De este país no se encuentra capital");
        }
    }

    public void modificarEntradaPais() {
        System.out.print("Teclea un País: ");
        String opcion = teclado.next();
        if (atlas.containsKey(opcion)) {
            System.out.print("Teclea modificación de capital: ");
            atlas.put(opcion, teclado.next());
        } else {
            System.out.println("De este país no se encuentra capital");
        }
    }

    public void ordenarPorNombrePais() {
        TreeMap<String, String> ordenar = new TreeMap<>(new ProgramaAtlasArrayList());
        ordenar.putAll(atlas);
        for (String pais : ordenar.keySet()) {
            String capital = ordenar.get(pais);
            System.out.println(pais + "(" + capital + ")");
        }
    }

    public void mostrarContenidoAtlasIterator() {
        Iterator<String> paisesI = atlas.keySet().iterator();
        Iterator<String> capitalesI = atlas.values().iterator();

        while (paisesI.hasNext()){
            System.out.println("País: "+paisesI.next()+"\t Capital: " + capitalesI.next());
        }
        System.out.println("Hay " + atlas.size() + " elementos en el Atlas");
    }

    public void eliminarEntrada() {
        System.out.print("Teclea un País a eliminar: ");
        String opcion = teclado.next();
        if (atlas.containsKey(opcion)) {
            atlas.remove(opcion);
            System.out.println(opcion + " eliminada del Atlas");
        } else {
            System.out.println("De este país no se encuentra capital");
        }
    }

    public void eliminarContenidoCompleto() {
        atlas.clear();
        System.out.println("Eliminado el Atlas por completo");
    }

}
