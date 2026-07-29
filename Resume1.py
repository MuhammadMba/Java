from flask import Flask, render_template_string

app = Flask(__name__)

@app.route("/")
def resume():
    return render_template_string("""
<!DOCTYPE html>
<html>
<head>
    <title>Resume</title>
    <style>
        body{
            font-family: Arial, sans-serif;
            background:#f2f2f2;
        }
        .resume{
            width:600px;
            margin:40px auto;
            background:white;
            padding:20px;
            border-radius:10px;
            box-shadow:0 0 10px gray;
        }
        h1{
            color:darkblue;
            text-align:center;
        }
        h2{
            color:blue;
            border-bottom:2px solid gray;
        }
    </style>
</head>
<body>

<div class="resume">
    <h1>Muhammad Ali</h1>
    <p><b>Email:</b> ali@email.com</p>
    <p><b>Phone:</b> 123-456-7890</p>

    <h2>Education</h2>
    <p>BS Computer Science</p>

    <h2>Skills</h2>
    <ul>
        <li>Python</li>
        <li>Java</li>
        <li>HTML</li>
        <li>CSS</li>
    </ul>

    <h2>Experience</h2>
    <p>Student Developer</p>
</div>

</body>
</html>
""")

if __name__ == "__main__":
    app.run(debug=True)