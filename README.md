# guessing_game


O projeto documentado consiste em um "jogo de adivinhação". 

---
### Funcionamento

1)  É solicitado ao jogador escolher um nível de dificuldade:

<img width="575" height="275" alt="image" src="https://github.com/user-attachments/assets/4741dc19-db69-4e56-8f64-d4bf653b31d0" />

2)  Assim que o nível de dificuldade é selecionado, o jogador passa a inserir suas suposições:

<img width="578" height="409" alt="image" src="https://github.com/user-attachments/assets/ab438209-b5b9-4afb-9f41-c97ff18e7627" />
<br>
<br>
Deve-se destacar que o número correto é gerado automaticamente pelo sistema, por meio da classe Random, a cada vez que o código é compilado para bytecode (se for requisitado apenas a interpretação, o número gerado permanecerá o mesmmo).
<br>
<img width="305" height="36" alt="image" src="https://github.com/user-attachments/assets/f770968c-7204-485a-b270-d487de111287" /><br>
<img width="434" height="25" alt="image" src="https://github.com/user-attachments/assets/0162bc36-1200-4e19-848a-75a3238b2f68" />
<br>
<br>
3)  Se o número inserido pelo usuário estiver acima ou abaixo do valor, o programa avisará para auxiliar o jogador a acertar sua aposta:
<br>
<br>
<img width="635" height="740" alt="image" src="https://github.com/user-attachments/assets/64e44154-7b50-4d77-a9a1-5be574314df2" />

---
### Como a pontuação é gerada? 

A depender do nível de dificuldade escolhido, o jogador começará com a seguinte quantidade de pontos: 
<br>
Nível fácil: 100 pontos<br>
Nível médio: 200 pontos<br>
Nível difícil: 300 pontos<br>
<br>
A cada erro o jogador perde 10 pontos, e sua pontuação final é mostrada na tela assim que o software é concluído.



