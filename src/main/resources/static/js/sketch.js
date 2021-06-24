//Este código asume que las librerías de P5.js ya están cargadas.
//Esta función se ejecuta una sola vez al inicio del script.
//calcular color
let points = {pointsarr : [], colorRGB: };

let timerID = setInterval(
    () => checkPoints(),
    5000
);

function checkPoints(){
    let msg= points;
    points = {pointsarr : []};

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
        fill(0,0,0);
        ellipse(mouseX, mouseY, 20, 20);
        points.pointsarr.push([mouseX,mouseY])
    }
    if (mouseIsPressed === false) {
        fill(255,255,255);
    }

}
//areglo 3 posiciones
function colorRGB(){
    var color = "("+generarNumero(255)+"," + generarNumero(255) + "," + generarNumero(255) +")";
    return "rgb" + color;
}

function regenerar() {
    for (var i = 0; i < 10; i++) {

    }

}

function borrar() {
    points.clearRect(0, 0, canvas.width, canvas.height);
}

