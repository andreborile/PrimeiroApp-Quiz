package com.example.quiz;

public class Questions {

    private String[] questions =    {
            "2021. MPDFT – Ministério Público do Distrito Federal e Territórios – Promotor de Justiça Adjunto\n" +
                    "Para a CULPABILIDADE NORMATIVA, adotada em nosso sistema penal:",
            "2021.  FGV – OAB – Ordem dos Advogados do Brasil – Advogado – XXXII Exame de Ordem Unificado\n" +
                    "João, em 17/06/2015, foi condenado pela prática de crime militar próprio. Após cumprir a pena respectiva, João, em 30/02/2018, veio a praticar um crime de roubo com violência real, sendo denunciado pelo órgão ministerial. No curso da instrução criminal, João reparou o dano causado à vítima, bem como, quando interrogado, admitiu a prática do delito. No momento da sentença condenatória, o magistrado reconheceu a agravante da reincidência, não reconhecendo atenuantes da pena e nem causas de aumento e de diminuição da reprimenda penal.\n" +
                    "Considerando as informações expostas, em sede de apelação, o advogado de João poderá requerer",
            " O princípio da insignificância, que defende a não intervenção do Direito Penal para coibir ações típicas que causem ínfima lesão ao bem jurídico tutelado é afastado pela jurisprudência do Superior Tribunal de Justiça, por sua Súmula no 599, em relação aos crimes",
            "“Espécie” de legítima defesa que a doutrina afirma ser inexistente, pois a situação fática não é reconhecida como legítima defesa e não exclui a ilicitude de ação:"
    };

    private String[][] options =    {
            {"O excesso exculpante pode redundar tanto em erro de proibição indireto quanto em inexigibilidade de conduta diversa.",
                    "O juízo, que reprova o autor do fato, resulta da inferência de que a conduta contraria o Direito",
                    "A inimputabilidade do doente mental se configura com a enfermidade diagnosticada em exame de sanidade mental, atestando a contemporaneidade da causa.",
                    "Não é possível, para a fixação da pena, que o juízo de reprovação incida sobre o autor do fato, pela sua condução de vida."},
            {"o reconhecimento da atenuante da confissão e da causa de diminuição de pena do arrependimento posterior, mas não o afastamento da agravante da reincidência.",
                    "o reconhecimento das atenuantes da reparação do dano e da confissão, mas não o afastamento da agravante da reincidência.",
                    "o reconhecimento das atenuantes da confissão e da reparação do dano e o afastamento da agravante da reincidência.",
                    "o reconhecimento da atenuante da confissão e da causa de diminuição de pena do arrependimento posterior, bem como o afastamento da agravante da reincidência."},
            {"de menor potencial ofensivo.",
                    "contra a Administração Pública.",
                    "contra o meio ambiente.",
                    "praticados contra as mulheres ou em condição de violência de gênero."},
            {"legítima defesa em proteção a quem consente com a agressão de terceiro a bem indisponível.",
                    "legítima defesa putativa.",
                    "legítima defesa própria.",
                    "legítima defesa recíproca."}
    };

    private int[] answers =      {
            1,
            3,
            2,
            4
    };

    // GETTERS
    public String[] getQuestions() {

        return questions;
    }

    public String[][] getOptions() {

        return options;
    }

    public int[] getAnswers() {
        return answers;
    }
}

