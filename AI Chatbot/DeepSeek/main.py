import os 
from dotenv import load_dotenv
from langchain_groq import ChatGroq
from langchain_core.output_parsers import StrOutputParser
from langchain_community.document_loaders import TextLoader, PyPDFLoader
import re

load_dotenv()
GROQ_KEY = os.getenv('GROQ_KEY')
model = "deepseek-r1-distill-llama-70b"
deepseek = ChatGroq(api_key=GROQ_KEY, model = model)

parser = StrOutputParser()
deepseek_chain = deepseek | parser

# print(deepseek.invoke("Hello there"))

loader = PyPDFLoader('./vanilla-cake.pdf')
data = loader.load()

template = ("""
You are AI-powered chatbot designed to provide
informetion and assistance for people
based on the context provided to you only.
Don't in any way make things up.
context:{context}
question:{question}
""")

question = input("Ask something: ")
final_template = template.format(context = data, question = question)
result = deepseek_chain.invoke(final_template)


clean_result = re.sub(r"<think>.*?</think>", "", result, flags=re.DOTALL).strip()

print(f"Response: {clean_result}")