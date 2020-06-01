
package projetobanco;

import javax.swing.JOptionPane;

public class Banco {
    public int numConta;
    public int agencia;
    public String nome;
    private String senha;
    private double saldo;
    private boolean logado = false;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
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
    
    public boolean logar(int agencia, int numConta, String senha){
        if (agencia==1234 && numConta == 1 && "beatriz1602".equals(senha)){
        this.logado = true;
           menu(this.logado);
    }
        else{
            JOptionPane.showMessageDialog(null, "Dados Incorretos!");
            this.logado = false;
        }
        return this.logado;
    }
    
    public void sacar(double valor, boolean logado){
        if(valor<saldo){
        this.saldo = this.saldo - valor;
        int opcao;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar outra operação? \n"
                + "1-Sim \n"
                + "2-Não"));
        switch (opcao){
            case 1:
             menu(this.logado);
             break;
                
            case 2:
              JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!: ");
                System.exit(0);
            break;
                
            default:
            JOptionPane.showMessageDialog(null, "Opção Inválida!: ");
        }
     }
        else{
            JOptionPane.showMessageDialog(null, "Não foi possível realizar essa operação. \n"
                    + "Seu saldo é menor do que o valor que deseja sacar! ");
      int opcao;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar outra operação? \n"
                + "1-Sim \n"
                + "2-Não"));
        switch (opcao){
            case 1:
             menu(this.logado);
             break;
                
            case 2:
              JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!: ");
                System.exit(0);
            break;
                
            default:
            JOptionPane.showMessageDialog(null, "Opção Inválida!: ");
    }
 
  }
                
}
    
    public void depositar(double valor, boolean logado){
         this.saldo = this.saldo + valor;
        int opcao;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar outra operação? \n"
                + "1-Sim \n"
                + "2-Não"));
        switch (opcao){
            case 1:
             menu(this.logado);
             break;
                
            case 2:
              JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!: ");
                System.exit(0);
            break;
                
            default:
            JOptionPane.showMessageDialog(null, "Opção Inválida!: ");
    }
 }
    
    public void consultarSaldo (boolean logado){
        JOptionPane.showMessageDialog(null, "O saldo atual da sua conta é de: \n"
                + "R$"+ getSaldo());
        int opcao;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar outra operação? \n"
                + "1-Sim \n"
                + "2-Não"));
        switch (opcao){
            case 1:
             menu(this.logado);
             break;
                
            case 2:
              JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!: ");
                System.exit(0);
            break;
                
            default:
            JOptionPane.showMessageDialog(null, "Opção Inválida!: ");
    }
 }
    
    
    public void menu(boolean logado){
        if (logado == true);
        
     
        
        int opcao;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Bem VIndo(a)!\n"
                + "Digite: \n"
                + "1 - Depositar \n"
                + "2 - Sacar \n"
                + "3 - Consultar Saldo \n"
                + "4 - Sair"));
        
       switch(opcao){
           case 1:
           depositar (Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar: ")), this.logado);
           break;
               
           case 2:
           sacar (Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar: ")), this.logado);
           break;
           
           case 3:
           consultarSaldo (this.logado);
           break;
               
           case 4:
           JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!: ");
           System.exit(0);
           break;
               
           default:
               JOptionPane.showMessageDialog(null, "Opção Inválida!");
       }
       
    }
    
}


