from flask import Flask, render_template, request, redirect

app = Flask(__name__)
todos = []

@app.route("/")
def index():
    
    return render_template("index.html", todos=todoz)  
@app.route("/add", methods=["POST"])
def add():
    todo = request.form.get("todo")
    if todo:
        todos.append(todo)
    return redirect("/")

import os

if __name__ == "__main__":
    port = int(os.environ.get("PORT", 10000))
    app.run(host='0.0.0.0', port=port)
