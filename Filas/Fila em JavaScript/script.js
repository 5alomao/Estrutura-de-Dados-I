let minhaFila = new Fila(5);

function addFila(){
    const novo = document.getElementById("novoElemento");
    if(minhaFila.enqueue(novo.value) === true){
        alert("Inserido com sucesso");
        novo.value = "";
        novo.focus();
        console.log(minhaFila);
        mostrarFila();
    }
    else
        alert("Fila cheia!");
}

function removerFila(){
    if(minhaFila.isEmpty()){
        alert("Fila Vazia");
    }
    else{
        let rem = minhaFila.dequeue();
        alert("Elemento removido:"+rem);
        console.log("Elemento removido");
        mostrarFila();
    }
}

function mostrarFila(){
    const filaElemento = document.getElementById("listFila");
    filaElemento.textContent = minhaFila.toString();    
}

function first(){
    if(minhaFila.isEmpty()){
        alert("Fila Vazia");
    }
    else{
        let primeiro = minhaFila.first();
        alert("Primeiro Elemento:"+primeiro);
        console.log("Primeiro da Fila mostrado");
    }
}