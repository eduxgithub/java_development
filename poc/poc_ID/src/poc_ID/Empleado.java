package poc_ID;

public class Empleado {
	private static int code=1;
	private int ID;

    public Empleado() {
    	ID = code++;
    }

    public void mostrarID() {
        System.out.println("idEmpleado = " + ID);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
