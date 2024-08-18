package DSA;

public class Cookie {

    private  String color;

    public Cookie(String color){
        this.color = color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public  String getColor(){
        return  color;
    }

    public static void main(String[] args) {

        Cookie cookieOne = new Cookie("brown");

        Cookie cookieTwo = new Cookie("blue");

        cookieOne.setColor("green");
        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());

    }

}
