from flask import Flask, render_template

# Initialize the application
app = Flask(__name__)

# Define a root routing endpoint
@app.route('/')
def home():
    return "Hello, World!"

# Run the local development server
if __name__ == '__main__':
    app.run(debug=True)

