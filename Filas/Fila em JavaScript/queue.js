class Fila{
    constructor(maxSize){
        this.maximo = maxSize;
        this.fila = [];
    }

    enqueue(elemento){
        
        if(this.fila.length === this.maximo)
            return false
        this.fila.push(elemento);
        return true;
    }

    dequeue(){
        const elemento = this.fila.shift;
        return elemento;
    }
    
}
