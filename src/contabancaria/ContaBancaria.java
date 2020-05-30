
package contabancaria;

import javax.swing.JOptionPane;

public class ContaBancaria {

    public static void main(String[] args) {
        Conta banco= new Conta(); 
        JOptionPane.showMessageDialog(null, "Bem vindo ao Banco ETECMCM.\n" + "Entre com seus dados a seguir:");
         
        
        banco.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite sua agencia: ")));
        banco.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: ")));
        banco.setSenha(JOptionPane.showInputDialog("Digite sua senha: "));
        
        banco.logar(banco.getNumConta(), banco.getAgencia(),banco.getSenha());
        
        
        
    
    
}
}
