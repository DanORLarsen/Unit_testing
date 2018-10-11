public class Square {
    int hojde = 5;
    int brede =1;
    public Square(int hojde, int brede) {
        this.hojde = hojde;
        this.brede = brede;
    }

    public Square(int a) {
        this.hojde = a;
        this.brede = 5;
    }
    public Square() {
        this.hojde = 10;
        this.brede = 10;
    }

    public int getArea()
    {return (this.hojde*this.brede);}

    public int getPerimeter()
    {return this.hojde+this.hojde+this.brede+this.brede;}
}
