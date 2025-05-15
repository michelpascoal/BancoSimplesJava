# 📘 Projeto: Sistema de Contas Bancárias em Java

💡 Descrição

Este projeto é um sistema simples de contas bancárias desenvolvido em **Java** com uso de **POO (Programação Orientada a Objetos)**, incluindo:

* Classe abstrata `Conta`
* Herança: `ContaCorrente` e `ContaPoupanca`
* Sobrescrita de métodos (`getSaldo`, `setDeposito`)
* Uso de construtores, `Scanner`, controle de menu e tratamento básico de entrada
* Organização em **pacotes (`modelo`)**
* Documentação profissional com JavaDoc

---

🛠️ Funcionalidades

* ✅ Criar conta corrente (com taxa de serviço)
* ✅ Criar conta poupança (com rendimento por juros)
* ✅ Consultar saldo (com aplicação de taxa ou juros)
* ✅ Realizar depósito
* ✅ Menu interativo via console

---

🧱 Estrutura de Classes

```
modelo/
├── Conta.java             (Classe abstrata)
├── ContaCorrente.java     (Herda de Conta)
├── ContaPoupanca.java     (Herda de Conta)
├── Principal.java         (Classe principal com menu)
```

---

📌 Requisitos

* Java 8 ou superior
* Apache NetBeans (recomendado)
* Maven configurado (opcional)

---

▶️ Como Executar

1. Clonar o projeto:

```bash
git clone https://github.com/seuusuario/sistema-contas-java.git
cd sistema-contas-java
```

2. Compilar e rodar:

Se estiver usando NetBeans:

* Clique com o botão direito no projeto > `Run`
* Ou use o botão verde ▶️

Se preferir usar linha de comando com Maven:

```bash
mvn clean compile exec:java -Dexec.mainClass="modelo.Principal"
```

---

📂 Exemplo de Uso

```
--- Menu ---
1 - Criar conta
2 - Consultar saldo
3 - Depositar
0 - Sair
```

---

🧑‍💻 Autor

**Michel Pascoal**
📅 Maio de 2025
📘 Curso: Análise e Desenvolvimento de Sistemas

---

📄 Licença

Este projeto é livre para uso acadêmico e pessoal.

---
