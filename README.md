#  Sistema RPG Naruto - Missões Ninja

Um sistema interativo baseado no universo de Naruto, onde você pode escolher entre diferentes ninjas e realizar missões emocionantes através da linha de comando.

##  Sobre o Projeto

Este é um jogo de RPG textual ambientado no mundo de Naruto, desenvolvido em Java com programação orientada a objetos. O jogador pode escolher entre dois ninjas principais (Sasuke Uchiha e Naruto Uzumaki) e embarcar em missões de diferentes níveis de dificuldade.

##  Funcionalidades

-  **Seleção de Personagens**: Escolha entre Sasuke Uchiha e Naruto Uzumaki
-  **Sistema de Missões**: Missões de diferentes níveis (C e D)
-  **Habilidades Especiais**: Cada ninja possui suas habilidades únicas
-  **Sistema de Escolhas**: Decisões que afetam o resultado das missões
-  **Múltiplos Finais**: Diferentes desfechos baseados nas suas escolhas

##  Personagens Disponíveis

###  Sasuke Uchiha
- **idade**: 17 anos
- **Habilidade Especial**: Sharingan
- **Missões Disponíveis**:
  - Missão da Ponte (Nível C) - Proteger o construtor da ponte na Aldeia da Névoa
  - Missão do Amuleto (Nível D) - Encontrar o colar perdido da Tsunade

### 🌪️ Naruto Uzumaki
- **Idade**: 18 anos
- **Habilidade Especial**: Multi Clones das Sombras
- **Missões Disponíveis**:
  - Resgate do Cachorro (Nível D) - Encontrar um cachorro perdido
  - Investigação do Furto (Nível C) - Investigar um roubo na banca de jornal

##  Como Executar

### Pré-requisitos
- Java Development Kit (JDK) 24 ou superior
- IDE compatível (IntelliJ IDEA, Eclipse, VS Code)

### Executando o projeto

1. **Clone ou baixe o projeto**
```bash
git clone [seu-repositorio]
cd Projetos
```

2. **Compile o projeto**
```bash
javac -d out src/SemiProjeto/*.java
```

3. **Execute o programa**
```bash
java -cp out SemiProjeto.Main
```

##  Como Jogar

1. **Inicie o programa** e escolha a opção "1 - Ninjas"
2. **Selecione seu ninja**:
   - 1 - Sasuke Uchiha
   - 2 - Naruto Uzumaki
3. **Escolha uma missão** disponível para seu personagem
4. **Tome decisões** durante a missão que afetarão o resultado
5. **Complete a missão** e veja o desfecho baseado em suas escolhas

##  Exemplo de Gameplay

```
======= Escolha uma Opção =======
1 - Ninjas 
2 - Sair 
=================================
Digite sua Escolha: 1

1 - Sasuke
2 - Naruto Uzumaki
Escolha seu ninja e sua missão: 1

Seu nome é: Sasuke
Sua idade é: 17 anos
Minha habilidade especial é o Sharingan!

========= MISSOES ===========
1 - Ajudar o Mestre de obra chegar na ponte da Aldeia da Nevoa (Nivel C)
2 - Ir com o time 7 achar o colar da Tsunade que o Naruto perdeu (Nivel D)
```

##  Estrutura do Código

### Classes Principais

- **`Main.java`**: Classe principal com o menu e controle do fluxo do jogo
- **`Ninjas.java`**: Classe abstrata base para todos os ninjas
- **`Uchihas.java`**: Implementação específica para Sasuke Uchiha
- **`Uzumaki.java`**: Implementação específica para Naruto Uzumaki

### Conceitos Aplicados

-  **Programação Orientada a Objetos**
-  **Herança** (Uchihas e Uzumaki herdam de Ninjas)
-  **Encapsulamento** (getters e setters)
-  **Polimorfismo** (método toString sobrescrito)
-  **Classes Abstratas**
-  **Estruturas de Controle** (switch-case, loops)

##  Sistema de Missões

### Missões do Sasuke
- **Missão da Ponte (Nível C)**: Envolve combate e decisões estratégicas
- **Missão do Amuleto (Nível D)**: Focada em exploração e sorte

### Missões do Naruto
- **Resgate do Cachorro (Nível D)**: Teste de coragem em ambiente sombrio
- **Investigação do Furto (Nível C)**: Missão de investigação com combate

##  Melhorias Futuras

- [ ] Sistema de save/load de progresso
- [ ] Mais personagens jogáveis (Sakura, Kakashi, etc.)
- [ ] Sistema de experiência e level up
- [ ] Inventário e itens
- [ ] Missões em grupo/time
- [ ] Interface gráfica
- [ ] Sistema de ranking de ninjas
- [ ] Mais variedade de missões
- [ ] Sistema de relacionamentos entre personagens

##  Tecnologias Utilizadas

- **Java 24**
- **IntelliJ IDEA** (IDE de desenvolvimento)
- **Git** (controle de versão)

##  Conceitos de Programação Demonstrados

- Programação Orientada a Objetos
- Herança e Polimorfismo
- Encapsulamento
- Classes Abstratas
- Arrays e Collections
- Estruturas de Controle
- Entrada e Saída de Dados
- Modularização de Código

##  Créditos

Projeto desenvolvido como estudo de programação orientada a objetos em Java, inspirado no universo criado por Masashi Kishimoto.

---

**Que a Vontade do Fogo esteja com você!** 🔥🍃
