# Java — Estudos e Exercícios

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Sem dependências](https://img.shields.io/badge/depend%C3%AAncias-nenhuma-success?style=flat-square)

Repositório com meus estudos de **Java**, organizado por tópico e seguindo a ordem em que fui aprendendo cada assunto. Cada pasta corresponde a um tema e contém tanto os exemplos das aulas quanto exercícios que resolvi por conta própria para fixar o conteúdo.

Todo o código é escrito à mão, sem frameworks — o foco aqui é a base da linguagem: sintaxe, lógica de programação e orientação a objetos.

## Tecnologias

- Java 21 (JDK)
- Sem dependências externas — compila e roda com `javac` / `java`

## Como rodar

Cada pasta é um *package*. Para compilar e executar qualquer exercício:

```bash
# Compila o package escolhido para a pasta bin/
javac -encoding UTF-8 -d bin metodos/*.java

# Executa a classe desejada (nome completo: package.Classe)
java -cp bin metodos.Ex3BancoMetodos
```

Trocando `metodos` pelo package e `Ex3BancoMetodos` pela classe, o mesmo comando serve para qualquer exercício do repositório.

## Estrutura

Os tópicos estão listados na ordem de aprendizado — do básico ao mais avançado:

### Fundamentos da linguagem

| Package | Tópico |
| --- | --- |
| [`numerosaleatorios/`](numerosaleatorios/) | Classe `Random` — sorteios, médias e simulador de dado |
| [`entradadados/`](entradadados/) | Classe `Scanner` — leitura de dados do teclado |
| [`constantes/`](constantes/) | `final` — constantes e valores imutáveis |
| [`operadoresatribuicao/`](operadoresatribuicao/) | Operadores de atribuição (`+=`, `-=`, `*=`, `/=`) |
| [`operadoresrelacionais/`](operadoresrelacionais/) | Operadores relacionais e comparações |
| [`incrementodecremento/`](incrementodecremento/) | Incremento e decremento, pré e pós-fixado |

### Controle de fluxo

| Package | Tópico |
| --- | --- |
| [`condicionalifelse/`](condicionalifelse/) | Estruturas condicionais `if` / `else if` / `else` |
| [`ternario/`](ternario/) | Operador ternário |
| [`loopwhile/`](loopwhile/) | Laço de repetição `while` |
| [`revisaogeral/`](revisaogeral/) | Revisão geral — exercícios combinando todos os tópicos acima |

### Orientação a objetos

| Package | Tópico |
| --- | --- |
| [`orientacaoobjetos/`](orientacaoobjetos/) | Classes, atributos e instanciação de objetos |
| [`metodos/`](metodos/) | Métodos, parâmetros e valores de retorno |
| [`metodossobrecarga/`](metodossobrecarga/) | Sobrecarga de métodos (*method overloading*) |
| [`getset/`](getset/) | Encapsulamento — atributos privados, *getters* e *setters* |

### Estruturas e biblioteca padrão

| Package | Tópico |
| --- | --- |
| [`classemath/`](classemath/) | Classe `Math` — potência, raiz, hipotenusa e arredondamento |
| [`arrays/`](arrays/) | Arrays — declaração, preenchimento, acesso por índice e percurso |

## Convenções

- **Packages** em minúsculo, sem acentos e sem separadores (padrão Java).
- **Classes e arquivos** em `PascalCase`, com o nome do arquivo sempre igual ao da classe pública.
- Arquivos com prefixo `Ex1`, `Ex2`... são exercícios resolvidos; os demais são exemplos e classes de apoio das aulas.
- Todo o repositório compila sem erros com `javac -encoding UTF-8`.

## Outros repositórios de estudo

| Repositório | Conteúdo |
| --- | --- |
| [python-estudos](https://github.com/Math2710/python-estudos) | Fundamentos de Python — tipos, operadores e laços |
| [html-estudos](https://github.com/Math2710/html-estudos) | HTML5 semântico — estrutura, tabelas, formulários e mídia |
| [css-estudos](https://github.com/Math2710/css-estudos) | CSS — cores, tipografia, layout e componentes |
| [estudos-csharp](https://github.com/Math2710/estudos-csharp) | Fundamentos de C# e .NET |

## Autor

**Matheus Westphal** — estudante de Engenharia de Software, em formação para desenvolvimento back-end com Java, Spring e SQL.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-matheus--westphal-0A66C2?style=flat-square&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/matheus-westphal-65a264201)
[![GitHub](https://img.shields.io/badge/GitHub-Math2710-181717?style=flat-square&logo=github&logoColor=white)](https://github.com/Math2710)

---

Repositório em constante atualização, conforme avanço nos estudos.
