# Projeto_dev.ops

Projeto Java (Maven) com pipeline de CI no GitHub Actions: compila, executa os testes, gera o relatório e envia uma notificação por e-mail.

## O projeto
Aplicação Java que trabalha com dados de jogos armazenados em `games.json`, com um serviço simples de leitura de JSON e a classe `Main` como ponto de entrada. O foco do trabalho é o pipeline de integração contínua.

## Pipeline de CI (GitHub Actions)
Definido em `.github/workflows/maven.yml`. Dispara em push e pull request na branch `main` e também manualmente.

1. **Build:** configura o JDK 22 (Temurin) com cache do Maven, executa `mvn clean install -DskipTests` e publica o artefato gerado.
2. **Test:** executa `mvn clean test site` e publica o relatório de testes (`target/site`) como artefato.
3. **Notification:** após os testes, roda `scripts/sendemail.sh` para enviar um e-mail de aviso. O destinatário vem de um secret do repositório (`EMAIL_DESTINY`), em um ambiente protegido (`Send email`).

## Como rodar localmente
```bash
cd Projeto
mvn clean test
```

## Tecnologias
Java 22, Maven, GitHub Actions, Bash.
