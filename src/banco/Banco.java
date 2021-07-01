package banco;

public class Banco {

    public static void main(String[] args) {
        Conta usuario1 = new Conta();
        usuario1.Setdono("Levi Deyvid");
        usuario1.setnumero_conta(0123456);
        usuario1.abrirconta("CC");
        usuario1.estado_atual_da_conta();
    }  
}
