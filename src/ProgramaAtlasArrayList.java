import java.util.*;

public class ProgramaAtlasArrayList implements Comparator<String>{

    private final ArrayList<String> paises = new ArrayList<>();
    private final ArrayList<String> capitales = new ArrayList<>();

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

    Scanner teclado = new Scanner(System.in);
    public void anyadirEntradaAtlas() {
        System.out.print("Teclea un País: ");
        paises.add(teclado.next());
        System.out.print("Teclea una Capital: ");
        capitales.add(teclado.next());
        System.out.println("Nueva entrada incorporada");
    }

    public void mostrarContenidoActual() {
        for (int i = 0; i < paises.size(); i++){
            System.out.println("País: " + paises.get(i) + "\tCapital: " + capitales.get(i));
        }
        if (capitales.size() == 1) {
            System.out.println("Hay " + capitales.size() + " elemento en el Atlas");
        }else {
            System.out.println("Hay " + capitales.size() + " elementos en el Atlas");
        }
    }

    public void buscarEntradaAtlas() {
        System.out.print("Teclea un País: ");
        int posicion = paises.indexOf(teclado.next());
        if (posicion != -1) {
            System.out.println("Capital: " + capitales.get(posicion));
        } else {
            System.out.println("De este país no se encuentra capital");
        }
    }

    public void modificarEntradaPais() {
        System.out.print("Teclea un País: ");
        int posicion = paises.indexOf(teclado.next());
        if (posicion != -1) {
            System.out.print("Teclea modificación de capital: ");
            capitales.set(posicion, teclado.next());
        } else {
            System.out.println("De este país no se encuentra capital");
        }


    }

    public void ordenarPorNombrePais() {
        TreeMap<String, String> orden = new TreeMap<>(new ProgramaAtlasArrayList());
        for (int i = 0; paises.size() > i; i++){
            orden.put(paises.get(i), capitales.get(i));
        }
        for (String paises : orden.keySet()) {
            String capitales = orden.get(paises);
            System.out.println(paises + "(" + capitales + ")");
        }
    }

    public void mostrarContenidoAtlasIterator() {
        Iterator<String> paisI = paises.iterator();
        Iterator<String> capitalI = capitales.iterator();

        while (paisI.hasNext() && capitalI.hasNext()) {
            System.out.println("País: " + paisI.next() + "\tCapital: " + capitalI.next());
        }
        System.out.println("Hay " + capitales.size() + " elementos en el Atlas");
    }

    public void eliminarEntrada() {
        System.out.print("Teclea un País a eliminar: ");
        String opcion = teclado.next();
        int posicion = paises.indexOf(opcion);
        if (posicion != -1) {
            paises.remove(posicion);
            capitales.remove(posicion);
            System.out.println(opcion + " eliminada del Atlas");
        }else {
            System.out.println("No se encuentra el país en el Atlas");
        }

    }

    public void eliminarContenidoCompleto() {
        paises.clear();
        capitales.clear();
        System.out.println("Eliminado el Atlas por completo");
    }

}
