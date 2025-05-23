
#🧠 RAG Local com Ollama

Este projeto implementa um pipeline de RAG (Retrieval-Augmented Generation) local utilizando o LangChain, armazenamento vetorial com ChromaDB, e LLMs executados via Ollama (como Mistral).

#📌 Objetivo

Permitir que modelos LLM executados localmente possam responder perguntas com base em documentos PDF locais, combinando recuperação semântica e geração de linguagem natural.

#⚙️ Funcionalidades

- Indexação vetorial de PDFs usando embeddings com sentence-transformers/all-MiniLM-L6-v2.
- Armazenamento persistente com Chroma.
- Consultas via CLI com respostas geradas por modelos Ollama.
- Validação automatizada de respostas via autoavaliação com outro LLM.

🧱 Estrutura

rag/
├── data/                        # PDFs que serão processados
├── chroma/                      # Persistência da base vetorial
├── get_embedding_function.py    # Função de embedding via HuggingFace
├── index_data.py                # Indexação de documentos e geração da base vetorial
├── query_data.py                # Consulta ao banco vetorial + resposta via Ollama
├── test_validation.py           # Validação automática de respostas
├── requirements.txt             # Dependências do projeto
└── README.md                    # Este arquivo

#▶️ Como Usar

1. Instalar dependências

    pip install -r requirements.txt

2. Preparar o modelo no Ollama

    ollama run mistral

3. Indexar PDFs

    Coloque seus arquivos .pdf na pasta data/ e execute:

    python index_data.py --reset

4. Fazer perguntas

    python query_data.py "Qual é o valor inicial em dinheiro no jogo Banco Imobiliário?"

5. Rodar testes automáticos

    pytest test_validation.py

#📦 Dependências

- langchain
- chromadb
- sentence-transformers
- pypdf
- ollama
- pytest
