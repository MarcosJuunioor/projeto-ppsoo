
# Projeto de Padrões de Projeto de Software Orientado a Objetos - Sistema de Receita de Bolos


## Descrição
Trata-se de um sistema de receitas de bolos, onde o usuário escolhe o bolo que deseja fazer e passa alguns parâmetros para que as medidas de cada ingrediente sejam definidas dinamicamente. Por exemplo, caso o usuário diga que quer fazer um bolo de trigo de 1KG, será exibida uma receita com medidas proporcionais a um bolo desse peso. Também é opção do usuário definir se o bolo terá recheio ou não. Não foi utilizada nenhuma interface gráfica para o sistema, apenas terminal, visto que o tempo para desenvolvimento foi muito curto. Ou seja, isso ainda pode ser implementado. Porém, o projeto está bem organizado e demonstra bem a utilização dos padrões propostos. 

Os padrões utilizados foram o MVC, Decorator, Factory Method e Template Method. Optei por usar o MVC, basicamente, para dividir o projeto em camadas, o que deixou o sistema mais organizado. O decorator serviu bem para a classe Recheio. O Factory Method foi usado para criação de um método de fábrica de bolos abstrato, na classe "CursoDeBolos". Já o Template Method definiu a estrutura para criação de um bolo, com métodos abstratos, já que acada bolo tem sua forma de preparação específica.
 
## Objetivo
Ter um entendimento prático de como funcionam alguns dos padrões de projeto ensinados durante a disciplina. 

## Linguagem
O sistema foi desenvolvido em Java SE.
