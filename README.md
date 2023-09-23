## POO - Desafio

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial, Aparelho Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java


## UML da diagramação das classes e interfaces

<div>
    <div>
        <h3>Iphone</h3>
        <h4>
            <ul>
                <li>modelo: String</li>
                <li>numeroSerie: String</li>
            </ul>
        </h4>
        <h5>
            <ul>
                <li>+ ligar()</li>
                <li>+ atender()</li>
                <li>+ iniciarCorreioVoz()</li>
                <li>+ exibirPagina()</li>
                <li>+ adicionarNovaAba()</li>
                <li>+ atualizarPagina()</li>
                <li>+ tocar()</li>
                <li>+ pausar()</li>
                <li>+ selecionarMusica()</li>
            </ul>
        </h5>
    </div>
    <div>
        <h5>Implements</h5>
        <ol>|</ol>
        <ol>v</ol>
    </div>
    <div>
        <h3>ReprodutorMusical</h3>
        <h5>
            <ul>
                <li>+ tocar()</li>
                <li>+ pausar()</li>
                <li>+ selecionarMusica()</li>
            </ul>
        </h5>
    </div>
    <div>
        <ol>^</ol>
        <ol>|</ol>
    </div>
    <div>
        <h3>AparelhoTelefonico  </h3>
        <h5>
            <ul>
                <li>+ ligar()</li>
                <li>+ atender()</li>
                <li>+ iniciarCorreioVoz()</li>
            </ul>
        </h5>
    </div>
    <div>
        <ol>^</ol>
        <ol>|</ol>
    </div>
    <div>
        <h3>NavegadorInternet     </h3>
        <h5>
            <ul>
                <li>+ exibirPagina()</li>
                <li>+ adicionarNovaAba()</li>
                <li> + atualizarPagina()</li>
            </ul>
        </h5>
    </div>
</div>

