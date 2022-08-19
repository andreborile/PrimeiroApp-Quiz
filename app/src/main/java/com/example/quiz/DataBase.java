package com.example.quiz;

import java.util.ArrayList;

public final class DataBase{

    private ArrayList<String> questions = new ArrayList<>();
    private ArrayList<String> options = new ArrayList<>();
    private ArrayList<Character> answers = new ArrayList<>();

   public DataBase() {

        questions.add("João foi preso em flagrante por trazer consigo 10 papelotes e ter em depósito uma tonelada de cocaína, sem autorização ou em desacordo com determinação legal ou regulamentar. João deverá responder:");
        options.add("por um único crime de tráfico de drogas (art. 33 da Lei nº 11.343/06).");
        options.add("por dois crimes de tráfico de drogas (art. 33 da Lei nº 11.343/06), em concurso formal.");
        options.add("por dois crimes de tráfico de drogas (art. 33 da Lei nº 11.343/06), em concurso material.");
        options.add("por um único crime de porte ilegal de drogas (art. 28 da Lei nº 11.343/06), uma vez que distribuiu a substância gratuitamente.");
        answers.add('A');
        questions.add("O princípio da insignificância, que defende a não intervenção do Direito Penal para coibir ações típicas que causem ínfima lesão ao bem jurídico tutelado é afastado pela jurisprudência do Superior Tribunal de Justiça, por sua Súmula no 599, em relação aos crimes");
        options.add("de menor potencial ofensivo.");
        options.add("contra a Administração Pública.");
        options.add("contra o meio ambiente.");
        options.add("praticados contra as mulheres ou em condição de violência de gênero.");
        answers.add('B');
        questions.add("Caio pratica atos de execução do crime de homicídio. No entanto, antes de ocorrer a morte, impede que o resultado se produza. A conduta descrita configura:");
        options.add("tentativa.");
        options.add("desistência voluntária.");
        options.add("arrependimento posterior.");
        options.add("arrependimento eficaz.");
        answers.add('D');
        questions.add("No crime de favorecimento pessoal, dispõe o §2º, do art. 348, do Código Penal: \"Se quem presta o auxílio é ascendente, descendente, cônjuge ou irmão do criminoso, fica isento de pena\". Tal dispositivo é causa de:");
        options.add("exclusão de tipicidade.");
        options.add("exclusão de ilicitude.");
        options.add("exclusão de culpabilidade");
        options.add("exclusão de punibilidade.");
        answers.add('D');
        questions.add("João subtraiu um telefone celular, avaliado na quantia de R$ 800,00, pertencente à Maria, para si, mediante grave ameaça, mantendo-a em seu poder, restringindo sua liberdade durante 2 horas, a fim de garantir o êxito da subtração. João deverá responder por:");
        options.add("roubo e sequestro, em concurso formal.");
        options.add("roubo circunstanciado.");
        options.add("roubo e sequestro, em concurso material.");
        options.add("sequestro, já que este absorve o roubo.");
        answers.add('B');
        questions.add("Marcos, querendo matar seu vizinho, faz um disparo em sua direção. No entanto, não chega nem a lesioná-lo. Marcos:");
        options.add("responderá por homicídio tentado.");
        options.add("não responderá por crime nenhum, pois nem chegou a atingir seu vizinho.");
        options.add("responderá por tentativa de lesão corporal.");
        options.add("responderá lesão corporal consumada.");
        answers.add('A');
        questions.add("O roubo cometido com emprego de arma de brinquedo deve ser punido:");
        options.add("como roubo circunstanciado pelo uso de arma de fogo.");
        options.add("como roubo em concurso formal com crime de porte ilegal de arma.");
        options.add("como roubo simples.");
        options.add("como furto qualificado pelo uso de violência.");
        answers.add('C');
        questions.add("\"Alberto\", com 17 anos de idade, dispara contra a vítima que vem a morrer mais de um ano depois. \"Alberto\":");
        options.add("responderá pelo crime de homicídio, de acordo com as regras do Estatuto da Criança e do Adolescente.");
        options.add("não responderá por crime algum, pois é menor de idade.");
        options.add("responderá pelo crime de homicídio, de acordo com as regras do Código Penal, tendo em vista que já completou a maioridade.");
        options.add("responderá pelo crime de lesões corporais.");
        answers.add('A');
        questions.add("João foi preso em flagrante por trazer consigo 10 papelotes e ter em depósito uma tonelada de cocaína, sem autorização ou em desacordo com determinação legal ou regulamentar. João deverá responder:");
        options.add("por um único crime de tráfico de drogas (art. 33 da Lei nº 11.343/06).");
        options.add("por dois crimes de tráfico de drogas (art. 33 da Lei nº 11.343/06), em concurso formal.");
        options.add("por dois crimes de tráfico de drogas (art. 33 da Lei nº 11.343/06), em concurso material.");
        options.add("por um único crime de porte ilegal de drogas (art. 28 da Lei nº 11.343/06), uma vez que distribuiu a substância gratuitamente.");
        answers.add('A');
        questions.add("\"A\" para praticar o crime de estelionato falsifica vários documentos. \"A\" responde:");
        options.add("pelo crime de estelionato em concurso formal com o crime de falsificação.");
        options.add("apenas pelo crime de falsificação, pois este absorve o crime de estelionato.");
        options.add("apenas pelo crime de estelionato, pois este absorve o crime de falsificação.");
        options.add("pelo crime de estelionato em concurso formal com o crime de falsificação.");
        answers.add('C');
        questions.add("\"A\", com 17 anos, privou Maria de sua liberdade, mediante sequestro, liberando-a após um ano e meio. \"A\":");
        options.add("não responderá por crime algum, pois quando privou a vítima de sua liberdade era menor de idade.");
        options.add("não responderá por crime algum, pois liberou a vítima.");
        options.add("responderá pelo delito (art. 148, inciso III, do CP), de acordo com as regras do ECA.");
        options.add("responderá pelo delito (art. 148, inciso III, do CP), de acordo com as regras do CP.");
        answers.add('D');
        questions.add("O crime se diferença da contravenção penal:");
        options.add("pela natureza entre as infrações penais.");
        options.add("pela espécie de pena imposta.");
        options.add("pela capacidade psicológica do agente.");
        options.add("pelo requisito subjetivo da infração.");
        answers.add('B');


    }

    public Integer getQuestionsSize() {
        return this.questions.size();
    }

    public String getQuestions(int index) {
        return this.questions.get(index);
    }

    public String getOptions(int index) {
        return this.options.get(index);
    }

    public Character getAnswers(int index) {
          return this.answers.get(index);
     }
}
