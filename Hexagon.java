public class Hexagon
{
    private double side;
    private int area;

    public static void main(String[] args)
    {
        Hexagon h= new Hexagon();
        h.setSide(5);
        h.getArea();
        h.toString();
        Hexagon p= new Hexagon();
        p.setSide(5);
        p.getArea();
        p.toString();
        h.compareTo();

    }
    public Hexagon(int side, int area)
    {
        this.side=side;
        this.area=area;
    }
    public void setArea(int area)
    {
        this.area=area;
        area=3*side*side;
    }
    public int getArea()
    {
        return area;
    }
    public void setSide(int side)
    {
        this.side=side;
    }
    public int getSide()
    {
        return side;
    }
    public String toString()
    {
        String t = "This hexagon has a side length of" + side+ ", and an area of "+area;
        return t;
    }
   
    public boolean equals(Hexagon hex)
    {
        if(p.getArea()==h.getArea())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int compareTo (Hexagon hex)
    {
        if (p.getArea()<h.getArea())
        {
            return -1;
        }
        if (p.getArea()==h.getArea())
        {
            return 0;
        }
        if (p.getArea()>h.getArea())
        {
            return +1;
        }
    }
}