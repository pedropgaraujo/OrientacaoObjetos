public class Main {
    public static void main(String[] args) {
        //1 - Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
        Pessoa pessoa = new Pessoa();
        pessoa.exibeOla();

        //2 - Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
        Calculadora calculadora = new Calculadora();
        System.out.println("O dobro de 10 e: " + calculadora.dobrarNumero(10));
        //3 - Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para
        // exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        Musica musica = new Musica();
        musica.setTitulo("The Door");
        musica.setArtista("Ed. Sheeran");
        musica.anoLancamento=2022;
        musica.exibirFichaTecnica();
        musica.avaliarMusica(4.3);
        musica.avaliarMusica(3.3);
        musica.avaliarMusica(5.3);
        musica.calcularMediaAvaliacoes();
        musica.exibirFichaTecnica();
        //4 - Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
        Carro carro = new Carro();
//        carro.modelo="Audi";
//        carro.ano=2000;
//        carro.cor="Preto";
        carro.exibirFichaCarro();
        carro.calcularIdade();
        carro.exibirFichaCarro();
        //5 - Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe
        // Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
        Aluno aluno = new Aluno();
        aluno.setNome("Pedro");
        aluno.idade=28;
        aluno.exibeInformacoes();

        /*
    2 - Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters
    e setters para acessar e modificar esses atributos. Adicione um méto_do verificarIdade que imprime
    se a pessoa é maior de idade ou não.
 */
        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setIdade(15);
        idadePessoa.setNome("Manoel");
        System.out.println(String.format("A pessoa de nome %s e ela e %s", idadePessoa.getNome(), idadePessoa.verificarIdade()));

        /*
       3 - Desenvolva uma classe Produto com os atributos privados nome e preco.
        Utilize métodos getters e setters para acessar e modificar esses atributos.
        Adicione um méto_do aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
         */
        Produto produto = new Produto();
        produto.setNome("Monitor");
        produto.setPreco(100);
        System.out.println(String.format("Produto: %s Valor: %.2f", produto.getNome(), produto.getPreco()));
        produto.aplicarDesconto(37.8);
        System.out.println(String.format("Produto: %s Valor apos o desconto: %.2f", produto.getNome(), produto.getPreco()));


        /*
        Desenvolva uma classe Aluno com os atributos privados nome e notas.
        Utilize métodos getters e setters para acessar e modificar esses atributos.
        Adicione um méto_do calcularMedia que retorna a média das notas do aluno.
         */

        aluno.setNotas1(10);
        aluno.setNotas2(8);
        aluno.setNotas3(8);
        System.out.println(String.format("O aluno %s recebeu as notas %d, %d, %d, e sua media foi de %f",
                aluno.getNome(), aluno.getNotas1(), aluno.getNotas2(), aluno.getNotas3(), aluno.calcularMedia()));

        /*
        Desenvolva uma classe Livro com os atributos privados titulo e autor.
        Utilize métodos getters e setters para acessar e modificar esses atributos.
        Adicione um méto_do exibirDetalhes que imprime o título e o autor do livro.
         */
        musica.exibirDetalhes();

        carro.definirModelo("Chevet");
        carro.definirPrecos(200.0,156.0,560.0);
        carro.exibirInfo();

        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Animal animal = new Animal();

        animal.emitirSom();
        gato.arranharMoveis();
        gato.emitirSom();
        cachorro.abanarRabo();
        cachorro.emitirSom();

        ContaCorrente contaC = new ContaCorrente();
        contaC.consultarSaldo();
        contaC.setSaldoConta(150.2);
        contaC.consultarSaldo();
        contaC.cobrarTarifaMensal(20);
        contaC.consultarSaldo();
        contaC.sacar(30.2);
        contaC.consultarSaldo();
        contaC.depositar(100);
        contaC.consultarSaldo();

        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(50);

        CalculadoraSalaRetangular calculadora2 = new CalculadoraSalaRetangular();
        calculadora2.calcularArea(5, 8);
        calculadora2.calcularPerimetro(5, 8);

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7);

        ConversorTemperatura conversor2 = new ConversorTemperaturaPadrao();

        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = conversor2.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversor2.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");
    }
}