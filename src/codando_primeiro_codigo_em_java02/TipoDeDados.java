package codando_primeiro_codigo_em_java02;

public class TipoDeDados {

	public static void main(String[] args) {
		
		byte idade = 22, quantidadeDeDependentes = 1;
        short anoDeNascimento = 2000, mes = 5, dia = 15;
        long quantidade = 1500;
        float altura = 1.78f, largura = 0.65f, aliquota = 0.38f;
        double preço = 1.99;

        System.out.println("Idade: " + idade + " Anos");
        System.out.println("Quantidade de dependente: " + quantidadeDeDependentes);
        System.out.println("Data de nascimento: " + dia + "/" + mes + "/" + anoDeNascimento);
        System.out.println("Quantidade " + quantidade);
        System.out.println("altura: " +  altura + " Largura: " + largura + " aliquota: " + aliquota);
        System.out.println("Preço: R$ " + preço);

	}

}

