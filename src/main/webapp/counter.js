let addButton = document.getElementById('counterAddButton');
let counter = document.getElementById('counter');

addButton.onclick = function addNumber() {
    const request = new XMLHttpRequest();
    request.open("PATCH", "./counter");
    request.send();

    fetch('./counter')
        .then(response => response.text())
        .then(data => {
            counter.innerHTML = data;
    });
};
