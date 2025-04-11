# Django Study 🚀

This repository is a study project dedicated to the **Django** framework, which allows for rapid and efficient web application development using Python.

## Objective 🎯

The goal of this project is to explore the functionalities of Django and learn to develop a web application.

## How to Run the Project 💻

## Project Structure 📁

```
├── .gitignore
├── README.md
└── ToDoList
    ├── accounts -> APP
    ├── api -> APP
    ├── backend 
    ├── db.sqlite3
    ├── manage.py
    ├── requirements.txt
    └── static
```

### Backend 👨‍💻

1. Clone the repository:
   ```bash
   git clone https://github.com/ppfuark/Django_Study.git
   ```

2. Navigate to the backend directory:
   ```bash
   cd ./Django_Study/EXERCISE/backend
   ```

3. Create and activate a virtual environment:
   ```bash
   python -m venv .venv
   .venv\Scripts\activate
   ```

4. Install the required dependencies:
   ```bash
   pip install -r requirements.txt
   ```

5. Run the database migrations:
   ```bash
   python manage.py migrate
   ```

6. Start the application:
   ```bash
   python manage.py runserver
   ```

### Frontend ⚛️

1. Navigate to the frontend directory (if applicable):
   ```bash
   cd ./frontend
   ```

2. Install dependencies (if applicable):
   ```bash
   npm install
   ```

3. Start the application (if applicable):
   ```bash
   npm run dev
   ```

---

## 🔍 Project Summary

**Django Study** is a practical project focused on building a task list web application using Django. It covers the development of models, views, and URL routing, allowing developers to learn how to create robust and scalable web applications with Django.