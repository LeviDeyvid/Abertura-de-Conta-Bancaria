package banco;

public class Conta {
      
   public int numero_Conta;
   public String dono;
   protected String tipo;
   private double saldo;
   private boolean status_de_conta;
   
   public Conta(){
       this.saldo = 0;
       this.status_de_conta = false;      
   }
   
   public void estado_atual_da_conta (){
       System.out.println("Conta:"+this.Getnumero_conta());
       System.out.println("Tipo:"+this.Getipo());
       System.out.println("Dono:"+this.Getdono());
       System.out.println("Saldo:"+this.Getsaldo());
       System.out.println("Status atual da conta: "+this.Getstatus_de_conta());
   }
    
   public void abrirconta(String t){
    this.Setipo(t);
    this.Setstatus_de_conta(true);
       if (t == "CC" ) {
           this.Setsaldo(50);
       }else if (t == "CP") {
           this.Setsaldo(150);
       }
 System.out.print("Conta aberta com sucesso!\n");
          
      }
public void fechar(){
    if (this.Getsaldo() > 0) {
        System.out.println("A conta nao pode ser encerrado,consta saldo.");
    }else if (this.Getsaldo()< 0) {
        System.out.println("Conta nao pode ser encerra,consta debito");
    }
    }
public void depositar(double v){
    if (this.Getstatus_de_conta()) {
        this.Setsaldo(this.Getsaldo()+v);
        System.out.println("transação efetuada com sucesso na conta de: "+this.Getdono());
    }else{
        System.out.println("Não foi possivel efetuar deposito, a conta esta fechada.");
    }
        
}
public void saque (double v){
    if (this.Getstatus_de_conta()){
        if (this.Getsaldo()>= 0){
            this.Setsaldo(this.Getsaldo()-v);
            System.out.println("Saque realizada na conta de:"+this.Getdono());
        }else{
            System.out.println("Saldo insuficiente para efetuar saque");
        }
        }else{
        System.out.println("Erro,Saque nao efetuado conta esta fechada.");
    }
}
public void mensalidade(){
    int v = 0;
    if (this.Getipo()== "CC") {
        v = 12;
    }else if (this.Getipo()=="CP") {
       v = 20; 
    }
    if (this.Getstatus_de_conta()) {
        this.Setsaldo(this.Getsaldo()-v);
        System.out.println("A mensalidade foi paga com sucesso!");
    }else{
        System.out.println("Impossivel paga a mensalidade,conta esta fechada.");
    }
}
public void setnumero_conta(int n){
    this.numero_Conta = n;
}
   public int Getnumero_conta(){
       return this.numero_Conta;
   }
   public void Setdono(String d){
       this.dono = d;
   }
   public String Getdono(){
       return this.dono;
   }
   public void Setipo (String t){
       this.tipo = t;
   }
   public String Getipo (){
       return this.tipo;   
   }
   public void Setsaldo(double s){
       this.saldo = s;
   }
   public double Getsaldo(){
       return this.saldo;
   }
   public void Setstatus_de_conta(boolean st){
       this.status_de_conta = st;  
   }
   public boolean Getstatus_de_conta (){
       return this.status_de_conta;   
   }
}
   