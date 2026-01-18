public class ThisExample {
    String name;
    Double dmg;
    
    public ThisExample(String name, Double dmg) {
        this.name = name;
        this.dmg = dmg;
    }
    
    public ThisExample(String name) {
        this(name, null);
    }
    
    public ThisExample(Double dmg) {
        this(null, dmg);
    }
    
    public ThisExample() {
        this(null, null);
    }
    
    public ThisExample returnSelf() {
        return this;
    }
}