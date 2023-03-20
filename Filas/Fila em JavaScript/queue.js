class Fila{
    constructor(maxSize){
        this.maximo = maxSize;
        this.fila = [];
    }
//--------------------
    enqueue(elemento){
        if(this.fila.length === this.maximo)
            return false
        this.fila.push(elemento);
        return true;
    }
//--------------------
    dequeue(){
        let elemento = this.fila.shift();
        return elemento;
    }
//--------------------
    isEmpty(){
        return this.fila.length == 0;
    }
//--------------------
    toString(){
        return this.fila.toString();
    }
//--------------------
    first(){
        return this.fila[0];
    }
}
