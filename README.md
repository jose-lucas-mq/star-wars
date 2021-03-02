![Star Wars Wallpaper](https://i5.walmartimages.com/dfw/4ff9c6c9-b89d/k2-_ef8e5daa-006f-41f6-8ec9-f076bd7db9f3.v1.jpg?odnWidth=1360&odnHeight=410&odnBg=ffffff)

# Star Wars
## Este projeto tem como objetivo implementar os aprendizados adquiridos em Spring Boot e Orientação a Objetos

> Motivos pelos quais escolhi o tema Star Wars 🔎
 
* Eu amo toda a história e os personagens (salvo algumas exceções)
* É um tema que foi prazeroso de pensar e implementar
* Fez e faz parte da minha infância
* Durante a pesquisa encontrei uma grande comunidade de desenvolvedores com essa mesma ideia
* É um projeto que pode ser levado adiante e implementado uma GUI

## Entregáveis

- [x] Ter pelo menos uma classe abstrata que obrigue classes diferentes a implementarem um ou mais métodos.
- [x] Deve haver pelo menos duas classes que implementam esses métodos.
- [x] Deve haver um cálculo que retorne diferentes resultado para as classes (polimorfismo).
- [x] Contenha o EndPoint com método GET e um Path Param.
- [x] Listar os dados em JSON a partir da classe controller.
- [x] EndPoint de exclusão

## Diagrama de classes
![Diagrama de classes](/docs/star-wars-dc.png)

## Endpoints
> É basicamente aquele retorno que a API faz para conseguir se comunicar com outra

- Recurso para adição de um novo filme
``` 
http://localhost:8080/estudio/ 
```
1.  A classe **EstudioControle** é reponsável por fazer a manutenção das informações de um filme, sendo assim possui uma lista de filmes. Nele podemos adiquirir as informações de um filme, por meio do recurso citado acima (passando um indice de fime ou não), no fim das contas o retorno será parecido com esse:
 ```json
{
    "filmes": [
        {
            "titulo": "Uma nova esperança",
            "descricao": "A princesa Leia é mantida refém pelas forças imperiais comandadas por Darth Vader. Luke Skywalker e o capitão Han Solo precisam libertá-la e restaurar a liberdade e a justiça na galáxia.",
            "duracao": 125,
            "elenco": []
        }
    ]
}
```

3. Adicionando um elenco ao filme por meio de `http://localhost:8080/filme/{indexFilme}/`, podemos escolher a qual filme adicionaremos o elenco cadastro, como no exemplo, onde criei **protagonistas** e **antagonista** para o filme de indice zero. Esse recurso está em **FilmeController**, nele podemos manter as informações referentes ao elenco de cada filme, e foi por ele que que adicionei uma agregação de Elenco dentro da classe Filme. Assim fica o objeto Filme depois de adicionado um elenco nele:
```json 
{
    "filmes": [
        {
            "titulo": "Uma nova esperança",
            "descricao": "A princesa Leia é mantida refém pelas forças imperiais comandadas por Darth Vader. Luke Skywalker e o capitão Han Solo precisam libertá-la e restaurar a liberdade e a justiça na galáxia.",
            "duracao": 125,
            "elenco": [
                {
                    "elenco": [],
                    "nome": "antagonistas"
                },
                {
                    "elenco": [],
                    "nome": "protagonistas"
                }
            ]
        }
    ]
}
```

4. Continuando para a classe **ElencoController** temos a classe responsável por administrar os dados dos personagens e diretores, contando assim com uma lista de Comissão, já que os outros fazem a implementação dessa Interface. Pelo `http://localhost:8080/elenco/sith/{indexFilme}/{indexElenco}` conseguimos adicionar dados de um Sith em determinado elenco de um determinado Filme, despois de executado esse EndPoint e feito a consulta ao filme novamente vemos, que o Sith foi adicionado ao elenco de antagonistas do filme de indice zero.
 ```json
 {
    "filmes": [
        {
            "titulo": "Uma nova esperança",
            "descricao": "A princesa Leia é mantida refém pelas forças imperiais comandadas por Darth Vader. Luke Skywalker e o capitão Han Solo precisam libertá-la e restaurar a liberdade e a justiça na galáxia.",
            "duracao": 125,
            "elenco": [
                {
                    "elenco": [
                        {
                            "nome": "Darth Maul",
                            "tempoTela": 12,
                            "corSabre": "Vermelho",
                            "forca": 89,
                            "conviccao": "Orfão/Vingança",
                            "planetaNatal": "Dathomir",
                            "salarioBase": 1225.0,
                            "imortal": false,
                            "comissao": 1470.0
                        }
                    ],
                    "nome": "antagonistas"
                },
                {
                    "elenco": [],
                    "nome": "protagonistas"
                }
            ]
        }
    ]
}
```
Podemos fazer o mesmo para o Diretor e Jedi, aproveitando e adicionando um Elenco chamado produção, nele vamos incluir o Diretor.
```json
{
    "filmes": [
        {
            "titulo": "Uma nova esperança",
            "descricao": "A princesa Leia é mantida refém pelas forças imperiais comandadas por Darth Vader. Luke Skywalker e o capitão Han Solo precisam libertá-la e restaurar a liberdade e a justiça na galáxia.",
            "duracao": 125,
            "elenco": [
                {
                    "elenco": [
                        {
                            "nome": "Darth Maul",
                            "tempoTela": 12,
                            "corSabre": "Vermelho",
                            "forca": 89,
                            "conviccao": "Orfão/Vingança",
                            "planetaNatal": "Dathomir",
                            "salarioBase": 1225.5,
                            "imortal": false,
                            "comissao": 1470.6
                        }
                    ],
                    "nome": "antagonistas"
                },
                {
                    "elenco": [
                        {
                            "nome": "Obi Wan Kenobi",
                            "tempoTela": 91,
                            "corSabre": "Verde",
                            "forca": 92,
                            "conviccao": "Amor",
                            "planetaNatal": "Tatooine",
                            "salarioBase": 3225.0,
                            "nivelFidelidade": 9,
                            "comissao": 29347.5
                        }
                    ],
                    "nome": "protagonistas"
                },
                {
                    "elenco": [
                        {
                            "nome": "J J Abrams",
                            "avaliacao": 3,
                            "custoBase": 5841.2,
                            "comissao": 1752.36
                        }
                    ],
                    "nome": "producao"
                }
            ]
        }
    ]
}
```

5. Conluindo a ideia do projeto é que um filme possua uma lista de elencos, que por sua vez, possue uma lista de personagens, dessa maneira o sistema ficou mais lógico e legível, e muito mais aderente às regras de negócios inventadas aqui ;D

> Essa foi a conclusão e descrição do meu trabalho, foi uma experiência muito legal por ele em prática e conhecer cada vez mais o SprintBoot, tive que fazer muita pesquisa e pedir ajuda de muitas pessoas, mas no fim deu tudo certo, espero que gostem, estou ancioso para os próximos desafios envolvendo outras tecnologias, principalmente utilizando a comunicação entre o backend desenvolvido aqui com o front end que penso em criar sobre esse tema.

> Que a força esteja com vocês 😄⚡
