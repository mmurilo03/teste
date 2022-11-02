class BMExercicio03{
    String nomeDoCorrentista;
    double saldo;
    boolean contaEspecial;

    void abreConta(String nome, double deposito, boolean especial){
        nomeDoCorrentista = nome;
        saldo = deposito;
        contaEspecial = especial;
    }

    void abreContaSimples(String nome){
        nomeDoCorrentista = nome;
        saldo = 0;
        contaEspecial = false;
    }

    void deposita(double valor){
        saldo += valor;
    }

    void retira(double valor){
        if (contaEspecial == false){
            if (valor <= saldo){
                saldo -= valor;
            }
        } else {
            saldo -= valor;
        }
    }

    void mostraDados(){
        System.out.println("O nome do correntista é: " + nomeDoCorrentista);
        if (saldo >= 0){
            System.out.println("O saldo é: " + saldo);
        } else {
            System.out.println("Alerta, seu saldo é negativo: " + saldo);
        }
        if(contaEspecial){
            System.out.println("A conta é especial");
        } else {
            System.out.println("A conta não é especial");
        }
    }

    public static void main(String[] args){
        BMExercicio03 contaSimples = new BMExercicio03();
        contaSimples.abreContaSimples("João");
        BMExercicio03 contaEspecial = new BMExercicio03();
        contaEspecial.abreConta("José", 0, true);

        contaSimples.deposita(100);
        contaSimples.mostraDados();
        contaEspecial.retira(50);
        contaEspecial.mostraDados();
    }
}