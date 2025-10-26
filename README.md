# 🗒️ ToDo Kotlin  

Um aplicativo Android de lista de tarefas (To-Do List) desenvolvido em **Kotlin** com **Jetpack Compose**, seguindo práticas modernas de desenvolvimento Android e uma arquitetura organizada em camadas.

---

## 🎯 Visão Geral  
O projeto **ToDo Kotlin** tem como objetivo demonstrar:  
- a construção de interfaces declarativas com **Jetpack Compose**  
- a separação de responsabilidades entre **domínio**, **dados** e **UI**  
- o uso de **eventos de interface**, **ViewModel** e **State** para gerenciamento reativo  
- a aplicação de princípios de **Clean Architecture** de forma simples e didática  

---

## ✅ Funcionalidades  
- Exibição de tarefas em uma lista dinâmica  
- Inserção de novas tarefas com título e descrição  
- Marcação de tarefas como concluídas  
- Exclusão de tarefas existentes  
- Interface baseada em **Material Design 3**  
- Estrutura modular, facilitando a expansão e manutenção  

---

## 🧱 Estrutura do Projeto  
```

com.example.todolist/
│
├── domain/                   # Modelos de domínio (ex: Todo)
├── data/                     # Repositórios, entidades, DAOs
├── ui/                       # Telas, componentes e temas
│   ├── feature/              # Telas principais (listagem, adicionar/editar)
│   └── components/           # Componentes reutilizáveis (ex: TodoItem)
└── MainActivity.kt           # Ponto de entrada da aplicação

````

---

## 🔧 Tecnologias Utilizadas  
- **Kotlin** – linguagem principal  
- **Jetpack Compose** – construção declarativa de UI  
- **Material Design 3** – design moderno e responsivo  
- **ViewModel** – gerenciamento de estado  
- **Coroutines / Flow** – manipulação assíncrona de dados  
- (Opcional) **Room** – persistência de dados local  

---

## 🚀 Como Executar o Projeto  
1. Clone o repositório:  
   ```bash
   git clone https://github.com/BrunoMalosti/ToDo_Kotlin.git
   cd ToDo_Kotlin
   git checkout bruno
````

2. Abra o projeto no **Android Studio** (versão recomendada: Hedgehog ou superior).
3. Aguarde a sincronização do **Gradle**.
4. Execute o aplicativo em um **emulador** ou **dispositivo físico**.

---

## 🧩 Exemplo de Componente

```kotlin
@Composable
fun ListContent(
    todos: List<Todo>,
    modifier: Modifier = Modifier
) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { /* ação de inserir */ }) {
                Icon(Icons.Default.Add, contentDescription = "Adicionar tarefa")
            }
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = modifier.padding(paddingValues)
        ) {
            items(todos) { todo ->
                TodoItem(todo = todo)
            }
        }
    }
}
```

---

## 🧠 Próximos Passos

* Implementar persistência com Room Database
* Adicionar tela de edição detalhada
* Implementar sistema de notificação de tarefas
* Adicionar testes unitários e instrumentados
* Criar suporte a tema escuro e internacionalização

---

## 👤 Autor

**Bruno Malosti**
Servidor público e **Engenheiro da Computação**, com interesse em **desenvolvimento Android** e **processamento de dados**.
📍 Taubaté, SP
💼 [LinkedIn](https://www.linkedin.com/in/brunomalosti)

---

## 📄 Licença

Este projeto é de uso **educacional** e está disponível publicamente.
© 2025 Bruno Malosti — Todos os direitos reservados.

```
