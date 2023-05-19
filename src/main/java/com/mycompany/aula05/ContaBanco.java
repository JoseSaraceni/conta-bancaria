package com.mycompany.aula05;
public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
   
    
    //Métodos especiais
    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    
     public void setNumConta(int n) {
        this.numConta = n;
    }
     
    public int getNumConta() {
        return this.numConta;
    }

    
    public void setTipo(String t) {
        this.tipo = t;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    
    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return this.dono;
    }
    
    
    public void setSaldo(float s) {
        this.saldo = s;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    
    public void setStatus(boolean st) {
        this.status = st;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    

   
       
    //Métodos personalizados 
   
    public void estadoAtual(){
        System.out.println("________________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$ " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    
    
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        }
        
        else if(t == "CP"){
            this.setSaldo(150);
        } 
        System.out.println("Conta aberta com sucesso");
    }
    
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            setStatus(true);
            System.out.println("Você ainda tem saldo na conta, não é possivel fecha-la");
        }
        else if(this.getSaldo() < 0){
            setStatus(true);
            System.out.println("Você tem saldo devedor na conta, não é possivel fecha-la");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
        else{
            System.out.println("Conta inativa, impossível acessar");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
            else{
                System.out.println("Saldo Insuficiente");
            }
        }
        else{
            System.out.println("Conta inativa, impossível acressar");
        }
        
    }
    
    public void pagarMensal(){
        float v = 0;
        if(this.getTipo()== "CC"){
            v = 12;
        }
        else if(this.getTipo()== "CP"){
            v = 20;
        }
        if(this.getStatus() == true){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por" + this.getDono());
            }
            else{
                System.out.println("Saldo insulficiente.");
            }
        }    
        else{
                System.out.println("Impossivel Pagar.");
        }
    }   
    
    
}

