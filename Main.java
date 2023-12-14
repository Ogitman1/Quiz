public class Main{
    public static void main(String[] args){
        Question[] questions = {
            new Question("Quando ocorreu o acidente de Chernobyl?", new String[]{"1986", "1987", "1992", "2000"}, 1),
            new Question("A radiação Alfa se trata de que tipo de radiação?", new String[]{"Radiação nuclear não ionizante", "Radiação Solar", "Radiação nuclear ionizante", "Raio X"}, 2),
            new Question("No corpo humano os lactobacilos estão localizados aonde?", new String[]{"Estômago", "Escroto", "Língua", "Pulmão"}, 0),
            new Question("Os vírus podem conter: ", new String[]{"RNA, DNA e uma capsula proteica", "RNA, DNA e célula", "RNA e orgãos"}, 0),
            new Question("Qual a diferença entre bactérias e vírus?", new String[]{"Os vírus possuem RNA e citoplasma e as bactérias não", "Nenhuma, ambos precisam de um hospedeiro pra se reproduzir!", "A bactéria infecta o hospedeiro para assim se reproduzir e o vírus se reproduz por fissão, uma forma de reprodução asexuada", "Bactérias possuem citoplasma, material genético e podem se produzir sozinhas e os vírus não"}, 1)



        };
    Quiz quiz = new Quiz(questions);
    quiz.runQuiz();
    }
    
}
