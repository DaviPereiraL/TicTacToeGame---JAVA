# TicTacToeGame

Este é um simples jogo da velha (Tic-Tac-Toe) desenvolvido em Java, utilizando conceitos de Programação Orientada a Objetos (POO). O jogo pode ser jogado no console, com a opção de jogar contra outro jogador ou contra a máquina.

## Estrutura do Projeto

- **Pacote:** `tictactoe`
- **Classes:**
  - `Player`: Representa os jogadores (humano ou máquina).
  - `Board`: Representa o tabuleiro do jogo e gerencia a lógica de verificação de vitória, empate e atualizações.
  - `Game`: Controla o fluxo do jogo, alternância de turnos, e verificação das condições de vitória ou empate.

## Funcionalidades

- Jogar contra outro jogador no mesmo console.
- Jogar contra a máquina, que realiza movimentos aleatórios.
- Verificar condições de vitória ou empate.
- Interface simples no console para inserir jogadas.

## Como Executar

1. **Clonar o repositório:**

    ```bash
    git clone https://github.com/DaviPereiraL/TicTacToeGame---JAVA.git
    ```

2. **Navegar até o diretório do projeto:**

    ```bash
    cd TicTacToeGame
    ```

3. **Compilar as classes Java:**

    ```bash
    javac tictactoe/*.java
    ```

4. **Executar o jogo:**

    ```bash
    java tictactoe.Game
    ```

5. **Instruções:**
    - Após iniciar o jogo, você será perguntado se deseja jogar contra o computador (`sim/nao`).
    - O jogo irá alternar turnos entre os jogadores, pedindo para que informem a linha e a coluna em que desejam jogar (valores de `0` a `2`).
    - O jogo termina quando um dos jogadores vence ou o tabuleiro está cheio (empate).

## Exemplo de Uso

```bash
Jogar contra o computador? (sim/nao): sim
Vez de Jogador 1 (X):
Informe a linha (0-2): 1
Informe a coluna (0-2): 1
```
## Requisitos

  - Java: Certifique-se de ter o JDK instalado em seu sistema. Este projeto foi desenvolvido e testado com o Java 8+.

## Imagens do sistema

https://github.com/user-attachments/assets/e6be31f6-42d6-4944-afb2-db3f3f924f50


## Contribuições
Contribuições são bem-vindas! Se você tiver alguma sugestão ou encontrar algum bug, fique à vontade para abrir uma issue ou enviar um pull request. Projeto para fins de estudo acadêmico em Java.

