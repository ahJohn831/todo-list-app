from flask import Flask, render_template, request, redirect

app = Flask(name)
todos = []

@app.route('/')
def index():
    return render_template('index.html', todos=todos)

@app.route('/add', methods=['POST'])
def add():
    todo = request.form.get('todo')
    if todo:
        todos.append(todo)
    return redirect('/')

if name == 'main':
    app.run(debug=True)