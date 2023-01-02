var randomNumeber1 = Math.floor(Math.random() * 6) + 1;
var diceImage = "assets/dice" + randomNumeber1 + ".png";
document.querySelectorAll("img")[0].setAttribute("src", diceImage);

var randomNumeber2 = Math.floor(Math.random() * 6) + 1;
var diceImage = "assets/dice" + randomNumeber2 + ".png";
document.querySelectorAll("img")[1].setAttribute("src", diceImage);

if (randomNumeber1 > randomNumeber2) document.querySelector("h1").textContent = "Team 🅰️ wins 🚩";
else if (randomNumeber1 < randomNumeber2) document.querySelector("h1").textContent = "Team 🅱️ wins 🚩";
else document.querySelector("h1").textContent = "!! It's DRAW 'Roll again' !!"