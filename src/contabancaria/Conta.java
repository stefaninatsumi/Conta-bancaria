
package contabancaria;

import javax.swing.JOptionPane;

class Conta {  
    
     public void atual(boolean logado){
         if(logado == true){
             int opcao;
             opcao= Integer.parseInt(JOptionPane.showInputDialog("Digite:\n" + "1 - Depósito\n" + "2 - Saque\n"+ "3 - Consulta de saldo\n"+ "4 - Sair"));
             switch(opcao){
                 case 1:
                  depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para depósito" )),this.logado);
                  break;
                 case 2:
                 sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para saque" )),this.logado);
                  break;
                 case 3: 
                 consultarSaldo(this.logado);
                  break;
                 case 4:
                 JOptionPane.showMessageDialog(null, "Obrigado!\n" + "Volte sempre!");
                     System.exit(0);//encerra o sistema
                  break;
                 default:
                     JOptionPane.showMessageDialog(null, "Opção inválida");
                     
             }
         }
         
     }
    
     public boolean logar(int numConta, int agencia, String nome){
         //dados para logar: Agencia=1234, Conta=1 e Senha=abc123
         if(agencia== 1234 && numConta == 1 && "abc123".equals(senha)){
             this.logado = true;
             //System.out.println("LOGADO");
              //System.out.println("Valor da variavel logado: " + this.isLogado());
             atual(this.logado);
         }
         else{
             JOptionPane.showMessageDialog(null, "DADOS INCORRETOS");
             this.logado = false;
         }
         return this.logado;
     }
     
     public void consultarSaldo(boolean logado){
       JOptionPane.showMessageDialog(null, "O saldo atual de sua conta é de: \n" + "R$"+ getSaldo());
       String opcao;
       opcao = JOptionPane.showInputDialog("Deseja realizar outra operação?\n"+ "s - sim\n"+"n - não");
       switch(opcao){
             case "s":   
           atual(this.logado);
                 break;
             case "n":
           JOptionPane.showMessageDialog(null, "Obrigado!\n"+ "Volte sempre!");
              System.exit(0);
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Opção invalida");
    }
     }
    
     public void depositar(double valor, boolean logado){
        this.saldo= this.saldo + valor;
        JOptionPane.showMessageDialog(null,"Operação realizada com sucesso");
        String opcao;
        opcao= JOptionPane.showInputDialog("Deseja realizar outra operação?\n" + "s - sim\n" + "n - não");
         switch(opcao){
             case "s":   
           atual(this.logado);
                 break;
             case "n":
           JOptionPane.showMessageDialog(null, "Obrigado!\n"+ "Volte sempre!");
              System.exit(0);
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Opção invalida");
    }
     }
    
    public void sacar(double valor, boolean logado){
        if(this.saldo> valor){
            this.saldo= this.saldo - valor;
            JOptionPane.showMessageDialog(null,"Operação realizada com sucesso");
        }
        else{
            JOptionPane.showMessageDialog(null,"Seu saldo é insuficiente para esta ação");
        }
         
        
        String opcao;
        opcao= JOptionPane.showInputDialog("Deseja realizar outra operação?\n" + "s - sim\n" + "n - não");
         switch(opcao){
             case "s":   
           atual(this.logado);
                 break;
             case "n":
           JOptionPane.showMessageDialog(null, "Obrigado!\n"+ "Volte sempre!");
              System.exit(0);
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Opção invalida");
    }
    }
    
    

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
    public int agencia;
    public int numConta;
    private String nome;
    private String senha;
    private double saldo;
    private boolean logado = false;
    
   
}