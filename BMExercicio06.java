public class BMExercicio06{
    String nomeDoCorrentista;
    double saldo;
    boolean contaEspecial;

    void abreConta(String nome, double deposito, boolean especial){
        nomeDoCorrentista = nome;
        saldo = deposito;
        contaEspecial = especial;
    }

    void abreContaSimples(String nome, double deposito){
        if (deposito >= 100){
            nomeDoCorrentista = nome;
            saldo = deposito;
            contaEspecial = false;
        } else {
            System.out.println("O deposito não é o suficiente");
        }

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
        BMExercicio06 contaSimples = new BMExercicio06();
        contaSimples.abreContaSimples("João", 70);
        contaSimples.abreContaSimples("João", 120);
        BMExercicio06 contaEspecial = new BMExercicio06();
        contaEspecial.abreConta("José", 0, true);

        contaSimples.deposita(100);
        contaSimples.mostraDados();
        contaEspecial.retira(50);
        contaEspecial.mostraDados();
    }
}
