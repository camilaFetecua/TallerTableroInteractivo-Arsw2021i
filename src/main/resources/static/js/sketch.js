//Este código asume que las librerías de P5.js ya están cargadas.
//Esta función se ejecuta una sola vez al inicio del script.
//calcular color

    const r = Math.floor(Math.random()*240)+10;          // Random between 0-255
    const g = Math.floor(Math.random()*240)+10;          // Random between 0-255
    const b = Math.floor(Math.random()*240)+10;


let points = {pointsarr : [],color:[r,g,b]};

let timerID = setInterval(
    () => checkPoints(),
    5000
);

function checkPoints(){
    let msg= points;
    points = {pointsarr : [],color:[r,g,b]};

    //fetch("/points?payload= "+ JSON.stringify(points))
    //  .then(res => console.log(res))
    fetch("/points",{
        method: 'POST',
        headers:{
            "Content-type": 'aplication/json'
        },
        body: JSON.stringify(msg)
    })
        .then(res => res.json())
        .then(result => console.log(result));

}

function setup() {
    createCanvas(640, 480);
}
// Esta función se ejecuta repetidas veces indefinidamente.
function draw() {
    if (mouseIsPressed === true) {
        fill(r,g,b);
        ellipse(mouseX, mouseY, 20, 20);
        points.pointsarr.push([mouseX,mouseY])
    }
    if (mouseIsPressed === false) {
        fill(255,255,255);
    }

}


function borrar() {
    points.clearRect(0, 0, canvas.width, canvas.height);
}