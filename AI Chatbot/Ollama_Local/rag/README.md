
# 🧠 RAG Local com Ollama

Este projeto implementa um pipeline de **RAG (Retrieval-Augmented Generation)** local, utilizando [LangChain](https://github.com/langchain-ai/langchain), armazenamento vetorial com [ChromaDB](https://www.trychroma.com/), e modelos de linguagem executados via [Ollama](https://ollama.com/) (ex: Mistral).

---

## 📌 Objetivo

Permitir que modelos LLM executados localmente respondam perguntas com base em documentos PDF locais, combinando **recuperação semântica** com **geração de linguagem natural**.

---

## ⚙️ Funcionalidades

- ✅ Indexação vetorial de PDFs usando `sentence-transformers/all-MiniLM-L6-v2`
- 💾 Armazenamento persistente com ChromaDB
- 💬 Interface de consulta via linha de comando (CLI)
- 🔍 Validação automatizada de respostas com LLM auxiliar

---

## 🧱 Estrutura de Pastas

```
rag/
├── data/                        # PDFs que serão processados
├── chroma/                      # Persistência da base vetorial
├── get_embedding_function.py    # Função de embedding via HuggingFace
├── index_data.py                # Indexação dos documentos PDF
├── query_data.py                # Consulta + geração de respostas com Ollama
├── test_validation.py           # Validação automatizada das respostas
├── requirements.txt             # Dependências do projeto
└── README.md                    # Documentação
```

---

## ▶️ Como Usar

### 1. Instalar as dependências

```bash
pip install -r requirements.txt
```

### 2. Preparar o modelo no Ollama

Certifique-se de que o Ollama está instalado e execute o modelo desejado:

```bash
ollama run mistral
```

### 3. Indexar documentos PDF

Coloque seus arquivos `.pdf` na pasta `data/` e execute:

```bash
python index_data.py --reset
```

### 4. Fazer perguntas

Use o CLI para fazer perguntas aos seus documentos:

```bash
python query_data.py "Qual é o valor inicial em dinheiro no jogo Banco Imobiliário?"
```

### 5. Rodar testes automatizados

Opcional: execute testes de validação automática com:

```bash
pytest test_validation.py
```

---

## 📦 Dependências

- `langchain`
- `chromadb`
- `sentence-transformers`
- `pypdf`
- `ollama`
- `pytest`

---

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.
