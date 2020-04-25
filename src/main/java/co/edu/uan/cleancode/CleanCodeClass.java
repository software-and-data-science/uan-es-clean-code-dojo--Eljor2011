package co.edu.uan.cleancode;

// Esta clase se usa para mostrar mensajes genéricos
// Debería tener un nombre como PrintUtilsFacade
// Las clases no deberían tener impresas en su nombre la palabra Clase o Class, es redundante
// Los nombres de las clases deben ser sustantivos
// Los nombres de las clases podría mostrar qué patrón están aplicando
public class CleanCodeClass {

    // Un nombre poco descriptivo, en este caso se puede reemplazar por nombreUsuario, no importa que sea más largo
    // es mejor un nombre largo descriptivo, que uno corto y no descriptivo
    private String usuario;

    // Este constructor no se usa, podría eliminarse
    public CleanCodeClass () {
        this.usuario = System.getenv("USER");
    }

    // Usa nombres significativos para los parámetros de entrada
    // evita los nombres redundantes como String o Cadena para algo que es un String
    // adicionalmente podía complementarse con una función constructura y dejar privada la sobrecarga del constructor
    // un ejemplo de función constructora:
    //    public static PrintUtils WithUserName (String userName) {
    //        return new PrintUtils(userName);
    //    }
    public CleanCodeClass (String paramCadena) {
        this.usuario = paramCadena;
    }
    // Los métodos deben ser nombrados con verbos
    public void saludo() {
        imprimir("Hola " + this.usuario + "!");
    }

    //Jorge luis quintana
    // Los métodos deben ser nombrados con verbos
    // los parámetros de entrada deben ser nombrados descriptivamente
    // no use nombres de parámetros (o variables en general) que no puedan ser pronunciados
    public static void imprimir(String strTPrint) {
        System.out.println(strTPrint);
    }
}
