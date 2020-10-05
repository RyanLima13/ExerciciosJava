
package exercicio01;


public class ContaBancaria {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBancaria(){
        this.numConta = 0;
        this.tipo = " sem tipo conta ";
        this.dono = " sem dono";
        this.saldo = 0;
        this.status = false;
    }
    public int getNumConta(){
       return this.numConta;

    }
    public void setNumConta(int num){
        this.numConta = num;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean v){
        this.status = v;
    }
    
    public void fecharConta(){
        if(this.saldo == 0){
            System.out.println(" conta fechada");
        }else{
            System.out.println(" voce nao pode fechar sua conta");
        }
    }
    public void depositar(){
        if(this.saldo >= 20){
            System.out.println(" voce pode depositar");
        }else{
            System.out.println(" voce nao pode depositar");
        }
    }
    public void sacar(){
        if(this.saldo >= this.saldo){
            System.out.println(" voce pode sacar");
        }else{
            System.out.println(" nao pode sacar ");
        }
    }
    public void pagarMensal(){
        if(this.saldo >= 20){
            System.out.println(" pagamento  mensal pago");
        }else{
            System.out.println("saldo insuficiente");
        }
        
    }
    public void status(){
        System.out.println(" sua conta e " + getNumConta());
        System.out.println(" o dipo de sua conta e " + getTipo());
        System.out.println(" o nome do dono da conta e " + getDono());
        System.out.println(" o saldo de sua conta e " + getSaldo());
        System.out.println(" sua conta estar " + getStatus());
    }
}
