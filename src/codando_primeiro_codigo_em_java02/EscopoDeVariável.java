package codando_primeiro_codigo_em_java02;

public class EscopoDeVariável {

	public static void main(String[] args) {
		
		String frase;

        {
            frase = "Aprendi o conceito sobre escopo de variáveis em Java ";
        }

        String fraseInterna = "Os blocos mais internos ";
        frase = frase + fraseInterna;

        {
            // Aqui estamos apenas reatribuindo a variável existente
            fraseInterna = "portanto não podemos declarar outra variável com o mesmo nome ";
            frase = frase + fraseInterna;
        }

        {
            // Podemos criar uma nova variável com outro nome
            String outraFrase = "Entretanto podemos declarar variáveis com o mesmo nome em blocos diferentes.";
            frase = frase + outraFrase + " Agora já posso trabalhar conhecendo melhor escopo.";
        }

        System.out.println(frase);
	}

}
