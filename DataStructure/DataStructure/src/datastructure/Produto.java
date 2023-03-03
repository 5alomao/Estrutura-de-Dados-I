 package datastructure;

public class Produto {
    private String desc;
    private int qnt;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
    @Override
    public String toString(){
        
        return this.getDesc() + " : " + this.getQnt();
    
    }
}
