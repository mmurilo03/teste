public class BMExercicio05 {

     //aqui é a parte dos jogadores
     String nomeTime;
     String[] jogadores;

     //aqui é a parte do campeonato
     String nomeCampeonato;
     int pontosTime;
     String prêmio;

     void competirCampeonato(String nomeTime, String nomeCampeonato){
        System.out.println(nomeTime + " Está participando de " + nomeCampeonato);
     }

     int vencerPartida(int pontosTime){
        return pontosTime += 3;
     }

     void vencerCampeonato(String nomeTime){
        System.out.println(nomeTime + " Venceu o campeonato!");
     }

    public static void main(String[] args) {
        BMExercicio05 time1 = new BMExercicio05();

        String[] jogadores = {"Murilo", "Vinicius Jr.", "Fuleco", "SIMON", "Flávio caça-rato", "Endo", "Oliver Tsubasa", "Sakamoto", "Starlight Anya", "Eli", "Chris Rock"};

        time1.nomeTime = "Flamengo 2";
        time1.jogadores = jogadores;

        BMExercicio05 campeonato1 = new BMExercicio05();

        campeonato1.nomeCampeonato = "Hunger Games";
        campeonato1.pontosTime = 0;
        campeonato1.prêmio = "Survive";

        time1.competirCampeonato(time1.nomeTime, campeonato1.nomeCampeonato);
        time1.vencerPartida(campeonato1.pontosTime);
        time1.vencerCampeonato(time1.nomeTime);
    }
}